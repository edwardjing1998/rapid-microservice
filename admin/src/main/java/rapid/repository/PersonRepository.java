package rapid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rapid.model.Person;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Set<Person> findByIdIn(Collection<Long> ids);

    Optional<Person> findByUsername(String username);
}
