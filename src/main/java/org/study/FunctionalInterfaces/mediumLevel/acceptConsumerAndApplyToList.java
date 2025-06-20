package org.study.FunctionalInterfaces.mediumLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class acceptConsumerAndApplyToList {
    public static void main(String sk[]){
        List<String> names=new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        applyToAll(names, str->System.out.print(str.toUpperCase()+"\t"));
        applyToAll(names, str->System.out.print(str.toLowerCase()+"\t"));
        applyToAll(names, str->System.out.print(str+" : "+str.length()+"\t"));

    }
    public static void applyToAll( List<String> names, Consumer<String> action){
        names.stream().forEach(name->action.accept(name));
        System.out.println();
    }
}
