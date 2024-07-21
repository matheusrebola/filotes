package br.org.diversao.filotes.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record CommunityEvents(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String eventName,
		String description,
		LocalDateTime eventDate,
		Communities community,
		Users user) {

}
