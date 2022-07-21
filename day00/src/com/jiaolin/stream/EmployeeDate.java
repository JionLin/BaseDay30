package com.jiaolin.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author johnny
 * @Classname EmployeeDate
 * @Description
 * @Date 2022/7/21 11:38
 */
public class EmployeeDate {
    public static List<Employee> getEmployList(){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,18,"刘强东",6000.03));
        list.add(new Employee(2,23,"小菜菜",18000.88));
        list.add(new Employee(1,22,"马云",20000.03));
        list.add(new Employee(1,35,"巴菲特。x",3000.03));
        list.add(new Employee(1,15,"johnny",8800.03));
        return list;
    }
}
