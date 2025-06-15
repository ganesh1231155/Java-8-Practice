package org.study.Statistical_AND_Parallel_Stream;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GenerateHistogramFromList {
//    Generate a histogram (map of score range to count) from a list of student scores.
    public static void main(String sk[])
    {
        List<Integer> scores = List.of(
                5, 12, 18, 21, 35, 37, 42, 49, 53, 58,
                60, 65, 69, 72, 78, 80, 84, 90, 95, 100
        );
        scores.stream()
                .collect(Collectors.groupingBy(score->((int)score/10)*10, TreeMap::new,Collectors.counting()))
                .forEach((start,count)-> System.out.println(start+"-"+(start+9)+" : "+count));
    }
}
