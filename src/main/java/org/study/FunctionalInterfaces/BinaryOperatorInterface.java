package org.study.FunctionalInterfaces;

interface binaryOperator<T,U,R>{
    R perform(T t,U u);
}
public class BinaryOperatorInterface {
    public static void main(String sk[]){
        binaryOperator<Integer,Integer,Integer> operator=(a,b)->a*b;
        System.out.println(operator.perform(10,20));
    }
}
