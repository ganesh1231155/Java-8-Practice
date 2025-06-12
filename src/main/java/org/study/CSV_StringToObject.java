package org.study;

import java.util.Arrays;

class Person{
    private String name;
    private int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name+"("+this.age+")";
    }
}
public class CSV_StringToObject {
    public static void main(String sk[]){

        String csv="name,age\nAlice,30\nBob,25\nCharlie,28\nDavid,35\nEve,22\nFrank,40\nGrace,27\nHannah,31\nIvan,29\nJulia,33";

        Arrays.stream(csv.split("\n"))
                .skip(1)
                .map(line->line.split(","))
                .map(record->new Person(record[0],Integer.parseInt(record[1])))
                .forEach(System.out::println);
    }
}
