package src._01lambda表达式;

import src._01lambda表达式.functioninterface.*;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author aking
 * @Date 2020/12/1 21:47
 * @Version 1.0
 **/
public class Test3 {
    private static int b = 20;
    public static void main(String[] args) {
        // 1、定义局部变量
        int a = 10;
        // 2、使用lambda表达式实现接口
        Lambda lambda = () -> {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        };
        // 3、修改变a的值
        // a = 30;
        b = 200;
    }

    @FunctionalInterface
    private static interface Lambda{
        void test();
    }
}
