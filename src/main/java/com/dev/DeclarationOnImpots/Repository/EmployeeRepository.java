package com.dev.DeclarationOnImpots.Repository;

import com.dev.DeclarationOnImpots.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    @Query("select c from Employee c where c.NumEmployee = ?1")
    Employee findOne(Long NumEmployee);
}