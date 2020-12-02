package src._04stream;

import java.util.ArrayList;
import java.util.Collections;

public class MiddleOperationDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 180, 20, 30, 40, 50, 20);

        //filter
        list.stream().filter(e -> e >= 25).forEach(System.out::println);
        System.out.println("========================================================================");

        // distinct
        list.stream().distinct().forEach(System.out::println);
        System.out.println("========================================================================");

        // sorted
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted((e1, e2) -> e1 - e2).forEach(System.out::println);
        System.out.println("========================================================================");

        // limit
        list.stream().limit(2).forEach(System.out::println);
        System.out.println("========================================================================");

        // skip
        list.stream().skip(2).forEach(System.out::println);
        System.out.println("========================================================================");
        list.stream().skip(2).limit(3).forEach(System.out::println);
        System.out.println("========================================================================");

    }
}
