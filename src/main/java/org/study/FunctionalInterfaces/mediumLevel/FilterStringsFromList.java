package org.study.FunctionalInterfaces.mediumLevel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStringsFromList {
    public static void main(String sk[])
    {
        List<String> strings= Arrays.asList("Apple","Banana","Cherries","Dates","EggFruit","lichi","Avocado","Mango");
        Predicate<String> lessThanFilter=str->str.length()>=6;
        List<String> filtered=strings.stream().filter(lessThanFilter).collect(Collectors.toList());
        System.out.println(filtered);
    }
}
