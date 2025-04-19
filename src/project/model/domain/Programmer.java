package project.model.domain;

import project.model.service.Status;

/**
 * ClassName: Programmer
 * Package: project.model.domain
 * Description:程序员
 *
 * @author 廖子杨
 * CreateTime: 2025/4/19 - 10:40
 * Version - v 1.0
 */
public class Programmer extends Employee implements Equipment{
    private int memberId;//开发团队中的tId
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String getDescription() {
        return "Programmer";
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }



    protected String getBasicDetailsForTeam() {
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() +
                "\t" + getSalary() + "\t";
    }

    public String getDetailsForTeam() {
        return getBasicDetailsForTeam()   + "程序员" ;
    }
}










