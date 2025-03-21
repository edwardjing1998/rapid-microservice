package rapid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rapid.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
}

