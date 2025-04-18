package com.example.organization;

import com.example.organization.model.Employee;
import com.example.organization.model.Manager;

public class CompositePatternApplication {
    public static void main(String[] args) {
        // Leaf nodes
        Employee emp1 = new Employee("Alice", "HR");
        Employee emp2 = new Employee("Bob", "Finance");

        // Composite node
        Manager<Employee> manager = new Manager<>("Charlie", "General Manager");
        manager.add(emp1);
        manager.add(emp2);

        // Display the hierarchy
        manager.showDetails();
    }
}
