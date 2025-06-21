package org.study.FunctionalInterfaces.hardLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    public static void main(String sk[]){
        Predicate<String> checkLen=str->str.trim().length()>5;
        Consumer<String> print=str->System.out.println(str);

        List<String> strings = new ArrayList<>(Arrays.asList("madam","racecar","apple","banana","level","world","noon","hello"  ));
        strings.stream().filter(checkLen).forEach(print);
    }
}
