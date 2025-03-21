package rapid.model.sysPinsConfiguration;

import jakarta.persistence.*;
import lombok.*;
import rapid.model.keyword.ClientSysPrinId;

@Entity
@Table(name = "REPORT_ADDRESS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportAddress {

    @EmbeddedId
    private ClientSysPrinId id;  // Composite Primary Key (SYS_PRIN, CLIENT)

    @Column(name = "NAME")
    private String name;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ADDR_1")
    private String addr1;

    @Column(name = "ADDR_2")
    private String addr2;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIP")
    private String zip;

    @Column(name = "OLD_ADDR1")
    private String oldAddr1;

    @Column(name = "OLD_ADDR2")
    private String oldAddr2;

    @Column(name = "OLD_CITY")
    private String oldCity;

    @Column(name = "OLD_STATE")
    private String oldState;

    @Column(name = "OLD_ZIP")
    private String oldZip;
}

