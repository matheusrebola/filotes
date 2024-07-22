package filotes.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record CommunityMembers(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime joinedAt,
		Communities communitie,
		Users user) {

}
