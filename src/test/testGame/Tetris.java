package test.testGame;

import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;
/**
 * ClassName: Tetris
 * Package: test.testGame
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/17 - 21:24
 * Version - v 1.0
 */
public class Tetris extends JFrame implements KeyListener {
    private static final int WIDTH = 10;
    private static final int HEIGHT = 20;
    private static final int BLOCK_SIZE = 30;
    private static final Color[] COLORS = {
            Color.CYAN, Color.BLUE, Color.ORANGE,
            Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.RED
    };

    private int[][] board = new int[HEIGHT][WIDTH];
    private int[][] currentPiece;
    private int currentX, currentY;
    private int currentColor;
    private boolean gameOver = false;
    private int score = 0;

    private Timer timer;
    private Random random = new Random();

    // 所有俄罗斯方块形状
    private final int[][][] SHAPES = {
            {{1, 1, 1, 1}}, // I
            {{1, 1}, {1, 1}}, // O
            {{1, 1, 1}, {0, 1, 0}}, // T
            {{1, 1, 1}, {1, 0, 0}}, // L
            {{1, 1, 1}, {0, 0, 1}}, // J
            {{0, 1, 1}, {1, 1, 0}}, // S
            {{1, 1, 0}, {0, 1, 1}}  // Z
    };

    public Tetris() {
        setTitle("俄罗斯方块");
        setSize(WIDTH * BLOCK_SIZE + 150, HEIGHT * BLOCK_SIZE + 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(this);

        initGame();

        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!gameOver) {
                    moveDown();
                }
            }
        });
        timer.start();
    }

    private void initGame() {
        // 清空游戏板
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                board[y][x] = 0;
            }
        }

        gameOver = false;
        score = 0;
        spawnNewPiece();
    }

    private void spawnNewPiece() {
        int shapeIndex = random.nextInt(SHAPES.length);
        currentPiece = SHAPES[shapeIndex];
        currentColor = shapeIndex + 1;
        currentX = WIDTH / 2 - currentPiece[0].length / 2;
        currentY = 0;

        // 检查游戏是否结束
        if (checkCollision(currentX, currentY, currentPiece)) {
            gameOver = true;
            timer.stop();
            JOptionPane.showMessageDialog(this, "游戏结束! 得分: " + score);
            initGame();
            timer.start();
        }
    }

    private boolean checkCollision(int x, int y, int[][] piece) {
        for (int py = 0; py < piece.length; py++) {
            for (int px = 0; px < piece[py].length; px++) {
                if (piece[py][px] != 0) {
                    int newX = x + px;
                    int newY = y + py;

                    if (newX < 0 || newX >= WIDTH || newY >= HEIGHT) {
                        return true;
                    }

                    if (newY >= 0 && board[newY][newX] != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void mergePiece() {
        for (int py = 0; py < currentPiece.length; py++) {
            for (int px = 0; px < currentPiece[py].length; px++) {
                if (currentPiece[py][px] != 0) {
                    board[currentY + py][currentX + px] = currentColor;
                }
            }
        }
    }

    private void clearLines() {
        int linesCleared = 0;

        for (int y = HEIGHT - 1; y >= 0; y--) {
            boolean lineComplete = true;
            for (int x = 0; x < WIDTH; x++) {
                if (board[y][x] == 0) {
                    lineComplete = false;
                    break;
                }
            }

            if (lineComplete) {
                linesCleared++;
                // 下移上面的行
                for (int ny = y; ny > 0; ny--) {
                    System.arraycopy(board[ny - 1], 0, board[ny], 0, WIDTH);
                }
                // 清空顶行
                for (int x = 0; x < WIDTH; x++) {
                    board[0][x] = 0;
                }
                y++; // 重新检查当前行
            }
        }

        // 计算得分
        if (linesCleared > 0) {
            score += linesCleared * 100;
        }
    }

    private void rotatePiece() {
        int[][] newPiece = new int[currentPiece[0].length][currentPiece.length];

        for (int y = 0; y < currentPiece.length; y++) {
            for (int x = 0; x < currentPiece[y].length; x++) {
                newPiece[x][currentPiece.length - 1 - y] = currentPiece[y][x];
            }
        }

        if (!checkCollision(currentX, currentY, newPiece)) {
            currentPiece = newPiece;
        }
    }

    private void moveDown() {
        if (!checkCollision(currentX, currentY + 1, currentPiece)) {
            currentY++;
        } else {
            mergePiece();
            clearLines();
            spawnNewPiece();
        }
        repaint();
    }

    private void moveLeft() {
        if (!checkCollision(currentX - 1, currentY, currentPiece)) {
            currentX--;
            repaint();
        }
    }

    private void moveRight() {
        if (!checkCollision(currentX + 1, currentY, currentPiece)) {
            currentX++;
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // 绘制游戏板
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if (board[y][x] != 0) {
                    g.setColor(COLORS[board[y][x] - 1]);
                    g.fillRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
                    g.setColor(Color.BLACK);
                    g.drawRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
                }
            }
        }

        // 绘制当前方块
        if (currentPiece != null) {
            for (int y = 0; y < currentPiece.length; y++) {
                for (int x = 0; x < currentPiece[y].length; x++) {
                    if (currentPiece[y][x] != 0) {
                        g.setColor(COLORS[currentColor - 1]);
                        g.fillRect((currentX + x) * BLOCK_SIZE, (currentY + y) * BLOCK_SIZE,
                                BLOCK_SIZE, BLOCK_SIZE);
                        g.setColor(Color.BLACK);
                        g.drawRect((currentX + x) * BLOCK_SIZE, (currentY + y) * BLOCK_SIZE,
                                BLOCK_SIZE, BLOCK_SIZE);
                    }
                }
            }
        }

        // 绘制分数
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("分数: " + score, WIDTH * BLOCK_SIZE + 20, 30);

        // 绘制游戏结束信息
        if (gameOver) {
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("游戏结束!", WIDTH * BLOCK_SIZE / 2 - 80, HEIGHT * BLOCK_SIZE / 2);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (gameOver) {
            return;
        }

        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                moveRight();
                break;
            case KeyEvent.VK_DOWN:
                moveDown();
                break;
            case KeyEvent.VK_UP:
                rotatePiece();
                repaint();
                break;
            case KeyEvent.VK_SPACE:
                // 硬降落
                while (!checkCollision(currentX, currentY + 1, currentPiece)) {
                    currentY++;
                }
                mergePiece();
                clearLines();
                spawnNewPiece();
                repaint();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Tetris tetris = new Tetris();
            tetris.setVisible(true);
        });
    }
}
