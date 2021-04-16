package com.rest.ncs.controller;

import com.rest.ncs.model.Employee;
import com.rest.ncs.repository.EmployeeRepository;
import org.keycloak.representations.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    /*List<Employee> employeesList= Arrays.asList(new Employee(1,"hameed","IT"),
            new Employee(1,"shaik","IT"));*/

    @RolesAllowed("admin")
    @PostMapping("/employees")
    public ResponseEntity<Employee> save(@RequestBody Employee employee ){
        return ResponseEntity.ok(repository.save(employee));
    }

  //  @RolesAllowed("user")
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAll(){
        return  ResponseEntity.ok(repository.findAll());
    }
}