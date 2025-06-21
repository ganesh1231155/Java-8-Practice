package org.study.FunctionalInterfaces.hardLevel;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.jar.Attributes;
import java.util.stream.Collectors;

public class summingAgeOfPersons {
    public static void main(String sk[]){
        class Person {
            private String name;
            private int age;

            // Constructor, getters
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public int getAge() {
                return age;
            }
        }

        List<Person> persons=new ArrayList<>(Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        ));

        Function<Person,Integer> getAge=person -> person.getAge();

        int sum=persons.stream().collect(Collectors.summingInt(getAge::apply));
        System.out.println("Sum using summingInt : "+sum);

        int sum2= persons.stream().mapToInt(getAge::apply).sum();
        System.out.println("Sum using mapToInt()->sum() : "+sum2);

    }
}
