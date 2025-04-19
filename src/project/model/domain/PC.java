package project.model.domain;

/**
 * ClassName: PC
 * Package: project.model.domain
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/19 - 10:30
 * Version - v 1.0
 */
public class PC implements Equipment{
    private String model;
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
