package filotes.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record EventParticipants(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime joinedDate,
		CommunityEvents communityEvent,
		Users user)
{

}
