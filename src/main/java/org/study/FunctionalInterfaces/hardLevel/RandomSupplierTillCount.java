package org.study.FunctionalInterfaces.hardLevel;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Generator{
    public static <T> List<T> generateRandoms(Supplier<T> supplier, int count)
    {
        return Stream.generate(supplier).limit(count).collect(Collectors.toList());
    }

}
public class RandomSupplierTillCount {
    public static void main(String sk[])
    {
        Supplier<Integer> NumberGenerator=()->new Random().nextInt(100);

        List<Integer> randomNumbers=Generator.generateRandoms(NumberGenerator,10);
        System.out.println(randomNumbers);
    }
}
