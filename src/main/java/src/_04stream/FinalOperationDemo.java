package src._04stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FinalOperationDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10,20,30,40,50);

        // collect
        List<Integer> list1 = list.stream().collect(Collectors.toList());
        System.out.println(list1);

        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(e -> e / 10, e -> e));
        System.out.println(map);

        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);

        // count
        long count = list.stream().count();
        System.out.println(count);

        // foreach
        list.stream().forEach(System.out::println);

        // max
        Integer max = list.stream().max(Integer::compareTo).get();
        System.out.println(max);

        // min
        Integer min = list.stream().min(Integer::compareTo).get();
        System.out.println(min);

        // 判断流中是否所有的元素都大于 50
        boolean b1 = list.stream().allMatch(ele -> ele > 50);
        System.out.println(b1);

        // 判断流中是否有大于 50 的数据
        boolean b2 = list.stream().anyMatch(ele -> ele > 50);
        System.out.println(b2);

        // 判断流中是否没有奇数
        boolean b3 = list.stream().noneMatch(ele -> ele % 2 != 0);
        System.out.println(b3);

        // findFirst
        Integer j = list.stream().findFirst().get();
        System.out.println(j);
        // findAny
        Integer k = list.stream().findAny().get();
        System.out.println(k);

/*        // 错误操作
        Stream<Integer> stream = list.stream();
        //  stream has already been operated upon or closed
        long c = stream.count();
        stream.forEach(System.out::println);*/

    }
}
