package com.graphql.demo.graphqlSpring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trnsxnId;
	private float amount;
	private String receiver;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Participant participant;
//	@JoinColumn(name = "participant_id")
	

	public Transaction(float amount, String receiver, Participant participant) {
		super();
		this.amount = amount;
		this.receiver = receiver;
		this.participant = participant;
	}

	public Transaction() {
		super();
	}
	

	public int getTrnOsxnId() {
		return trnsxnId;
	}

	public void setTrnsxnId(int trnsxnId) {
		this.trnsxnId = trnsxnId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}


	

}
