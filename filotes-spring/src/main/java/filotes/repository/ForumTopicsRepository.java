package filotes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.ForumTopics;

@Repository
public interface ForumTopicsRepository extends JpaRepository<ForumTopics, UUID> {

}
