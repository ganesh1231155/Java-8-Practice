package org.study.FunctionalInterfaces;

@FunctionalInterface
interface consumer<T>{
    void print(T t);
}

@FunctionalInterface
interface mathSquare<T>{
    void print(T t);
}
public class ConsumerInter {
    public static void main(String sk[]){
        consumer<String> messanger=str-> System.out.println(str);
        messanger.print("Hello World!");

        mathSquare<Double> mathSqr=num->System.out.println(num+"*"+num+"="+num*num);
        mathSqr.print(12.0);
    }
}
