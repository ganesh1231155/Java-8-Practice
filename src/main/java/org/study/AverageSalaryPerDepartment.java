package org.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class employee{
    int id;
    int dptNo;
    String name;
    double salary;
    employee(int id,int dptNo,String name,double salary){
        this.id=id;
        this.dptNo=dptNo;
        this.name=name;
        this.salary=salary;
    }
    public int getId(){
        return this.id;
    }
    public int getDptNo(){
        return this.dptNo;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
}
public class AverageSalaryPerDepartment {
    public static void main(String sk[]){

        List<employee> employees=new ArrayList<>(Arrays.asList(
                        new employee(1,101,"ABC",30000),
                        new employee(2,102,"EFG",45000),
                        new employee(3,101,"LMN",35000),
                        new employee(4,102,"IJK",25000),
                        new employee(5,101,"PQR",50000),
                        new employee(6,102,"UVW",40000),
                        new employee(7,101,"XYZ",30000),
                        new employee(8,102,"QWERT",60000),
                        new employee(9,101,"PLMON",55000),
                        new employee(10,102,"QAZWSX",49000),
                        new employee(11,103,"Ram",100000),
                        new employee(12,103,"Sham",200000),
                        new employee(13,103,"Baburao",150000)
                ));
        employees.stream().collect(Collectors.groupingBy(employee ::getDptNo,Collectors.averagingDouble(employee::getSalary))).forEach((dpt,avg)->System.out.println(dpt+" : "+avg));
    }
}
