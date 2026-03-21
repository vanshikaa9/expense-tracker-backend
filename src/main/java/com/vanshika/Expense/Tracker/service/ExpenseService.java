package com.vanshika.Expense.Tracker.service;

import com.vanshika.Expense.Tracker.model.Expense;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {

    private List<Expense> expenses = new ArrayList<>();
    private Long currentId = 1L;

    public Expense addExpense(Expense expense) {
        expense.setId(currentId++);
        expenses.add(expense);
        return expense;
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public void deleteExpense(Long id) {
        expenses.removeIf(expense -> expense.getId().equals(id));
    }


    public Expense updateExpense(Long id, Expense updatedExpense) {
        for (Expense expense : expenses) {
            if (expense.getId().equals(id)) {
                expense.setTitle(updatedExpense.getTitle());
                expense.setAmount(updatedExpense.getAmount());
                expense.setCategory(updatedExpense.getCategory());
                return expense;
            }
        }
        return null;
    }
}