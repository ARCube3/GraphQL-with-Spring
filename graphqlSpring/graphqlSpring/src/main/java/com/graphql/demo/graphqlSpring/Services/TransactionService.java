package com.graphql.demo.graphqlSpring.Services;

import java.util.List;

import com.graphql.demo.graphqlSpring.entities.Transaction;

public interface TransactionService {

	//create
	
		Transaction create(Transaction transaction);
		
		//get all
		
		List<Transaction> getAll();
		
		//get single transaction
		
		Transaction get(int id);
		
		
		List<Transaction> getTransactions(int participantId);
		
		
		Transaction updateTransaction(int id, float amount, String receiver);
		
		
		void deleteTransaction(int id);
}
