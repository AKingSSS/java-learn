package src._02函数式接口;

/**
 * @FunctionalInterface: 判断这个接口是否是一个函数式接口
 *
 */
@FunctionalInterface
public interface Test {
    void test();
    default void test1() {};
    static void test2() {};
    @Override
    String toString();

}
