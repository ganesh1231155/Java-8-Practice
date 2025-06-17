package org.study.FunctionalInterfaces;

import java.time.LocalDate;

@FunctionalInterface
interface localDate<T>{
    T getDate();
}

public class dateSupplier {
    public static void main(String sk[]){
        localDate<LocalDate> localDate=()-> LocalDate.now();
        System.out.println("Date: "+localDate.getDate());

    }
}
