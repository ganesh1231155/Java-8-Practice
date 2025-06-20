package org.study.FunctionalInterfaces.hardLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuntionalInterfaceWithGenericMethod {
    public static void main(String sk[]){
        Function<String,String> transform=str->str.trim().toUpperCase();
        List<String> names=new ArrayList<>(Arrays.asList(   "Isabelle",
                "Max",
                "Nia",
                "Juliana",
                "Leo",
                "Sophia",
                "Zara",
                "Theodore",
                "Ivy",
                "Nathan"));
        System.out.println(genericMethod(names,transform));

    }
    public static <T,R> List<R> genericMethod(List<T> dataList, Function<T,R> transform){

        return  dataList.stream().map(transform).collect(Collectors.toList());
    }


}
