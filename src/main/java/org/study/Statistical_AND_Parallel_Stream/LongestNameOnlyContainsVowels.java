package org.study.Statistical_AND_Parallel_Stream;

import java.util.Comparator;
import java.util.List;


public class LongestNameOnlyContainsVowels {
    public static void main(String sk[]){
//        Given a list of names, find the longest name that contains only vowels.
        List<String> names = List.of(
                "Alice",
//                "Aio",
                "Bob",
                "Charlie",
                "Diana",
//                "Oea",
                "Ethan",
                "Fiona",
                "George",
//                "Ioae",
                "Hannah",
                "Isaac",
//                "Eio",
                "Jasmine",
                "Kevin",
                "Luna",
//                "Aiou",
                "Michael",
                "Nina",
                "Oscar"
        );

        names.stream()
                .filter(name->name.matches("[aeiouAEIOU]+"))
                .max(Comparator.comparingInt(String::length))
                .ifPresentOrElse(System.out::println,()->System.out.println("Not Found."));
    }
}
