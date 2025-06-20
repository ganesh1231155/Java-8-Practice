package org.study.FunctionalInterfaces.hardLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class filteringWithMethodAndPredicate {
    public static void main(String sk[]){
        List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        Predicate<Integer> evenPredicate=num->num%2==0;
        Predicate<Integer> oddPredicate=num->num%2!=0;
        System.out.println("Even Numbers: "+filterWithPredicate(numbers,evenPredicate));
        System.out.println("Odd Numbers: "+filterWithPredicate(numbers,oddPredicate));
    }
    public static <T> List<T> filterWithPredicate(List<T> nums, Predicate<T> filter){
        return nums.stream().filter(filter).collect(Collectors.toList());
    }

}
