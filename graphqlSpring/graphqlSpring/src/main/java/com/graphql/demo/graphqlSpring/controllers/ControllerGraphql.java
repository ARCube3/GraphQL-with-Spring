package com.graphql.demo.graphqlSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.graphql.demo.graphqlSpring.Services.ParticipantService;
import com.graphql.demo.graphqlSpring.Services.TransactionService;
import com.graphql.demo.graphqlSpring.entities.Participant;
import com.graphql.demo.graphqlSpring.entities.Transaction;

@Controller
public class ControllerGraphql {

	@Autowired
	private ParticipantService partservice;
	
	@Autowired
	private TransactionService trnsxnservice;
	
	public Participant create(@RequestBody Participant participant) {
		return this.partservice.create(participant);
	}
	
	public Transaction create(@RequestBody Transaction transaction) {
		return this.trnsxnservice.create(transaction);
	}
	
	@QueryMapping
	Iterable<Participant> participants(){
		return partservice.getAll();
	}
//	@QueryMapping
//	public List<Transaction> participantTransactions(@Argument int participantId){
//		return trnsxnservice.getTransactions(participantId);
//	}
//	
}
