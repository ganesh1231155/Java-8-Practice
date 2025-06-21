package org.study.FunctionalInterfaces.hardLevel;

import java.util.Map;
import java.util.function.BiFunction;

public class GenerateFormatedMessageUsingBiFunction {
    public static void main(String sk[]){
        BiFunction<String,Integer,String> messageGenerator=(string,Int)->string+" has scored "+Int+" marks.";
        Map<String, Integer> studentMarks = Map.of(
                "Alice", 85,
                "Bob", 72,
                "Charlie", 90,
                "Diana", 67,
                "Eve", 95
        );
        studentMarks.entrySet().stream().forEach(entity->System.out.println(messageGenerator.apply(entity.getKey(), entity.getValue())));
    }
}
