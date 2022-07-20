package com.jiaolin.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author johnny
 * @Classname PersonTest2
 * @Description 通配符的使用  当写入的时候,只能添加null值,其余的不能够写入 编译会报错
 * ? 可以读
 * @Date 2022/7/20 18:58
 */
public class PersonTest2 {
    public static void main(String[] args) {

        List<?> list=null;
        list=new ArrayList<String>();
        list=new ArrayList<Integer>();
        // 除了null 其余的写入会报错
        // list.add(3);
        list.add(null);

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        read(list1);

    }

    public static void read(List<?> list) {
        list.forEach(System.out::println);
    }
}
