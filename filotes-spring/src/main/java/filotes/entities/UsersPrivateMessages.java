package br.org.diversao.filotes.entities;

import jakarta.persistence.Entity;

@Entity
public record UsersPrivateMessages(
		PrivateMessages privateMessage,
		Users user) {

}
