package filotes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.PrivateMessages;

@Repository
public interface PrivateMessagesRepository extends JpaRepository<PrivateMessages, UUID> {

}
