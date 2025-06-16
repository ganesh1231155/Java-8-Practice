package org.study.FunctionalInterfaces;

import java.util.Random;

interface randomNumber<T>{
    T generate();
}


public class SupplierInterface {
    public static void main(String sk[]) {
        randomNumber<Double> random=()-> Math.random()*100;
        System.out.println(random.generate());
    }
}
