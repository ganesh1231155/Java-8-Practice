package org.study.FunctionalInterfaces.mediumLevel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class WriteSupplierOfUserName {
    public static void main(String sk[]) {
        Supplier<List<String>> userSupplier = () ->  Arrays.asList("PixelVoyager",
                                                                    "EchoNova",
                                                                    "SwiftShadow",
                                                                    "CodeCrusader",
                                                                    "LunaTrace",
                                                                    "QuantumWhirl",
                                                                    "NeonFlicker",
                                                                    "FrostByteX",
                                                                    "SilentOrbit",
                                                                    "VibeCircuit");
        userSupplier.get().stream().forEach(System.out::println);
    }
}
