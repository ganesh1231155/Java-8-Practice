package org.study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OldestEmpInEachDept {
     class Employee {
        private String name;
        private String department;
        private int age;

        public Employee(String name, String department, int age) {
            this.name = name;
            this.department = department;
            this.age = age;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public int getAge() { return age; }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String sk[]){
        OldestEmpInEachDept obj=new OldestEmpInEachDept();
        List<Employee> employees = Arrays.asList(
                obj.new Employee("Alice", "HR", 45),
                obj.new Employee("Bob", "HR", 38),
                obj.new Employee("Charlie", "IT", 50),
                obj.new Employee("David", "IT", 50),
                obj.new Employee("Eve", "Finance", 42),
                obj.new Employee("Frank", "Finance", 39)
        );
        String info=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)),emp->emp.map(Employee::getName).orElse("")))).values().stream().collect(Collectors.joining(", "));
        System.out.println(info);


    }
}
