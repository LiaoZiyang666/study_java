package project.model.junit;

import org.junit.Test;
import project.model.domain.Employee;
import project.model.service.NameListService;
import project.model.service.TeamException;

/**
 * ClassName: NameListServiceTest
 * Package: project.model.junit
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/19 - 13:06
 * Version - v 1.0
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployee(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }
    }
    @Test
    public void testGetEmployee(){
        try {
            NameListService nameListService = new NameListService();
            int id = 3;
//            id = 13;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());//推荐
//            e.printStackTrace();
        }


    }
}





















