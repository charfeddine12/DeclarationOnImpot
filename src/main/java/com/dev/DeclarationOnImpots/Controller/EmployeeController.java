package com.dev.DeclarationOnImpots.Controller;

import com.dev.DeclarationOnImpots.Entity.Employee;
import com.dev.DeclarationOnImpots.Service.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "employees", headers = "Accept=application/json")

public class EmployeeController {
    @Autowired
    private IEmployee employeeService;

    @GetMapping(value = "/all")
    public @ResponseBody
    List<Employee> getAllEmployees() {
        return this.employeeService.findAll();
    }

    @GetMapping(value = "/find/{NumEmployee}")
    public Employee findOne(@PathVariable Long NumEmployee) {
        return this.employeeService.findOne(NumEmployee);
    }

    @PostMapping(value = "/add")
    public void addEmployee(@RequestBody Employee l) {
        this.employeeService.add(l);
    }

    @PutMapping(value = "/update")
    public Employee update(@RequestBody Employee l) {
        return this.employeeService.update(l);
    }

    @DeleteMapping(value = "/delete/{NumEmployee}")
    public boolean supmrimer(@PathVariable Long NumEmployee) {
        employeeService.supprimer(NumEmployee);
        return true;
    }

}
