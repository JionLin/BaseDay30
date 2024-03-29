package com.jiaolin.lambda;

/**
 * @author johnny
 * @Classname LambdaApiTest1
 * @Description 后续需要进行操作的。
 * @Date 2022/7/22 09:25
 */
public class LambdaApiTest1 {
    /**

     可以理解
     BiFunction<T, U, R>
     T, U
     R
     对类型为 T, U 参数应用操作，返回 R 类型的结 果。包含方法为: R apply(T t, U u);
     R apply(T t, U u);



     可以理解
     UnaryOperator<T> (Function子接口 R apply(T t)的参数 )  那么子类为 入参为t 返回参数为t
     T
     T
     对类型为T的对象进行一元运算，并返回T类型的 结果。包含方法为:T apply(T t);



     可以理解
     BinaryOperator<T>(BiFunction<T,T,T> )   (BiFunction 子接口    R apply(T t, U u); )
     T, T 入参
     T
     对类型为T的对象进行二元运算，并返回T类型的 结果。包含方法为: T apply(T t1, T t2);
     BiConsumer<T, U>
     T, U
     void
     对类型为T, U 参数应用操作。 包含方法为: void accept(T t, U u)



     可以理解
     BiPredicate<T,U>
     T,U
     boolean
     包含方法为: boolean test(T t,U u)

     可以理解
     ToIntFunction<T> ToLongFunction<T> ToDoubleFunction<T>
     T
     int long double
     分别计算int、long、double值的函数


     可以理解
     IntFunction<R> LongFunction<R> DoubleFunction<R>
     int long double
     R
     参数分别为int、long、double 类型的函数
     */
}
