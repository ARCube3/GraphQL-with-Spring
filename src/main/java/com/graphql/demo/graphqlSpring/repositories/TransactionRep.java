package com.graphql.demo.graphqlSpring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.demo.graphqlSpring.entities.Transaction;

public interface TransactionRep extends JpaRepository<Transaction, Integer> {
		
	List<Transaction> findByParticipantId(int participantId);
}
