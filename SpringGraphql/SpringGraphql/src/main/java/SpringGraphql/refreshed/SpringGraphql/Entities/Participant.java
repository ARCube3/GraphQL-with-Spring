package SpringGraphql.refreshed.SpringGraphql.Entities;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String contact;
	@OneToMany(mappedBy = "participant", cascade = CascadeType.ALL)//	@JsonIgnore
	private List<Transaction> transactions = new ArrayList<>();
	
	public Participant( String name, String contact) {
		super();
		this.name = name;
		this.contact = contact;
	}
	
	
	public Participant() {
		super();
	}


	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public List<Transaction> getTransaction() {
		return transactions;
	}


	public void setTransaction(List<Transaction> transactions) {
		this.transactions = transactions;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}



	
	
	
}
