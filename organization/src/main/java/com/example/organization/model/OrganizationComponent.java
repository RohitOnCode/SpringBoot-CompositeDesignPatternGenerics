package com.example.organization.model;

import java.util.List;

// Component Interface
public interface OrganizationComponent<T> {
    void add(T component);
    void remove(T component);
    List<T> getChildren();
    void showDetails();
}
