package filotes.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public record InterestGroupMembers(
		LocalDateTime joinedAt,
		InterestGroups interestGroups,
		Users user) {

}
