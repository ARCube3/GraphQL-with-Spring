package SpringGraphql.refreshed.SpringGraphql.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringGraphql.refreshed.SpringGraphql.Entities.Transaction;

public interface TransactionRep extends JpaRepository<Transaction, Integer> {
		
//	List<Transaction> findByParticipantId(int participantId);
}
