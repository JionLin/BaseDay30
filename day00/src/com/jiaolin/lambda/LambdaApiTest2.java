package com.jiaolin.lambda;

import com.jiaolin.stream.Employee;
import com.jiaolin.stream.EmployeeDate;
import org.testng.annotations.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author johnny
 * @Classname LambdaApiTest2
 * @Description 方法引用 构造器引用 数组引用
 * @Date 2022/7/22 10:40
 */
public class LambdaApiTest2 {

    @Test
    public void test1() {
        // 方法引用
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("北京");


        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("beijing");


        Function<String, Employee> function = (e) -> new Employee(1, 28, e, 434.02);
        Employee apply = function.apply("菜菜");
        System.out.println(apply);


        Function<String, Employee> function2 = Employee::new;
        Employee apply1 = function2.apply("xx");
        System.out.println(apply1);


        Function<Integer, Integer[]> function3 = (e) -> new Integer[e];
        Integer[] apply2 = function3.apply(44);
        System.out.println(apply2.length);

        Function<Integer, Integer[]> function4 = Integer[]::new;
        Integer[] apply3 = function4.apply(44);
        System.out.println(apply3.length);

    }

    /**
     * @return void
     * @Author johnny
     * @Description Collectors.toMap()
     * Collectors.groupingBy()
     * Collectors.joining()
     * Collectors.toSet()
     * @Date 09:42 2022/9/21
     * @Param []
     **/
    @Test
    public void test2() {
        List<Employee> employList = EmployeeDate.getEmployList();
        List<Employee> collect = employList.stream().filter(e -> e.getName().equals("马云")).collect(Collectors.toList());
        collect.stream().forEach(e -> System.out.println(e));

        System.out.println("===========");
        List<Employee> employList2 = EmployeeDate.getEmployList();

        Set<Employee> collect1 = employList2.stream().collect(Collectors.toSet());
        collect1.stream().forEach(System.out::println);
        System.out.println("===========");
        List<Employee> employList3 = EmployeeDate.getEmployList();
        Long collect2 = employList3.stream().collect(Collectors.counting());
        System.out.println(collect2);

        System.out.println("===========");


    }

    /**
     * @return void
     * @Author johnny toMap 使用key-value的形式展示
     * @Description
     * @Date 10:21 2022/9/21
     * @Param []
     **/
    @Test
    public void test3() {
        List<Employee> employList4 = EmployeeDate.getEmployList();
        Map<String, Integer> collect3 = employList4.stream().collect(Collectors.toMap(employee -> employee.getName() + employee.getAge(),
                Employee::getId, (k2, k1) -> k1));
        for (Map.Entry<String, Integer> map : collect3.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }
        System.out.println("===========");
        List<Employee> employList5 = EmployeeDate.getEmployList();

        Map<String, Integer> collect4 = employList5.stream().collect(Collectors.toMap
                (employee -> employee.getName() + employee.getAge(), Employee::getId
                ));
        for (Map.Entry<String, Integer> map : collect4.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }

        System.out.println();
        List<Employee> employList6 = EmployeeDate.getEmployList();
        Map<Integer, String> collect6 = employList6.stream().collect(Collectors.toMap
                (f -> f.getAge(), employee -> employee.getName() + employee.getAge()));

        //18 : 刘强东18
        // 35 : 巴菲特。x35
        // 22 : 马云22
        // 23 : 小菜菜23
        // 25 : johnny25
        for (Map.Entry<Integer, String> map : collect6.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }


    /**
     * @return void
     * @Author johnny
     * @Description
     * * Collectors.joining() 连接流中每个字符串
     * @Date 10:38 2022/9/21
     * @Param []
     **/
    @Test
    public void testJoining() {
        List<Employee> list = EmployeeDate.getEmployList();
        String collect = list.stream().map(Employee::getName).collect(Collectors.joining());
        System.out.println(collect);
        System.out.println();

        List<Employee> list2 = EmployeeDate.getEmployList();
        String s = list2.stream().map(Employee::getName).collect(Collectors.joining(","));
        //刘强东,小菜菜,马云,巴菲特。x,johnny
        System.out.println(s);
        System.out.println();
    }


    /**
     * @return void
     * @Author johnny
     * @Description 根据某属性 对值进行分组,返回对是一个map,属性为key  value就是一个list
     * @Date 11:03 2022/9/21
     * @Param []
     **/
    @Test
    public void testGroupBy() {
        List<Employee> list = EmployeeDate.getEmployList();
        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(employee ->
                employee.getName() + employee.getAge()
        ));
        for (Map.Entry<String, List<Employee>> entry : collect.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();
        List<Employee> list2 = EmployeeDate.getEmployList();
        Map<String, List<Employee>> collect2 = list2.stream().collect(
                Collectors.groupingBy(Employee::getName));
        /**

         小菜菜:[Employee{id=2, age=23, name='小菜菜', salary=18000.88}]
         马云:[Employee{id=1, age=22, name='马云', salary=20000.03}]
         巴菲特。x:[Employee{id=1, age=35, name='巴菲特。x', salary=3000.03}]
         johnny:[Employee{id=1, age=25, name='johnny', salary=8800.03}, Employee{id=2, age=18, name='johnny', salary=8800.03}]
         刘强东:[Employee{id=1, age=18, name='刘强东', salary=6000.03}]
         */
        for (Map.Entry<String, List<Employee>> entry : collect2.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println();
        List<Employee> list3 = EmployeeDate.getEmployList();
        Map<Integer, List<Employee>> collect3 = list3.stream().collect(
                Collectors.groupingBy(Employee::getId));

        for (Map.Entry<Integer, List<Employee>> entry : collect3.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
