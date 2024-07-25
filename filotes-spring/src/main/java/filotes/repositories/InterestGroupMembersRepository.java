package filotes.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.InterestGroupMembers;

@Repository
public interface InterestGroupMembersRepository extends JpaRepository<InterestGroupMembers, UUID>{

}
