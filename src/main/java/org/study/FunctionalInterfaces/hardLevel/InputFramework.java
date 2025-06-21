package org.study.FunctionalInterfaces.hardLevel;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InputFramework {
    public static <T,R> void processInput(Supplier<T> supplier,
                                          Predicate<T> validator,
                                          Function<T,R> transformer,
                                          Consumer<R> consumer )
    {
        T input=supplier.get();
        if(!validator.test(input)){
            System.out.println("Invalid Input");
            return;
        }
        R result=transformer.apply(input);
        consumer.accept(result);
    }

    public static void main(String sk[]){
        Scanner sc=new Scanner(System.in);
        Supplier<String> inputSupplier=()->{
            System.out.print("Enter a Number :");
            return sc.nextLine();
        };

        Predicate<String> isNumeric=str->str.matches("\\d+");

        Function<String,Integer> toSquare=str->{
            Integer num=Integer.parseInt(str);
            return num*num;
        };

        Consumer<Integer> printer=num->System.out.println("Squared Value : "+num);
        processInput(inputSupplier,isNumeric,toSquare,printer);
    }
}
