package rapid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rapid.model.Authority;

import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByRole(String role);
}
