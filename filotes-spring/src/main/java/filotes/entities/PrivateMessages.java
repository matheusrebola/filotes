package br.org.diversao.filotes.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record PrivateMessages(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String messageContent,
		LocalDateTime sentAt,
		String senderId,
		String reciverId) {

}
