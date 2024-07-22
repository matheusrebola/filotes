package filotes.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import filotes.entities.UsersPrivateMessages;

@Repository
public interface UsersPrivateMessagesRepository extends JpaRepository<UsersPrivateMessages, UUID>{

}
