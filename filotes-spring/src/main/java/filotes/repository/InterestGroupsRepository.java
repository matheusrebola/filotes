package filotes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.InterestGroups;

@Repository
public interface InterestGroupsRepository extends JpaRepository<InterestGroups, UUID>{

}
