package org.study.FunctionalInterfaces.hardLevel;

import org.study.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class checkPalindromeUsingPredicate {
    public static void main(String sk[]){
        Predicate<String> isPalindrome=(string)->{
            if(string==null) return false;
            int len=string.length();
            for(int i=0;i<len/2;i++){
                if(string.charAt(i)!=string.charAt(len-1-i)) return false;
            }
            return true;
        };
        List<String> strings = new ArrayList<>(Arrays.asList("madam","racecar","apple","banana","level","world","noon","hello"  ));
        strings.stream().collect(Collectors.toMap(str->str, isPalindrome::test)).forEach((key, val)->System.out.println(key+" : "+val));
    }
}
