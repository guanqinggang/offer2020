package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: guanqg
 * @Date: 2020/7/16 12:25
 */
public class Factory {
    private ArrayList students = new ArrayList();

    public void add(Student student) {
        students.add(student);
    }

    public static void main(String[] args) {
        Map map =new HashMap();
        map.put("a",true);
        if ((Boolean) map.get("a")){
            System.out.println("fdddddddd");
        }
    }

}
