package org.study;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeGroupingByDepartmentThenByDesignation {

    class Employee {
        private String name;
        private String department;
        private String designation;

        // Constructor, Getters, and toString()
        public Employee(String name, String department, String designation) {
            this.name = name;
            this.department = department;
            this.designation = designation;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public String getDesignation() {
            return designation;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static void main(String sk[]){
        EmployeeGroupingByDepartmentThenByDesignation obj=new EmployeeGroupingByDepartmentThenByDesignation();
        List<Employee> employees = Arrays.asList(
                obj.new Employee("Alice", "HR", "Manager"),
                obj.new Employee("Bob", "HR", "Executive"),
                obj.new Employee("Charlie", "IT", "Developer"),
                obj.new Employee("David", "IT", "Developer"),
                obj.new Employee("Eve", "IT", "Manager"),
                obj.new Employee("Frank", "Finance", "Executive")
        );

        Map<String, Map<String,List<Employee>>> groups=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getDesignation)));
        groups.forEach((dept,desMap)->{
                    System.out.println("Department: "+dept);
                    desMap.forEach((des,empList)->{
                        System.out.println("designation: "+des+"->"+empList);
                    });
                });
    }
}
