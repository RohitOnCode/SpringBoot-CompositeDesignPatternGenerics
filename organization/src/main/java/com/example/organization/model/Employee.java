package com.example.organization.model;

import java.util.List;

// Leaf Class
public class Employee implements OrganizationComponent<Employee> {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void add(Employee component) {
        throw new UnsupportedOperationException("Leaf nodes can't add components.");
    }

    @Override
    public void remove(Employee component) {
        throw new UnsupportedOperationException("Leaf nodes can't remove components.");
    }

    @Override
    public List<Employee> getChildren() {
        throw new UnsupportedOperationException("Leaf nodes don't have children.");
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name + ", Department: " + department);
    }
}
