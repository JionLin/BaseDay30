package com.jiaolin.reflection1;

import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author johnny
 * @Classname MethodTest
 * @Description 获取方法名
 * @Date 2022/7/23 16:08
 */
public class MethodTest {

    /**
     * 获取当前类的所有方法 包含私有 不包含父类的方法
     */
    @Test
    public void test1() {
        Class<? extends Person> aClass = new Person().getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    /**
     * 获取当前类的 权限修饰符 方法名 返回类型
     */
    @Test
    public void test2() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.jiaolin.reflection1.Person");
        for (Method method : clazz.getDeclaredMethods()) {
            //获取声明的注解
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }

            //2 获取权限修饰符
            System.out.print(Modifier.toString(method.getModifiers()) + "\t");

            // 3.获取返回值类型
            System.out.print(method.getReturnType().getName() + "\t");

            // 4 获取方法名
            System.out.print(method.getName() + "\t");

            // 5获取参数列表
            Class<?>[] parameterTypes = method.getParameterTypes();

            System.out.print("(");
            if (parameterTypes.length != 0 && parameterTypes != null) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    // 如果是最后一个
                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + i + ",");
                }
            }
            System.out.print(")");

            // 获取异常列表
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes.length > 0) {
                System.out.print("throws");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == exceptionTypes.length - 1) {
                        System.out.print(exceptionTypes[i].getName() + i);
                    }
                    System.out.print(exceptionTypes[i].getName() + i + ",");
                }
            }
            System.out.println();
        }


    }
}
