package com.rest.ncs.tellerapplication;

import com.rest.ncs.tellerapplication.controller.EmployeeController;
import com.rest.ncs.tellerapplication.model.Expense;
import com.rest.ncs.tellerapplication.repository.ExpenseRepository;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;

@SpringBootApplication
@EnableScheduling
public class TellerapplicationApplication {
	public static void main(String[] args) {
		SpringApplication.run(TellerapplicationApplication.class, args);
	}
}
