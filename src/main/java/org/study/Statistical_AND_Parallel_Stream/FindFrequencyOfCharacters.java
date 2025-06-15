package org.study.Statistical_AND_Parallel_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfCharacters {
    public static void main(String sk[]){
//        Find the frequency of characters in a list of strings and return a Map<Character, Long>.
        List<String> strs=new ArrayList<>(Arrays.asList("Hello","World","Wellcome"));
        Map<Character,Long> freqMap=strs.stream()
                .flatMapToInt(String::chars)
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(freqMap);
    }
}
