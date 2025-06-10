package org.study;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String sk[]){
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,3,5,8,9));
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(ele->ele.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
