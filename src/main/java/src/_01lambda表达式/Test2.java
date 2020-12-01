package src._01lambda表达式;

import src._01lambda表达式.functioninterface.*;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author aking
 * @Date 2020/12/1 21:47
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        NoneReturnNoneParameter lambda1 = () -> {
            System.out.println("无参无返回值的函数式接口");
        };
        lambda1.test1();
        System.out.println("======================================================");

        // 如果有且只有一个参数，小括号可以省略；
        NoneReturnSingleParameter lambda2 = a -> System.out.println("1个参无返回值的函数式接口: a = " + a);
        lambda2.test2(10);
        System.out.println("======================================================");

        NoneReturnMutipleParameter lambda3 = (a, b) -> {
            System.out.println("多个参无返回值的函数式接口: a = " + a + ";b = " + b);
        };
        lambda3.test3(10, 20);
        System.out.println("======================================================");

        SingleReturnNoneParameter lambda4 = () -> {
            System.out.println("无参有返回值的函数式接口");
            return 0;
        };
        int result1 = lambda4.test4();
        System.out.println("result1 = " + result1);
        System.out.println("======================================================");

        SingleReturnSingleParameter lambda5 = (a) -> {
            System.out.println("单个参有返回值的函数式接口：a = " + a);
            return a;
        };
        int result2 = lambda5.test5(30);
        System.out.println("result2 = " + result2);
        System.out.println("======================================================");

        SingleReturnMutipleParameter lambda6 = (a, b) ->  a + b;
        int result3 = lambda6.test6(30, 50);
        System.out.println("result3 = " + result3);
    }
}
