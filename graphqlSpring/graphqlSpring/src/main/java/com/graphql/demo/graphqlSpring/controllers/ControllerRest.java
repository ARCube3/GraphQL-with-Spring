package com.graphql.demo.graphqlSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graphql.demo.graphqlSpring.Services.ParticipantService;
import com.graphql.demo.graphqlSpring.Services.TransactionService;
import com.graphql.demo.graphqlSpring.entities.Participant;
import com.graphql.demo.graphqlSpring.entities.Transaction;

@RestController
public class ControllerRest {

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
	
	
	@GetMapping("/{participantId}")
	public List<Transaction> getTransactions(@PathVariable int participantId){
		return this.trnsxnservice.getTransactions(participantId);
	}
	
}
