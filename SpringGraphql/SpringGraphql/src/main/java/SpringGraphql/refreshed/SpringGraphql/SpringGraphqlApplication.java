package SpringGraphql.refreshed.SpringGraphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringGraphql.refreshed.SpringGraphql.Entities.Participant;
import SpringGraphql.refreshed.SpringGraphql.Entities.Transaction;
import SpringGraphql.refreshed.SpringGraphql.Repositories.ParticipantRep;
import SpringGraphql.refreshed.SpringGraphql.Repositories.TransactionRep;

@SpringBootApplication
public class SpringGraphqlApplication implements CommandLineRunner {

	@Autowired
    private  ParticipantRep partrep;
	
	@Autowired
    private  TransactionRep transrep;

    
    

    public static void main(String[] args) {
        SpringApplication.run(SpringGraphqlApplication.class, args);
    }

    public void run(String... args) throws Exception {
        // Your existing code for saving participants and transactions
    	

		Participant p1 = new Participant("Rajat", "94402");
		Participant p2 = new Participant("Graphql", "94403");
		Participant p3 = new Participant("Spring", "94404");
		
		this.partrep.save(p1);
		this.partrep.save(p2);
		this.partrep.save(p3);
		

		Transaction t1 = new Transaction(123456,"Ashwin",p1);
		Transaction t2 = new Transaction(123456,"Sanngesh",p1);
		Transaction t3 = new Transaction(123456,"Rahul",p1);
		
		Transaction t4 = new Transaction(123456,"Springboot",p2);
		Transaction t5 = new Transaction(123455,"Java",p2);
		Transaction t6 = new Transaction(123456,"RDBMS",p2);
		
		Transaction t7 = new Transaction(123456,"JPA",p3);
		Transaction t8 = new Transaction(123455,"Bean",p3);
		Transaction t9 = new Transaction(123456,"Annotaions",p3);
		
		this.transrep.save(t1);
		this.transrep.save(t2);
		this.transrep.save(t3);
		this.transrep.save(t4);
		this.transrep.save(t5);
		this.transrep.save(t6);
		this.transrep.save(t7);
		this.transrep.save(t8);
		this.transrep.save(t9);
    }
}


//@SpringBootApplication
//public class SpringGraphqlApplication implements CommandLineRunner{
//
//	ParticipantRep partrep;
//	TransactionRep transrep;
//	public static void main(String[] args) {
//		SpringApplication.run(SpringGraphqlApplication.class, args);
//	}
//	
//
//		public void run(String... args) throws Exception {
//			
//			
//		}
//
//	}
	
//	@Bean
//	ApplicationRunner applicationRunner() {
//		return args -> {
//			Participant Rajat = partrep.save(new Participant( null, "Rajat", "11111"));
//			Participant Rajat2 = partrep.save(new Participant( null, "Rajat2", "111112"));
//			
//			Tr
//		}
	


