package com.rest.ncs.repository;


import com.rest.ncs.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
}