package filotes.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record InterestGroups(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String groupName,
		String description,
		Communities community,
		Users user) {

}
