package br.org.diversao.filotes.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record ForumTopics(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String file,
		String content,
		LocalDateTime createdAt,
		Users user,
		Forums forum,
		TopicReplies topicReplies) {

}
