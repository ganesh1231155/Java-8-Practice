package org.study.FunctionalInterfaces.mediumLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalAndPredicateTogether {
    public static  void main(String sk[])
    {
        Function<String,Integer> getLen=str->str.length();
        Predicate<Integer> checkLen=num->num>5;


        List<String> names=new ArrayList<>(Arrays.asList(   "Isabelle",
                                                            "Max",
                                                            "Nia",
                                                            "Juliana",
                                                            "Leo",
                                                            "Sophia",
                                                            "Zara",
                                                            "Theodore",
                                                            "Ivy",
                                                            "Nathan"));

        names.stream().filter(str->checkLen.test(getLen.apply(str))).forEach(System.out::println);

    }
}
