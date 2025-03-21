package rapid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rapid.model.Document;

public interface BookRepository extends JpaRepository<Document, Long> {
}
