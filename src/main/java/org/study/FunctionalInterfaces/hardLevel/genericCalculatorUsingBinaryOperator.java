package org.study.FunctionalInterfaces.hardLevel;

import java.util.function.BinaryOperator;

class Caculator{
    public static <T> T calculate(T a, T b, BinaryOperator<T> operator)
    {
        return operator.apply(a,b);
    }

}
public class genericCalculatorUsingBinaryOperator{
    public static void main(String sk[]){

        BinaryOperator<String> concat=String::concat;
        BinaryOperator<Integer> addition=Integer::sum;
        BinaryOperator<Double> multiplier=(a,b)->a*b;
        System.out.println(Caculator.calculate("10","20",concat));
        System.out.println(Caculator.calculate(10,20,addition));
        System.out.println(Caculator.calculate(10.10,20.20,multiplier));
    }
}
