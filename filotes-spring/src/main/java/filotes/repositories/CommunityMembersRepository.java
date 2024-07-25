package filotes.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.CommunityMembers;

@Repository
public interface CommunityMembersRepository extends JpaRepository<CommunityMembers, UUID>{

}
