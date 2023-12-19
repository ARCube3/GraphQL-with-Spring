package SpringGraphql.refreshed.SpringGraphql.Controller;

import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import SpringGraphql.refreshed.SpringGraphql.Entities.Participant;
import SpringGraphql.refreshed.SpringGraphql.Entities.Transaction;
import SpringGraphql.refreshed.SpringGraphql.Repositories.ParticipantRep;
import SpringGraphql.refreshed.SpringGraphql.Repositories.TransactionRep;


@Controller
public class ParticipantController {
	private final ParticipantRep partrep;
	private final TransactionRep transrep;
	
	
	public ParticipantController(ParticipantRep partrep, TransactionRep transrep) {
		this.partrep = partrep;
		this.transrep = transrep;
	}



	@QueryMapping
	Iterable<Participant> participants() {
		return partrep.findAll();
		
	}
	
	@QueryMapping
	Optional<Participant> participantById(@Argument int id){
		return partrep.findById(id);
	}
	
	
	//Saving new transaction
	@MutationMapping
	Transaction addTransaction(@Argument TransactionInput transaction) {
		Participant participant = partrep.findById(transaction.participantId).orElseThrow(()-> new IllegalArgumentException("Id not found"));
		Transaction t = new Transaction(transaction.amount(),transaction.receiver(),participant);
		return transrep.save(t);
	}
	
	//Creating a new participant
	@MutationMapping
	Participant addParticipant(@Argument ParticipantInput participant) {
		Participant p = new Participant(participant.name(), participant.contact());
		return partrep.save(p);
	}
	
	
	
	record TransactionInput(int amount, String receiver, int participantId) {}
	
	record ParticipantInput(String name, String contact) {}
	
}
