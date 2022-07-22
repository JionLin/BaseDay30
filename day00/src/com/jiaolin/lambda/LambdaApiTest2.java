package com.jiaolin.lambda;

import com.jiaolin.stream.Employee;
import org.testng.annotations.Test;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author johnny
 * @Classname LambdaApiTest2
 * @Description 方法引用 构造器引用 数组引用
 * @Date 2022/7/22 10:40
 */
public class LambdaApiTest2 {

    @Test
    public void test1(){
        // 方法引用
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("北京");


        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("beijing");



        Function<String, Employee> function=(e)->new Employee(1,28,e,434.02);
        Employee apply = function.apply("菜菜");
        System.out.println(apply);



        Function<String, Employee> function2=Employee::new;
        Employee apply1 = function2.apply("xx");
        System.out.println(apply1);



        Function<Integer, Integer[]> function3=(e)->new Integer[e];
        Integer[] apply2 = function3.apply(44);
        System.out.println(apply2.length);

        Function<Integer, Integer[]> function4=Integer[]::new;
        Integer[] apply3 = function4.apply(44);
        System.out.println(apply3.length);

    }
}
