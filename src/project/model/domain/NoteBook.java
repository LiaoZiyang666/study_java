package project.model.domain;

/**
 * ClassName: NoteBook
 * Package: project.model.domain
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/19 - 10:32
 * Version - v 1.0
 */
public class NoteBook implements Equipment{

    private String model;
    private double price;

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
