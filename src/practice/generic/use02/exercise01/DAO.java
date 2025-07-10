package practice.generic.use02.exercise01;

import java.util.*;

/**
 * ClassName: DAO
 * Package: practice.generic.use02.exercise01
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/9 - 21:44
 * Version - v 1.0
 */


public class DAO<T> {
    //
    Map<String,T> map;
    {
        map = new HashMap<>();
    }

    //
    public DAO() {
    }

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    //
    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    //
    public void save(String id,T entity){   //保存对象
        if (!map.containsKey(id)) {
            map.put(id, entity);
        }
    }
    public T get(String id) {       //根据id找对象
        return map.get(id);
    }
    public void update(String id, T entity) {       //修改对象
        if (map.containsKey(id)){
            map.put(id, entity);
        }
    }
    public List<T> list(){      //返回 amp 中存放的所有 T 对象
        //方式①
//        Collection<T> values = map.values();
//        ArrayList<T> list = new ArrayList<>();
//        list.addAll(values);
//        return list;

        //方式②
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>(values);
        return list;
    }
    public void delete(String id){  //删除指定id对象
        if (map.containsKey(id)){
            map.remove(id);
        }
    }
}
