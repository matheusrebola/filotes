package filotes.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.TopicReplies;

@Repository
public interface TopicRepliesRepository extends JpaRepository<TopicReplies, UUID>{

}
