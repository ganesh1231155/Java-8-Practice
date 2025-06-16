package org.study.FunctionalInterfaces;

@FunctionalInterface
interface consumer<T>{
    void print(T t);
}
public class ConsumerInter {
    public static void main(String sk[]){
        consumer<String> messanger=str-> System.out.println(str);
        messanger.print("Hello World!");
    }
}
