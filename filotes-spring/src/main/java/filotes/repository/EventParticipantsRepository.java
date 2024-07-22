package filotes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.EventParticipants;

@Repository
public interface EventParticipantsRepository extends JpaRepository<EventParticipants, UUID> {

}
