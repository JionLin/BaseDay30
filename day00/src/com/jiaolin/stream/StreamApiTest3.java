package com.jiaolin.stream;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author johnny
 * @Classname StreamApiTest3
 * @Description stream api 的终止操作 有3步
 * 匹配与查找
 * 规约
 * 收集
 * @Date 2022/7/21 19:11
 */
public class StreamApiTest3 {

    /**
     * allMatch(Predicate p)
     * 检查是否匹配所有元素
     * anyMatch(Predicate p)
     * 检查是否至少匹配一个元素
     * noneMatch(Predicate p)
     * 检查是否没有匹配所有元素
     * findFirst()
     * 返回第一个元素
     * findAny()
     * 返回当前流中的任意元素
     * count()
     * 返回流中元素总数
     * max(Comparator c)
     * 返回流中最大值
     * min(Comparator c)
     * 返回流中最小值
     * forEach(Consumer c)
     * 内部迭代(使用 Collection 接口需要用户去做迭代 称为外部迭代。相反，Stream API 使用内部迭 代——它帮你把迭代做了)
     */
    @Test
    public void test1() {
        List<Employee> employList = EmployeeDate.getEmployList();
        boolean value = employList.stream().allMatch(employee -> employee.getAge() > 20);
        System.out.println(value);

        // 检查至少匹配一个
        boolean anyMatch = employList.stream().anyMatch(employee -> employee.getAge() > 40);
        System.out.println(anyMatch);


        // 返回流中元素
        System.out.println();
        long count = employList.stream().count();
        System.out.println(count);

        /**
         * max(Comparator c)
         * 返回流中最大值
         * min(Comparator c)
         * 返回流中最小值
         */
        Optional<Employee> employee = employList.stream().max(
                (o1, o2) -> {
                    return o1.getAge() - o2.getAge();
                }
        );
        System.out.println(employee);
        Optional<Employee> employee2 = employList.stream().max((o1, o2) -> o2.getAge() - o1.getAge()
        );
        System.out.println(employee2);


    }

    /**
     * 规约
     * reduce(T iden, BinaryOperator b)
     * 可以将流中元素反复结合起来，得到一 个值。返回 T
     * reduce(BinaryOperator b)
     * 可以将流中元素反复结合起来，得到一 个值。返回 Optional<T>
     */
    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);


    }

    /**
     * 收集
     * collect(Collector c)
     * 将流转换为其他形式。接收一个 Collector 接口的实现，用于给Stream中元素做汇总 的方法
     */
    @Test
    public void test3() {
        List<Employee> employList = EmployeeDate.getEmployList();
        List<Employee> employeeList = employList.stream().limit(2).collect(Collectors.toList());
        System.out.println(employeeList);

        System.out.println();
        Set<Employee> employees = employList.stream().limit(2).collect(Collectors.toSet());
        System.out.println(employees);
        System.out.println();

        // 使用方法引用
        ArrayList<Employee> arrayList = employList.stream().limit(2).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arrayList);



    }

}
