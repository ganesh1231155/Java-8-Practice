package org.study.FunctionalInterfaces;
@FunctionalInterface
interface Predicate<T>{
    boolean check(T t);
}

public class EvenOrOdd {
    public static void main(String sk[]) {
        Predicate<Double> evenOdd = num -> num % 2 == 0;
        System.out.println(evenOdd.check((double)1)?"Number is Even.":"Number is Odd.");
    }
}
