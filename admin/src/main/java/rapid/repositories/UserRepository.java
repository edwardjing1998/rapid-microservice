package rapid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rapid.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
