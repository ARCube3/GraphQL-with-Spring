package com.graphql.demo.graphqlSpring.dto;

import com.graphql.demo.graphqlSpring.entities.Participant;

public class ParticipantDTO {
	
    private int Id;
	private String name;
	private String contact;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
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
	
	public static ParticipantDTO valueOf(Participant p) {
		ParticipantDTO pd = new ParticipantDTO();
		
		pd.setId(p.getId());
		pd.setContact(p.getContact());
		pd.setName(p.getName());
		
		return pd;
	}
	
}
