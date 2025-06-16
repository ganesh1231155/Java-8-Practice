package org.study.FunctionalInterfaces;

@FunctionalInterface
interface Function<T,R>{
    R apply(T t);
}
public class LengthOfString {
    public static void main(String sk[])
    {
        Function<String, Integer> findLength=str->str.length();

        System.out.println(findLength.apply("Shreeganesh Manik Kolte"));
    }
}
