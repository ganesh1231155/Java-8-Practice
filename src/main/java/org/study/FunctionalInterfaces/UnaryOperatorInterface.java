package org.study.FunctionalInterfaces;

@FunctionalInterface
interface upperCase<T,R>{
    T apply(R r);
}
public class UnaryOperatorInterface {
    public static void main(String sk[]){
        upperCase<String,String> upperCase=str->str.toUpperCase();
        System.out.println(upperCase.apply("Shreeganesh Kolte."));
    }
}
