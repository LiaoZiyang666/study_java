package project.model.service;

import project.model.domain.*;

import static project.model.service.Data.*;



/**
 * ClassName: NameListService
 * Package: project.model.service
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/19 - 11:01
 * Version - v 1.0
 */
public class NameListService{

    private Employee[] employees;//12个对象



    public NameListService() {
        //根据项目提供的Data类构建相应大小的employees数组
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            //获取共有的属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;
            //再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
            //将对象存于数组中
            //Data类位于service包中
            switch(type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * 获取指定id的员工
     * @param id
     * @return
     */
    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()) {
                return employees[i];
            }
        }
        //如果执行到此位置，就意味没有找到
        throw new TeamException("没有找到指定的员工");
    }


    private Equipment createEquipment(int index) {
        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]) ;

        String modelOrName = EQUIPMENTS[index][1];
        String priceOrDisplayOrType = EQUIPMENTS[index][2];

        switch (equipmentType) {
            case PC:
                return new PC(modelOrName, priceOrDisplayOrType);
            case NOTEBOOK:
                double price = Double.parseDouble(priceOrDisplayOrType);//装箱与拆箱
                return new NoteBook(modelOrName, price);
            case PRINTER:
                return new Printer(modelOrName, priceOrDisplayOrType);
        }
        return null;
    }




}






























