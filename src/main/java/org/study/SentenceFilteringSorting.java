package org.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceFilteringSorting {
    public static void main(String sk[]){
        List<List<String>> strings = new ArrayList<>(Arrays.asList(
                Arrays.asList("Apple"),
                Arrays.asList("banana", "Mango"),
                Arrays.asList("Cherry", "fig", "Grape"),
                Arrays.asList("kiwi"),
                Arrays.asList("Date", "lemon"),
                Arrays.asList("Strawberry"),
                Arrays.asList("papaya", "Orange"),
                Arrays.asList("nectarine"),
                Arrays.asList("raspberry", "Plum", "pear"),
                Arrays.asList("Avocado"),
                Arrays.asList("tomato", "Quince"),
                Arrays.asList("jackfruit"),
                Arrays.asList("blueberry", "Fig"),
                Arrays.asList("Coconut"),
                Arrays.asList("dragonfruit", "Apple", "banana"),
                Arrays.asList("elderberry"),
                Arrays.asList("Pear", "Mango"),
                Arrays.asList("grape"),
                Arrays.asList("Honeydew", "kiwi"),
                Arrays.asList("Zucchini"),
                Arrays.asList("Mango", "papaya"),
                Arrays.asList("Orange", "banana", "lemon"),
                Arrays.asList("fig"),
                Arrays.asList("Peach", "plum"),
                Arrays.asList("Indian fig"),
                Arrays.asList("apple", "banana"),
                Arrays.asList("nectarine", "pear", "fig")
        ));
        strings.stream().flatMap(lst->lst.stream()).map(word->word.toLowerCase()).distinct().sorted().forEach(System.out::println);
    }
}
