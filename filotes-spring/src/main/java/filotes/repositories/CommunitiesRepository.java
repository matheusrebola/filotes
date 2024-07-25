package filotes.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.Communities;

@Repository
public interface CommunitiesRepository extends JpaRepository<Communities, UUID>{

}
