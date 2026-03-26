package com.vanshika.Expense.Tracker.repository;

import com.vanshika.Expense.Tracker.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
}