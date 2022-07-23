package com.jiaolin.reflection1;

import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.Pipe;
import java.time.Period;

/**
 * @author johnny
 * @Classname OtherTest
 * @Description
 * @Date 2022/7/23 16:08
 */
public class OtherTest {

    /**
     *  使用反射获取当前属性的值 并设置进去 进行输出
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        // 使用反射获取当前属性的值 并且控制台输出来
        Class<?> clazz = Class.forName("com.jiaolin.reflection1.Person");
        Person o = (Person) clazz.newInstance();

        // 获取指定的属性 必须就有一个class对象 为public
        Field id = clazz.getField("id");
        id.set(o,100);

        Integer pid = (Integer) id.get(o);
        System.out.println(pid);
    }

    /**
     * 获取类中指定的字段属性
     * 0。创建运行时类的对象
     * 1。 设置为可访问的。
     * 2。进行此对象的属性值
     */
    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"cc");

        System.out.println(name.get(person));

    }

    /**
     * 获取运行时类对象的指定方法 包含私有
     * 1. 创建运行时 类的对象
     * 2。 设置可访问的权限
     * 3。 进行方法里面的参数设置值
     * 4。获取返回的值
     */
    @Test
    public void test3() throws Exception {
        Class<? extends Person> clazz = new Person().getClass();
        Person person = clazz.newInstance();

        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);

        String value = (String) show.invoke(person, "china");
        System.out.println(value);


        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);

        Object invoke = showDesc.invoke(Person.class);
        System.out.println(invoke);

    }

    /**
     * 获取运行时的构造器
     *
     * 1. 获取指定的构造器
     * 2。进行设置可访问的权限
     * 3。使用构造器进行创建运行时对象的类
     */
    @Test
    public void test4() throws Exception {
        ClassLoader classLoader = OtherTest.class.getClassLoader();
        Class<?> clazz = classLoader.loadClass("com.jiaolin.reflection1.Person");


        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);

        Person per = (Person) constructor.newInstance("xxx");
        System.out.println(per);


    }
}
