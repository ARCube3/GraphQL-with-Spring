package com.graphql.demo.graphqlSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
import com.graphql.demo.graphqlSpring.Services.ParticipantService;
import com.graphql.demo.graphqlSpring.Services.TransactionService;
import com.graphql.demo.graphqlSpring.entities.Participant;
import com.graphql.demo.graphqlSpring.entities.Transaction;

@SpringBootApplication
@RestController
public class GraphqlSpringApplication implements CommandLineRunner {

//
	@Autowired
	private ParticipantService participantService;
	
	@Autowired
	private TransactionService transactionervice;
	
	
	public static void main(String[] args) {
		SpringApplication.run(GraphqlSpringApplication.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "Application Started";
	}
	

	public void run(String... args) throws Exception {

		Participant p1 = new Participant("Rajat", "94402");
		Participant p2 = new Participant("Graphql", "94403");
		Participant p3 = new Participant("Spring", "94404");
		
		this.participantService.create(p1);
		this.participantService.create(p2);
		this.participantService.create(p3);
		
		Transaction t1 = new Transaction(123456,"Ashwin",p1);
		Transaction t2 = new Transaction(123456,"Sanngesh",p1);
		Transaction t3 = new Transaction(123456,"Rahul",p1);
		
		Transaction t4 = new Transaction(123456,"Query",p2);
		Transaction t5 = new Transaction(123455,"Schema",p2);
		Transaction t6 = new Transaction(123456,"Database",p2);
		
		Transaction t7 = new Transaction(123456,"JPA",p3);
		Transaction t8 = new Transaction(123455,"Bean",p3);
		Transaction t9 = new Transaction(123456,"Annotaions",p3);
		
		this.transactionervice.create(t1);
		this.transactionervice.create(t2);
		this.transactionervice.create(t3);
		this.transactionervice.create(t4);
		this.transactionervice.create(t5);
		this.transactionervice.create(t6);
		this.transactionervice.create(t7);
		this.transactionervice.create(t8);
		this.transactionervice.create(t9);
	}

}
