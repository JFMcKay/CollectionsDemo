package com.revature.collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Jeremy", 2300);
        Employee employee2 = new Employee(106, "Beremy", 2200);
        Employee employee3 = new Employee(103, "Ceremy", 1400);
        Employee employee4 = new Employee(109, "Deremy", 2100);
        Employee employee5 = new Employee(105, "Feremy", 2090);

        System.out.println("\n+++++++++++++++++++++++++++++\n");

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        System.out.println("\n+++++++++++++++BEFORE SORT++++++++++++++\n");

        for(Employee emp:employeeList) {
            System.out.println(emp);
        }

        System.out.println("\n++++++++++++++COMPARABLE ID SORT+++++++++++++++\n");
        Collections.sort(employeeList);

        for(Employee emp:employeeList) {
            System.out.println(emp);
        }
        System.out.println("\n++++++++++++++COMPARATOR SALARY SORT+++++++++++++++\n");
        Collections.sort(employeeList, ((o1, o2) -> {
            return o1.getSalary() - o2.getSalary();
        }));
        for(Employee emp:employeeList) {
            System.out.println(emp);
        }

        System.out.println("\n++++++++++++++COMPARATOR ID SORT+++++++++++++++\n");
        // Uses the Comparator method comparingInt(element::getter) to set the sort
        Collections.sort(employeeList, (Comparator.comparingInt(Employee::getId)));
        for(Employee emp:employeeList) {
            System.out.println(emp);
        }

        System.out.println("\n++++++++++++++COMPARATOR NAME SORT+++++++++++++++\n");
        Collections.sort(employeeList, ((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        }));
        for(Employee emp:employeeList) {
            System.out.println(emp);
        }
    }
}
