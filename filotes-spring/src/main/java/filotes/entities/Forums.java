package filotes.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Forums(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String forumName,
		String description,
		Communities community) {

}
