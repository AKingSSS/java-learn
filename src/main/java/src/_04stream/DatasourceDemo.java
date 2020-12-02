package src._04stream;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class DatasourceDemo {
    public static void main(String[] args) {
        // 集合的简式编程
        ArrayList<Integer> list = new ArrayList<>();
        // 1.通过 Collection 接口中的 stream 方法获取
        Stream<Integer> stream1 = list.stream();
        // 2.通过 Collection 接口中的 parallelStream 方法获取并行流
        Stream<Integer> stream2 = list.parallelStream();
        // 3.通过Arrays工具类中的stream()方法获取数据源为数组的流
        String[] array = {"a","b","c"};
        Stream<String> stream3 = Arrays.stream(array);
    }
}
