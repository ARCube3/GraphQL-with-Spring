package com.graphql.demo.graphqlSpring.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.demo.graphqlSpring.entities.Transaction;
import com.graphql.demo.graphqlSpring.repositories.TransactionRep;


@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRep transactionrep;
	
	@Override
	public Transaction create(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionrep.save(transaction);
	}

	@Override
	public List<Transaction> getAll() {
		// TODO Auto-generated method stub
		return transactionrep.findAll();
	}

	@Override
	public  Transaction get(int id) {
		// TODO Auto-generated method stub
		Optional<Transaction> existingTransactionOptional = transactionrep.findById(id);
		  if (existingTransactionOptional.isPresent()) {
			  Transaction existingTransaction = existingTransactionOptional.get();
			  return existingTransaction;
		  }
		  
		  else {
	            // Handle transaction not found
	            return null;
	        }
	}

	@Override
	public List<Transaction> getTransactions(int participantId) {
		// TODO Auto-generated method stub
		return transactionrep.findByParticipantId(participantId);
	}
	
	
	
	@Override
    public Transaction updateTransaction(int id, float amount, String receiver) {
        Optional<Transaction> existingTransactionOptional = transactionrep.findById(id);

        if (existingTransactionOptional.isPresent()) {
            Transaction existingTransaction = existingTransactionOptional.get();
            existingTransaction.setAmount(amount);
            existingTransaction.setReceiver(receiver);
            return transactionrep.save(existingTransaction);
        } else {
            // Handle transaction not found
            return null;
        }
    }

	@Override
    public void deleteTransaction(int id) {
        transactionrep.deleteById(id);
    }
}
	
	


