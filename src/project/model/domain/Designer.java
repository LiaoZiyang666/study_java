package project.model.domain;

/**
 * ClassName: Designer
 * Package: project.model.domain
 * Description:设计师
 *
 * @author 廖子杨
 * CreateTime: 2025/4/19 - 10:48
 * Version - v 1.0
 */
public class Designer extends Programmer {
    private double bonus;//奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() +
                "\t" + getBonus() + "\t\t\t" + getEquipment().getDescription();
    }
    @Override
    public String getDetailsForTeam() {
        return getBasicDetailsForTeam() + "设计师\t" + getBonus();
    }
}









