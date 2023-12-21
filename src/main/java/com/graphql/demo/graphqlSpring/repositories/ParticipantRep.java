package com.graphql.demo.graphqlSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.demo.graphqlSpring.entities.Participant;

public interface ParticipantRep extends JpaRepository<Participant, Integer>{

}
