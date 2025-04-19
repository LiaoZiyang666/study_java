package project.model.domain;

/**
 * ClassName: Printer
 * Package: project.model.domain
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/19 - 10:33
 * Version - v 1.0
 */
public class Printer implements Equipment{

    private String name;
    private String type;

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
