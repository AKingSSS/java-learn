package src._01lambda表达式;

import src._01lambda表达式.functioninterface.NoneReturnNoneParameter;
import src._01lambda表达式.functioninterface.NoneReturnSingleParameter;

public class Test {
    public static void main(String[] args) {
        NoneReturnNoneParameter lambda1 = () -> {
            System.out.println("无参无返回值的函数式接口");
        };
        lambda1.test1();

        NoneReturnSingleParameter lambda2 = (a) -> {
            System.out.println("1个参无返回值的函数式接口: a = " + a);
        };
        lambda2.test2(10);
    }
}
