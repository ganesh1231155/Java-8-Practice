package org.study;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MostCommenWordInString {
    public static void main(String sk[]){
        String sentence="apple banana apple orange banana apple pear orange banana lemon apple";

        Arrays.stream(sentence.split("\\s+"))
                .map(word->word.toLowerCase())
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
