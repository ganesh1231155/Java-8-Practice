package org.study;

import java.util.*;
import java.util.stream.Collectors;

public class FrequentElementOfList {
    public static void main(String sk[]){
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,8,9,5,6,3,4,8,9,1,4,6));
        Integer mostFrequent=list.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(mostFrequent);
    }
}
