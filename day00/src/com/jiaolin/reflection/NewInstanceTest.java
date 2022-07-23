package com.jiaolin.reflection;

import org.testng.annotations.Test;

import java.util.Random;

/**
 * @author johnny
 * @Classname NewInstanceTest
 * @Description newInstance() 方法,通过反射创建类的运行时的对象
 * @Date 2022/7/23 12:15
 */
public class NewInstanceTest {

    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();

        Person person1 = personClass.newInstance();
        System.out.println(person1);
    }

    // newInstance() 必须要求 提供无参构造器+public 权限修饰
    @Test
    public void test2() {
        for (int i = 0; i < 100; i++) {

            int num = new Random().nextInt(3);
            String classPath = "";
            switch (num) {
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "com.jiaolin.reflection.Person";
                    break;
            }
            try {
                Object obj = getPath(classPath);
                System.out.println(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    // 体会反射的动态性
    private Object getPath(String pathName) throws Exception {
        Class clazz = Class.forName(pathName);
        return clazz.newInstance();
    }



}
