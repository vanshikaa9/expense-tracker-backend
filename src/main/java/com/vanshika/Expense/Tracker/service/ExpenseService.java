package com.vanshika.Expense.Tracker.service;

import com.vanshika.Expense.Tracker.model.Expense;
import com.vanshika.Expense.Tracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    public Expense addExpense(Expense expense) {
        return repo.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return repo.findAll();
    }

    public void deleteExpense(String id) {
        repo.deleteById(id);
    }

    public Expense updateExpense(String id, Expense updatedExpense) {
        updatedExpense.setId(id);
        return repo.save(updatedExpense);
    }
}