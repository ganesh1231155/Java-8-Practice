package org.study.Statistical_AND_Parallel_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class averageSalary {
    public static void main(String sk[]){
//        Create a Map<String, Double> of department to average salary of employees with experience > 5 years.
        class Employee {
            private int id;
            private String name;
            private String department;
            private double salary;
            private int experience;

            // All-args constructor
            public Employee(int id, String name, String department, double salary, int experience) {
                this.id = id;
                this.name = name;
                this.department = department;
                this.salary = salary;
                this.experience = experience;
            }

            // Getters
            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public String getDepartment() {
                return department;
            }

            public double getSalary() {
                return salary;
            }

            public int getExperience() {
                return experience;
            }

            // Setters
            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setDepartment(String department) {
                this.department = department;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            public void setExperience(int experience) {
                this.experience = experience;
            }

            // toString()
            @Override
            public String toString() {
                return String.format(
                        "Employee{id=%d, name='%s', department='%s', salary=%.2f, experience=%d}",
                        id, name, department, salary, experience
                );
            }
        }

        List<Employee> employees=new ArrayList<>(Arrays.asList(
                new Employee(1, "Alice", "IT", 90000, 5),
                new Employee(2, "Bob", "HR", 60000, 3),
                new Employee(3, "Charlie", "Sales", 75000, 6),
                new Employee(4, "David", "Finance", 88000, 8),
                new Employee(5, "Eve", "Marketing", 70000, 4),
                new Employee(6, "Frank", "IT", 95000, 10),
                new Employee(7, "Grace", "HR", 62000, 2),
                new Employee(8, "Hannah", "Sales", 79000, 7),
                new Employee(9, "Ian", "Finance", 85000, 5),
                new Employee(10, "Jack", "Marketing", 72000, 3),
                new Employee(11, "Kathy", "IT", 98000, 12),
                new Employee(12, "Leo", "HR", 64000, 4),
                new Employee(13, "Mona", "Sales", 77000, 5),
                new Employee(14, "Nate", "Finance", 87000, 6),
                new Employee(15, "Olivia", "Marketing", 71000, 3),
                new Employee(16, "Paul", "IT", 92000, 9),
                new Employee(17, "Quinn", "HR", 63000, 2),
                new Employee(18, "Rachel", "Sales", 76000, 4),
                new Employee(19, "Sam", "Finance", 89000, 7),
                new Employee(20, "Tina", "Marketing", 73000, 6)
        ));

        employees.stream()
                .filter(emp->emp.getExperience()>5)
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                .forEach((dept,avgSal)->System.out.println(dept+" : "+avgSal));
    }
}
