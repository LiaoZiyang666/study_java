package test.test03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Random;

/**
 * ClassName: SnakeGame
 * Package: test.test03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 11:06
 * Version - v 1.0
 */
public class SnakeGame extends JFrame {
    private GamePanel gamePanel;
    private static final int TILE_SIZE = 20;
    private static final int GRID_SIZE = 20;
    private static final int GAME_SPEED = 150;

    public SnakeGame() {
        setTitle("贪吃蛇游戏");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        gamePanel = new GamePanel();
        add(gamePanel);

        pack();
        setLocationRelativeTo(null);
    }

    private class GamePanel extends JPanel implements ActionListener, KeyListener {
        private LinkedList<Point> snake;
        private Point food;
        private int direction; // 0:上, 1:右, 2:下, 3:左
        private boolean isMoving;
        private boolean gameOver;
        private int score;
        private Timer timer;

        public GamePanel() {
            setPreferredSize(new Dimension(TILE_SIZE * GRID_SIZE, TILE_SIZE * GRID_SIZE));
            setBackground(Color.BLACK);
            setFocusable(true);
            addKeyListener(this);

            initGame();
        }

        private void initGame() {
            snake = new LinkedList<>();
            snake.add(new Point(5, 5));
            direction = 1;
            isMoving = true;
            gameOver = false;
            score = 0;
            spawnFood();

            if (timer != null) {
                timer.stop();
            }
            timer = new Timer(GAME_SPEED, this);
            timer.start();
        }

        private void spawnFood() {
            Random rand = new Random();
            do {
                food = new Point(
                        rand.nextInt(GRID_SIZE),
                        rand.nextInt(GRID_SIZE)
                );
            } while (snake.contains(food));
        }

        private void move() {
            if (!isMoving || gameOver) {
                return;
            }

            Point head = new Point(snake.getFirst());
            switch (direction) {
                case 0: head.y--; break;
                case 1: head.x++; break;
                case 2: head.y++; break;
                case 3: head.x--; break;
            }

            // 碰撞检测
            if (head.x < 0 || head.x >= GRID_SIZE ||
                    head.y < 0 || head.y >= GRID_SIZE ||
                    snake.contains(head)) {
                gameOver = true;
                return;
            }

            snake.addFirst(head);

            // 吃到食物
            if (head.equals(food)) {
                score += 10;
                spawnFood();
            } else {
                snake.removeLast();
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            move();
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 绘制食物
            g.setColor(Color.RED);
            g.fillOval(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

            // 绘制蛇
            for (Point p : snake) {
                g.setColor(new Color(0, 180, 0));
                g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE - 1, TILE_SIZE - 1);
            }

            // 显示分数和游戏结束信息
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 16));
            g.drawString("分数: " + score, 10, 20);

            if (gameOver) {
                g.setFont(new Font("Arial", Font.BOLD, 30));
                g.drawString("游戏结束！", GRID_SIZE*TILE_SIZE/2-90, GRID_SIZE*TILE_SIZE/2);
                g.drawString("按空格键重新开始", GRID_SIZE*TILE_SIZE/2-140, GRID_SIZE*TILE_SIZE/2+40);
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            // 方向控制
            if ((key == KeyEvent.VK_UP || key == KeyEvent.VK_W) && direction != 2) {
                direction = 0;
            } else if ((key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) && direction != 3) {
                direction = 1;
            } else if ((key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) && direction != 0) {
                direction = 2;
            } else if ((key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) && direction != 1) {
                direction = 3;
            }

            // 重新开始游戏
            if (gameOver && key == KeyEvent.VK_SPACE) {
                initGame();
            }
        }

        @Override public void keyTyped(KeyEvent e) {}
        @Override public void keyReleased(KeyEvent e) {}
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new SnakeGame().setVisible(true);
        });
    }
}
