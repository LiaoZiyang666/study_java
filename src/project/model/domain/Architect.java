package project.model.domain;

/**
 * ClassName: Architect
 * Package: project.model.domain
 * Description:架构师
 *
 * @author 廖子杨
 * CreateTime: 2025/4/19 - 10:50
 * Version - v 1.0
 */
public class Architect extends Designer {
    private int stock;//股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() +
                "\t" + getBonus() + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam() {
        return getBasicDetailsForTeam() + "架构师\t" + getBonus() + "\t" + getStock();
    }
}







