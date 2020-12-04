package src._04stream._demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // 0. 存储对象
        List<Student> students = new ArrayList<>();
        Collections.addAll(students,
                new Student("zhangsan", 100),
                new Student("lisi", 73),
                new Student("wangwu", 87),
                new Student("zhaoliu", 54),
                new Student("qianba", 99)
        );
        // 1. 所有及格学生信息
        students.stream().filter(s -> s.getScore() >= 60).forEach(System.out::println);
        System.out.println("1. 所有及格学生信息-------------------------------------------------------------------------");
        // 2. 查询所有及格学生姓名
        students.stream().filter(s -> s.getScore() >= 60).map(Student::getName).forEach(System.out::println);
        System.out.println("2. 查询所有及格学生姓名------------------------------------------------------------------------");
        // 3.所有学生的平均成绩
        double avg = students.stream()
                .mapToInt(s -> s.getScore())
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);
        System.out.println("3.所有学生的平均成绩------------------------------------------------------------------------");
        // 4. 班级的前三名（按照成绩）
        students.stream()
                .sorted((s1,s2)-> s2.getScore()-s1.getScore())
                .limit(3)
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("4. 班级的前三名（按照成绩）------------------------------------------------------------------------");
        // 5. 班级 3-10 名（按照成绩）
        students.stream()
                .sorted((s1,s2)-> s2.getScore()-s1.getScore())
                .limit(10)
                .skip(2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("5. 班级 3-10 名（按照成绩）------------------------------------------------------------------------");
        // 6.所有不及格学生平均成绩
        double avg2 = students.stream()
                .filter(s -> s.getScore() < 60)
                .mapToInt(s -> s.getScore())
                .average()
                .getAsDouble();
        System.out.println("avg2 = " + avg2);
        System.out.println("6.所有不及格学生平均成绩------------------------------------------------------------------------");
        // 7.将及格的学生降级输出所有信息
        students.stream()
                .filter(s->s.getScore() >=60)
                .sorted((s1,s2)->s1.getScore()-s2.getScore())
                .forEach(System.out::println);
        System.out.println("7.将及格的学生降级输出所有信息------------------------------------------------------------------------");
        // 8.班级学生的总分
        int sum = students.stream()
                .mapToInt(s -> s.getScore())
                .sum();
        System.out.println("sum = " + sum);
    }
}
