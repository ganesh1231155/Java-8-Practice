package org.study.FunctionalInterfaces;

@FunctionalInterface
interface concatination<T,R,U>{
    T concat(U u, R r);
}

public class ConcatinationBiFunctionalInterface {
    public static void main(String sk[]){
        concatination<String,String,String> strOpe=(str1,str2)->str1+" "+str2;
        System.out.println(strOpe.concat("Shreeganesh","Kolte"));
    }
}
