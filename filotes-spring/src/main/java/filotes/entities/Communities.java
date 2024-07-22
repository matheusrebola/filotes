package filotes.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Communities(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String communityName,
		String description,
		Users user) {

}
