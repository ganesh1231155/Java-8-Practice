package org.study.FunctionalInterfaces.mediumLevel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StroreStringLengthFormat {

    public static void  main(String sk[]) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherries", "Dates", "EggFruit", "lichi", "Avocado", "Mango");
        Function<String, Integer> stringLength = str -> str.length();
        List<Integer> lens=strings.stream()
                .map(stringLength)
                .collect(Collectors.toList());
        System.out.println(lens);
    }

}
