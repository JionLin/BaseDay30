package com.jiaolin.reflection;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author johnny
 * @Classname ClassLoadTest
 * @Description 类加载测试
 * @Date 2022/7/23 15:49
 */
public class ClassLoadTest {

    @Test
    public void test1(){
        ClassLoader classLoader = ClassLoadTest.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
    }

    @Test
    public void test2() throws IOException {
        Properties properties = new Properties();
        // 进行文件的加载
        ClassLoader classLoader = ClassLoadTest.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(inputStream);

        System.out.println(properties.get("userName"));
        System.out.println(properties.get("age"));

    }
}
