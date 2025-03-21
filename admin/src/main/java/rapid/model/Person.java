package rapid.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(unique = true, nullable = false)
    private String username;

    @NonNull
    @Column(nullable = false)
    @JsonIgnore
    private String passwordHash;

    @NonNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;
}
