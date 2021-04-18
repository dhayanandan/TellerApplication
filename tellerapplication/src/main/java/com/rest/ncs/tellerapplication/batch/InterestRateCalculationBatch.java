package com.rest.ncs.tellerapplication.batch;

import com.rest.ncs.tellerapplication.model.Expense;
import com.rest.ncs.tellerapplication.repository.ExpenseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InterestRateCalculationBatch {
    final static Logger logger = LoggerFactory.getLogger(InterestRateCalculationBatch.class);

    @Autowired
    ExpenseRepository repository;

    @Scheduled(cron = "*/50 * * ? * *")
    public void calculateInterest() {
        List<Expense> allExpense = repository.findAll();
        logger.info("Revise Interest");
        List<Expense> revisedExpenses = allExpense.stream()
                .map((item) -> new Expense(item.getId(),item.getItem(), item.getAmount() * 2)).collect(Collectors.toList());
        repository.saveAll(revisedExpenses);
    }

}
