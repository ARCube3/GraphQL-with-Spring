package com.graphql.demo.graphqlSpring.Services;

import java.util.List;
import java.util.Optional;

import com.graphql.demo.graphqlSpring.dto.ParticipantDTO;
import com.graphql.demo.graphqlSpring.entities.Participant;

public interface ParticipantService {
	
	//create
	
	Participant create(Participant participant);
	
	//get all
	
	List<Participant> getAll();
	
	//get single participant
	
	Optional<Participant> get(int id);
	
	ParticipantDTO getPartcipantDetails(int id);
	
//	// get transactions of participant
//	
//	List<Transaction> getTransactionsByParticipantId(int id);
	List<String> getname();
	
	Participant updateParticipant(int id, String name, String contact);
	
	
	public void deleteParticipant(int id);

}
