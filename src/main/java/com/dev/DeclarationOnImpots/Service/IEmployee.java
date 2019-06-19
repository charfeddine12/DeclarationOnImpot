package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.Employee;

import java.util.List;


public interface IEmployee {
    void add(Employee employee);

    Employee update(Employee employee);

    List<Employee> findAll();

    Employee findOne(Long NumEmployee);

    public boolean supprimer(Long NumEmployee);
}
