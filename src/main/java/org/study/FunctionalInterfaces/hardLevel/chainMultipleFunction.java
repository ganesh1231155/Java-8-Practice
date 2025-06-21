package org.study.FunctionalInterfaces.hardLevel;

import java.util.function.Function;

public class chainMultipleFunction {
    public static void main(String sk[]){
        Function<String,String> toLower=String::toLowerCase;
        Function<String,String> trim=String::trim;
        Function<String,Integer> len=String::length;
        Function<String,Integer> pipeline=toLower.andThen(trim).andThen(len);

        System.out.println(pipeline.apply("  Shreeganesh Kolte.  "));
        System.out.println(pipeline.apply("Shreeganesh Kolte."));

    }
}
