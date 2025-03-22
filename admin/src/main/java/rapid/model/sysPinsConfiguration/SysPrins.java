package rapid.model.sysPinsConfiguration;

import jakarta.persistence.*;
import lombok.*;
import rapid.model.keyword.ClientSysPrinId;

@Entity
@Table(name = "SYS_PRINS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysPrins {

    @EmbeddedId
    private ClientSysPrinId id;  // Composite Primary Key (SYS_PRIN, CLIENT)

    @Column(name = "CUST_TYPE")
    private String custType;

    @Column(name = "START_DATE")
    private String startDate;

    @Column(name = "UNDELIVERABLE")
    private String undeliverable;

    @Column(name = "STAT_A")
    private String statA;

    @Column(name = "STAT_B")
    private String statB;

    @Column(name = "STAT_C")
    private String statC;

    @Column(name = "STAT_D")
    private String statD;

    @Column(name = "STAT_E")
    private String statE;

    @Column(name = "STAT_F")
    private String statF;

    @Column(name = "STAT_G")
    private String statG;

    @Column(name = "STAT_H")
    private String statH;

    @Column(name = "STAT_I")
    private String statI;

    @Column(name = "STAT_J")
    private String statJ;

    @Column(name = "STAT_K")
    private String statK;

    @Column(name = "STAT_L")
    private String statL;

    @Column(name = "STAT_M")
    private String statM;

    @Column(name = "STAT_N")
    private String statN;

    @Column(name = "STAT_O")
    private String statO;

    @Column(name = "STAT_P")
    private String statP;

    @Column(name = "STAT_Q")
    private String statQ;

    @Column(name = "STAT_R")
    private String statR;

    @Column(name = "STAT_S")
    private String statS;

    @Column(name = "STAT_T")
    private String statT;

    @Column(name = "STAT_U")
    private String statU;

    @Column(name = "STAT_V")
    private String statV;

    @Column(name = "STAT_W")
    private String statW;

    @Column(name = "STAT_X")
    private String statX;

    @Column(name = "STAT_Y")
    private String statY;

    @Column(name = "STAT_Z")
    private String statZ;

    @Column(name = "PO_BOX")
    private String poBox;

    @Column(name = "NO_RENEWAL")
    private String noRenewal;

    @Column(name = "BLOCK_CARD")
    private String blockCard;

    @Column(name = "ADDR_FLAG")
    private String addrFlag;

    @Column(name = "TEMP_AWAY")
    private Long tempAway;

    @Column(name = "RSP")
    private String rsp;

    @Column(name = "SESSION")
    private String session;

    @Column(name = "BAD_STATE")
    private String badState;

    @Column(name = "A_STAT_RCH")
    private String aStatRch;

    @Column(name = "NM_13")
    private String nm13;

    @Column(name = "TEMP_AWAY_ATTS")
    private Long tempAwayAtts;

    @Column(name = "REPORT_METHOD")
    private String reportMethod;

    @Column(name = "CONTACT")
    private String contact;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ACTIVE")
    private String active;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "RET_STAT")
    private String returnStatus;

    @Column(name = "DES_STAT")
    private String destroyStatus;

    @Column(name = "NON_US")
    private String nonUS;


}
