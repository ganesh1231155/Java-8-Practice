package org.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateSummaryStatisticOfList {
    public static void main(String sk[])
    {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        IntSummaryStatistics stats=list.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
        System.out.println(stats.getMax());

    }


}
