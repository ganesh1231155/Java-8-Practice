package org.study.Statistical_AND_Parallel_Stream;

import java.util.stream.IntStream;

public class SumOfNumbersDivisibleBy13 {
    public static void main(String sk[]) {
//        Given a stream of numbers (1 to 10 million), find the sum of all numbers divisible by 13 using parallelStream().
        System.out.println(IntStream.range(1,10000001).filter(n->n%13==0).asLongStream().sum());
    }
}
