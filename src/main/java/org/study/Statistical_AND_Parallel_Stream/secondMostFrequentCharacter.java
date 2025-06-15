package org.study.Statistical_AND_Parallel_Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class secondMostFrequentCharacter {
    public static void main(String sk[]){
//        Find the second most frequent character from a string.
        String str="An actuator is a machine that moves or controls components in a system by converting energy into physical motion. " +
                "This energy can come from electricity, water pressure, or air pressure. " +
                "Depending on its design and the desired motion, an actuator can produce linear or rotary movement.";

        str.chars()
                .mapToObj(ch->(char)ch)
                .filter(ch->(ch!=' ' && ch!='.'))
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
                .skip(1)
                .findFirst()
                .ifPresentOrElse(System.out::println,()->System.out.println("No Record Found."));

    }
}
