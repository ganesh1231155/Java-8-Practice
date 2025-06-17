package org.study.FunctionalInterfaces.mediumLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PrintMapDataByBinaryConsumer {
    public static void main(String sk[]){
        Map<String, Integer> nameAgeMap = new HashMap<>();
        // Add 10 records
        nameAgeMap.put("Alice", 30);
        nameAgeMap.put("Bob", 25);
        nameAgeMap.put("Charlie", 35);
        nameAgeMap.put("Diana", 28);
        nameAgeMap.put("Ethan", 22);
        nameAgeMap.put("Fiona", 31);
        nameAgeMap.put("George", 40);
        nameAgeMap.put("Hannah", 27);
        nameAgeMap.put("Ivan", 33);
        nameAgeMap.put("Julia", 26);
        BiConsumer<String,Integer> printer=(name,age)->System.out.println(name+" is "+age+" years old.");

        nameAgeMap.forEach(printer);
    }
}
