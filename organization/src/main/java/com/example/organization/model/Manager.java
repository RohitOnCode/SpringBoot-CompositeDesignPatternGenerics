package com.example.organization.model;

import java.util.ArrayList;
import java.util.List;

// Composite Class
public class Manager<T extends OrganizationComponent<T>> implements OrganizationComponent<T> {
    private String name;
    private String position;
    private List<T> children = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void add(T component) {
        children.add(component);
    }

    @Override
    public void remove(T component) {
        children.remove(component);
    }

    @Override
    public List<T> getChildren() {
        return children;
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Position: " + position);
        for (T child : children) {
            child.showDetails();
        }
    }
}
