package src._03函数引用;

/**
 * @ClassName FunctionDemo
 * @Description TODO
 * @Author aking
 * @Date 2020/12/1 22:44
 * @Version 1.0
 **/
public class FunctionDemo2 {
    private static interface Calculate {
        int add(int a, int b);
    }

    public static void main(String[] args) {
        // Calculate calculate = (a,b) -> add(a,b);
        // 函数的引用
        Calculate calculate = new FunctionDemo2()::add;
        System.out.println(calculate.add(10,20));
    }

    private int add(int a, int b) {
        if (a > b) {
            return 2 * a + b;
        } else if (a < b) {
            return a + 2 * b;
        } else {
            return a + b;
        }
    }
}
