package org.study.FunctionalInterfaces;

@FunctionalInterface
interface checkEmpty<T>{
    boolean check(T t);
}
public class CheckEmptyStringPredicate {
    public static void main(String sk[])
    {
        checkEmpty<String> isEmpty=str->str.length()==0;
        System.out.println(isEmpty.check("Shreeganesh")?"Entered String is Empty":"Valid String");
    }

}
