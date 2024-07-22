package filotes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.Forums;

@Repository
public interface ForumsRepository extends JpaRepository<Forums, UUID> {

}
