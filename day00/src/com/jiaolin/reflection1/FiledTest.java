package com.jiaolin.reflection1;

import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.time.Period;

/**
 * @author johnny
 * @Classname FiledTest
 * @Description 获取当前类的属性结构
 * @Date 2022/7/23 16:07
 */
public class FiledTest {

    // 获取属性结构
    @Test
    public void test1() {
        // 当前类的所有属性,不包含父类的
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    /**
     * 获取权限修饰分  数据类型 变量名
     */
    @Test
    public void test2() {
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            // 获取权限修饰符
            int modifiers = declaredField.getModifiers();
            System.out.print(Modifier.toString(modifiers) + "\t");

            // 获取数据类型
            Class<?> type = declaredField.getType();
            System.out.print(type.getName() + "\t");

            //获取变量名
            String name = declaredField.getName();
            System.out.print(name);

            System.out.println();
        }
    }
}
