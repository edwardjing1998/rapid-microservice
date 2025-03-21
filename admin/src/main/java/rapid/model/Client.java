package rapid.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CLIENTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @Column(name = "client")
    private String client; // Primary Key

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "addr")
    private String addr;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zip;

    @Column(name = "contact")
    private String contact;

    @Column(name = "phone")
    private String phone;

    @Column(name = "active")
    private Boolean active;
}

