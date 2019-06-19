package com.dev.DeclarationOnImpots.Service.impl;

import com.dev.DeclarationOnImpots.Entity.Employee;
import com.dev.DeclarationOnImpots.Repository.EmployeeRepository;
import com.dev.DeclarationOnImpots.Service.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements IEmployee {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void add(Employee employee) {
        this.employeeRepository.save(employee);

    }

    @Override
    public Employee update(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {

        return (List<Employee>) this.employeeRepository.findAll();
    }

    @Override
    public Employee findOne(Long NumEmployee) {

        return this.employeeRepository.findOne(NumEmployee);
    }

    @Override
    public boolean supprimer(Long NumEmployee) {
        employeeRepository.deleteById(NumEmployee);
        return true;
    }

}
