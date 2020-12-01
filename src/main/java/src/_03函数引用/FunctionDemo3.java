package src._03函数引用;

/**
 * @ClassName FunctionDemo
 * @Description TODO
 * @Author aking
 * @Date 2020/12/1 22:44
 * @Version 1.0
 **/
public class FunctionDemo3 {
    private static class Person {
        String name;
        Integer age;

        public Person() {
            System.out.println("无参构造函数执行");
        }

        public Person(String name) {
            this.name = name;
            System.out.println("一个参数的构造函数执行");
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
            System.out.println("两个参数的构造函数执行");
        }
    }

    @FunctionalInterface
    private static interface GetPerson {
        Person get();
    }

    @FunctionalInterface
    private static interface GetPersonWithSingleParameter {
        Person get(String name);
    }

    @FunctionalInterface
    private static interface GetPersonWithMultipleParameter {
        Person get(String name, Integer age);
    }

    public static void main(String[] args) {
        GetPerson getPerson = Person::new;
        GetPersonWithSingleParameter getPersonWithSingleParameter = Person::new;
        GetPersonWithMultipleParameter getPersonWithMultipleParameter = Person::new;

        Person person = getPerson.get();
        getPersonWithSingleParameter.get("aking");
        getPersonWithMultipleParameter.get("aking",18);
    }
}
