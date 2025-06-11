package org.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class top3HighestPaidEmployees {
    class Employee{
        int id,deptNo;
        String name;
        double salary;
        Employee(int id,int deptNo,String name, double salary){
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.deptNo = deptNo;
        }
        int getId(){
            return this.id;
        }
        String getName(){
            return this.name;
        }
        int getDeptNo(){
            return this.deptNo;
        }
        double getSalary() {
            return this.salary;
        }
    }

    public static void main(String sk[]){
        top3HighestPaidEmployees top3=new top3HighestPaidEmployees();
        List<Employee> employees=new ArrayList<>(Arrays.asList(
                top3.new Employee(1,101,"ABC",30000),
                top3.new Employee(2,102,"EFG",45000),
                top3.new Employee(3,101,"LMN",35000),
                top3.new Employee(4,102,"IJK",25000),
                top3.new Employee(5,101,"PQR",50000),
                top3.new Employee(6,102,"UVW",40000),
                top3.new Employee(7,101,"XYZ",30000),
                top3.new Employee(8,102,"QWERT",60000),
                top3.new Employee(9,101,"PLMON",55000),
                top3.new Employee(10,102,"QAZWSX",49000),
                top3.new Employee(11,103,"Ram",100000),
                top3.new Employee(12,103,"Sham",200000),
                top3.new Employee(13,103,"Baburao",150000)
        ));

        employees.stream().sorted((emp1,emp2)-> (int) (emp2.getSalary()-emp1.getSalary())).limit(3).forEach(emp->System.out.println(emp.getId()+"  ||  "+emp.getDeptNo()+"  ||  "+emp.getName()+"  ||  "+emp.getSalary()));
    }


}
