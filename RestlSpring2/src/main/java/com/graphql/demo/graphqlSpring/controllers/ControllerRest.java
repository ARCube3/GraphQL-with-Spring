package com.graphql.demo.graphqlSpring.controllers;

import java.util.List;
import java.util.Optional;

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
	
//	// Get Transaction from Transaction entity
//	@GetMapping("transactionById/{participantId}")
//	public List<Transaction> getTransactions(@PathVariable int participantId){
//		return this.trnsxnservice.getTransactions(participantId);
//	}
	
	
	
	//Get Participant details given the id
	
	@GetMapping("participantById/{participantId}")
	public Optional<Participant> getParticipantById(@PathVariable int participantId){
		return this.partservice.get(participantId);
	}
	
	
	//Get Participant name
	@GetMapping("participantNames/name")
	public List<String> getParticipantName(){
		return this.partservice.getname();
	}
	
	//Get all aprticipants and details
	@GetMapping("/participants")
	public List<Participant> getParticipant(){
		return this.partservice.getAll();
	}
	
}
