package org.study.FunctionalInterfaces.mediumLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class doubleElementOfList {
    public static void main(String sk[]){
        List<Integer> list=new ArrayList<>(Arrays.asList(11,22,33,44,55,66,77,88,99));
        UnaryOperator<Integer> doubleAll=num-> num*2;
        list.stream().map(doubleAll).forEach(System.out::println);
    }

}
