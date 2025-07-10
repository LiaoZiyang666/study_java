package practice.generic.use02.exercise01;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * ClassName: DAOTest
 * Package: practice.generic.use02.exercise01
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/9 - 22:13
 * Version - v 1.0
 */


public class DAOTest {



    
    @Test
    public void test01(){


        DAO<User> dao = new DAO<>();
//        objectDAO.save("01",99);
//        objectDAO.save("02",44);
//        objectDAO.save("03",99);
        dao.save("01",new User(1001,23,"Tom"));
        dao.save("02",new User(1003,32,"Jack"));
        dao.save("03",new User(1005,33,"Tone"));
        dao.save("04",new User(1001,23,"Tom"));

        List<User> list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }


        User user1 = dao.get("02");
        System.out.println("--" + user1);

        dao.update("02",new User(1004,55,"Halle"));
        User user2 = dao.get("02");
        System.out.println("--" + user2);

//
        List<User> list1 = dao.list();
        for (User user : list1) {
            System.out.println(user);
        }
        System.out.println();
        dao.delete("03");
        List<User> list2 = dao.list();
        for (User user : list2) {
            System.out.println(user);
        }

    }
    
    
    
    
    
    
}
