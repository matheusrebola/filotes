package filotes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.CommunityEvents;

@Repository
public interface CommunityEventsRepository extends JpaRepository<CommunityEvents, UUID>{

}
