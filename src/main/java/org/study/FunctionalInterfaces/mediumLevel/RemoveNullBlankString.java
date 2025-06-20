package org.study.FunctionalInterfaces.mediumLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullBlankString {
    public static  void main(String sk[]){
        Predicate<String> nullOrEmpty=(str)-> (str==null || str.trim().isEmpty());
        List<String> list= new ArrayList<>(Arrays.asList("PixelVoyager",
                "EchoNova",
                null,
                "SwiftShadow",
                "",
                "CodeCrusader",
                "LunaTrace",
                "QuantumWhirl",
                "",
                "NeonFlicker",
                "FrostByteX",
                "",
                null,
                "SilentOrbit",
                "VibeCircuit"));
        list.removeIf(nullOrEmpty);
        System.out.println("Filtered List : "+list);
    }
}
