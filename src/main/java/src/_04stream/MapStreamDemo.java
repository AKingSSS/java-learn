package src._04stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamDemo {
    public static void main(String[] args) {
        String[] array = {"hello", "world"};
        Stream<String> stream = Arrays.stream(array);
        /**
         * 映射之前，流中有两个元素，是两个字符串
         * 映射完成后，流中依然是两个元素，是两个char[]
         * 最后forEach遍历的，其实是两个char[]
         * */
//        stream.map(e -> e.toCharArray()).forEach(e -> System.out.println(Arrays.toString(e)));
//        stream.map(String::toCharArray).forEach(e -> System.out.println(Arrays.toString(e)));

        /**
         * flatMap：扁平化映射，将流中的容器中的元素直接取出，直接存放在流中。
         * */
        stream.map(e -> e.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
