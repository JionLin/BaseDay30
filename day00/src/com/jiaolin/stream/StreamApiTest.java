package com.jiaolin.stream;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author johnny
 * @Classname StreamApiTest
 * @Description stream API 表达式 分为3个操作
 * 创建 4种形式
 *      list 数组 stream 以及stream类 .of() 方法, 4 stream类  无限流
 * 中间操作 3种形式
 *      筛选及切片
 *      映射
 *      排序
 *
 * 终止操作 3种
 * 匹配问题
 * 规约
 * 收集
 *
 * @Date 2022/7/21 08:40
 */
public class StreamApiTest {

    @Test
    public void test1(){
        List<Employee> employList =
                EmployeeDate.getEmployList();
        employList.stream().forEach(System.out::println);
        System.out.println();

        int[] array=new int[]{1,2,3,4,5,6};
        Arrays.stream(array).forEach(System.out::println);
        System.out.println();

        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1, 3, 5));
        listStream.forEach(System.out::println);


    }

    @Test
    public void  test2(){
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        System.out.println();
        Stream.iterate(0,x->x+2).limit(10).forEach(System.out::println);
    }
}
