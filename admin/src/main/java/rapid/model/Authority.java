package rapid.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "authorities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authority implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String role; // ROLE_ADMIN, ROLE_USER, etc.

    @Override
    public String getAuthority() {
        return role;
    }

    // Explicit constructor for role only
    public Authority(String role) {
        this.role = role;
    }
}
