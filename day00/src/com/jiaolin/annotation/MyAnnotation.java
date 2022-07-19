package com.jiaolin.annotation;

import java.lang.annotation.*;

/**
 * @author johnny
 * @Classname MyAnnotation
 * 注解就是代码里面的一个特殊的标志
 * 注解分为3类，
 * 1.用来生成文件的 类似于 @author  @param
 * 2.在编译的时候进行格式检查的  @SuppressWarnings
 * 3.实现代码依赖性,实现代码配置文件的功能 重要的点 @configration
 *
 * 用来修饰注解的定义 内置4个
 * 4个元注解
 * Retention 生命周期 为runtime的形式  会存在内存中 其余的还有 source,存在于源文件中 /class中,在class 文件中进行保留
 * Target  目标对象,是处在什么位置有效  method 方法中,filed 在对应的Field 字段中有效 type 指的是在类 接口或者枚举中有效
 *
 * 很少用
 * @Documented 用来被javadoc 提取成文档的
 * @Inherited 用来可以继承的
 * @Description 后续看宋洪康的资料,补充的代码知识点。
 *
 * 自定义注解
 *  使用@interface 的形式。
 * @Date 2022/7/19 18:40
 */


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
public @interface MyAnnotation {

    String value() default "";
}

class Test{
    public static void main(String[] args) {
        Class<MyAnnotation> myAnnotationClass = MyAnnotation.class;
        Annotation[] annotations = myAnnotationClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}



