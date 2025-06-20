package org.study.FunctionalInterfaces.mediumLevel;

import java.util.function.BinaryOperator;

public class BinaryOperatorToMergeStrings {
    public static void main(String sk[])
    {
        BinaryOperator<String> merger=(str1,str2)->str1+" "+str2;
        System.out.println(merger.apply("Hello","World!"));
    }
}
