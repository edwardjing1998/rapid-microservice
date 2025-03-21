package rapid.model.sysPinsConfiguration;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PIN_ATM_TOTALS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PinAtmTotals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;  // Primary Key

    @Column(name = "SYS_PRIN")
    private String sysPrin;

    @Column(name = "CLIENT")
    private String client;

    @Column(name = "ACTION_ID")
    private String actionId;

    @Column(name = "CASE_NUMBER")
    private String caseNumber;

    @Column(name = "DATE_TIME")
    private String dateTime;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "NAME")
    private String name;

    @Column(name = "BILLING_SP")
    private String billingSp;

    @Column(name = "CUST_TYPE")
    private String custType;

    @Column(name = "WORK_IND")
    private String workInd;
}
