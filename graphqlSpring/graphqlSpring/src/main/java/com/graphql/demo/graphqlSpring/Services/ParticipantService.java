package com.graphql.demo.graphqlSpring.Services;

import java.util.List;

import com.graphql.demo.graphqlSpring.entities.Participant;

public interface ParticipantService {
	
	//create
	
	Participant create(Participant participant);
	
	//get all
	
	List<Participant> getAll();
	
	//get single participant
	
	Participant get(int id);
	
//	// get transactions of participant
//	
//	List<Transaction> getTransactionsByParticipantId(int id);
	
	
	Participant updateParticipant(int id, String name, String contact);
	
	
	public void deleteParticipant(int id);

}
