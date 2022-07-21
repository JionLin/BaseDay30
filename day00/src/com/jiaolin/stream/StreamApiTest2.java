package com.jiaolin.stream;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author johnny
 * @Classname StreamApiTest2
 * @Description 中间操作的3种方式
 *  筛选与切片
 *  映射
 *  排序
 * @Date 2022/7/21 18:16
 */
public class StreamApiTest2 {
    /**
     filter(Predicate p)
     接收 Lambda ， 从流中排除某些元素
     distinct()
     筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
     limit(long maxSize)
     截断流，使其元素不超过给定数量
     skip(long n)
     跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一 个空流。与 limit(n) 互补

     */

    @Test
    public void test1(){
        // 使用filter 进行过滤
        List<Employee> employList = EmployeeDate.getEmployList();
        employList.stream().filter(employee -> employee.getAge()>20).forEach(System.out::println);

        employList.add(new Employee(2,22,"小菜菜",18000.88));
        employList.add(new Employee(2,21,"小菜菜",18000.88));
        employList.add(new Employee(2,21,"小菜菜",18000.88));
        employList.add(new Employee(2,22,"小菜菜",18000.88));

        System.out.println(employList.size());
        System.out.println();
        // 使用distinct 进行去重
        employList.stream().distinct().forEach(System.out::println);
        System.out.println();
        // 使用limit 进行截断
        employList.stream().limit(3).forEach(System.out::println);

        System.out.println("===");
        employList.forEach(System.out::println);
        System.out.println();
    //    skip(long n) 跳过
        employList.stream().skip(2).forEach(System.out::println);
    }

    /**
     map(Function f)
     接收一个函数作为参数，该函数会被应用到每个元 素上，并将其映射成一个新的元素。
     */
    @Test
    public void test2(){
        // 获取名字
        List<Employee> employList = EmployeeDate.getEmployList();

        employList.stream().map(employee -> {
            return employee.getName();
        }).forEach(System.out::println);

        System.out.println();
        employList.stream().map(employee -> employee.getSalary()).forEach(System.out::println);
    }

    /**
     sorted()
     产生一个新流，其中按自然顺序排序
     sorted(Comparator com)
     产生一个新流，其中按比较器顺序排序
     */
    @Test
    public void test3(){
        // 进行排序
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream().sorted().forEach(System.out::println);

        EmployeeDate.getEmployList().stream().sorted((e1,e2)->{
            return e2.getAge()-e1.getAge();
        }).forEach(System.out::println);
    }


}
