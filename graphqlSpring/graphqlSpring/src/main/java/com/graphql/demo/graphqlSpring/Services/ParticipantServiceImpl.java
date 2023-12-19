package com.graphql.demo.graphqlSpring.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.graphql.demo.graphqlSpring.entities.Participant;
import com.graphql.demo.graphqlSpring.repositories.ParticipantRep;

@Service
public class ParticipantServiceImpl implements ParticipantService{

		private ParticipantRep participantrep;
	
		
		public ParticipantServiceImpl(ParticipantRep participantrep) {
			super();
			this.participantrep = participantrep;
		}


		@Override
		public Participant create(Participant participant) {
			return this.participantrep.save(participant);
		}
		
		@Override
		public List<Participant> getAll(){
			return this.participantrep.findAll();
		};
		
		@Override
		public Participant get(int id) {
			return this.participantrep.findById(id).orElseThrow(()-> new RuntimeException("Exception occured"));
		}
		
//		@Override
//		public List<Transaction> getTransactionsByParticipantId(int participantId) {
//	       Optional<Participant> participantOptional = participantrep.findById(participantId);
//
//	        if (participantOptional.isPresent()) {
//	            Participant participant = participantOptional.get();
//	            return participant.getTransaction();
//	        } else {
//	            // Handle participant not found
//	            return null;
//	        }
//	    }
		
		@Override
	    public Participant updateParticipant(int id, String name, String contact) {
	        Optional<Participant> existingParticipantOptional = participantrep.findById(id);

	        if (existingParticipantOptional.isPresent()) {
	        	Participant existingParticipant = existingParticipantOptional.get();
	            existingParticipant.setName(name);
	            existingParticipant.setContact(contact);
	            return participantrep.save(existingParticipant);
	        } else {
	            // Handle transaction not found
	            return null;
	        }
	    }

		@Override
	    public void deleteParticipant(int id) {
	        participantrep.deleteById(id);
	    }
}
