package org.study.FunctionalInterfaces.mediumLevel;

import java.util.function.Function;

public class CheckPrimeNumber {
    public static void main(String sk[]){
        Function<Integer,Boolean> primeCheck=num->{
            if(num<=1) return false;
            if(num==2) return true;
            if(num%2==0) return false;
            for(int i=3;i<Math.sqrt(num);i+=2){
                if(num%i==0) return false;
            }
            return true;
        };
        Integer number=13;
        System.out.println(number+" is Prime? : "+primeCheck.apply(number));
    }
}
