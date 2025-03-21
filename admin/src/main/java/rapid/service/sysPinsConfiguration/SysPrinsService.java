package rapid.service.sysPinsConfiguration;

import org.springframework.stereotype.Service;
import rapid.dto.sysPinsConfiguration.SysPrinsDTO;
import rapid.dto.sysPinsConfiguration.ReportAddressDTO;
import rapid.dto.sysPinsConfiguration.PinAtmTotalsDTO;
import rapid.model.sysPinsConfiguration.SysPrins;
import rapid.model.sysPinsConfiguration.ReportAddress;
import rapid.model.sysPinsConfiguration.PinAtmTotals;
import rapid.repository.sysPinsConfiguration.SysPrinsRepository;
import rapid.repository.sysPinsConfiguration.ReportAddressRepository;
import rapid.repository.sysPinsConfiguration.PinAtmTotalsRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SysPrinsService {
    private final SysPrinsRepository sysPrinsRepository;
    private final ReportAddressRepository reportAddressRepository;
    private final PinAtmTotalsRepository pinAtmTotalsRepository;

    public SysPrinsService(SysPrinsRepository sysPrinsRepository,
                           ReportAddressRepository reportAddressRepository,
                           PinAtmTotalsRepository pinAtmTotalsRepository) {
        this.sysPrinsRepository = sysPrinsRepository;
        this.reportAddressRepository = reportAddressRepository;
        this.pinAtmTotalsRepository = pinAtmTotalsRepository;
    }

    public List<SysPrinsDTO> getAllSysPrins() {
        return sysPrinsRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    public List<ReportAddressDTO> getAllReportAddresses() {
        return reportAddressRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    public List<PinAtmTotalsDTO> getAllPinAtmTotals() {
        return pinAtmTotalsRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private SysPrinsDTO convertToDto(SysPrins sysPrins) {
        SysPrinsDTO dto = new SysPrinsDTO();
        dto.setSysPrin(sysPrins.getId().getSysPrin());
        dto.setClient(sysPrins.getId().getClient());
        dto.setCustType(sysPrins.getCustType());
        dto.setStartDate(sysPrins.getStartDate());
        dto.setUndeliverable(sysPrins.getUndeliverable());
        dto.setStatA(sysPrins.getStatA());
        dto.setStatB(sysPrins.getStatB());
        dto.setStatC(sysPrins.getStatC());
        dto.setStatD(sysPrins.getStatD());
        dto.setStatE(sysPrins.getStatE());
        dto.setStatF(sysPrins.getStatF());
        dto.setStatG(sysPrins.getStatG());
        dto.setStatH(sysPrins.getStatH());
        dto.setStatI(sysPrins.getStatI());
        dto.setStatJ(sysPrins.getStatJ());
        dto.setStatK(sysPrins.getStatK());
        dto.setStatL(sysPrins.getStatL());
        dto.setStatM(sysPrins.getStatM());
        dto.setStatN(sysPrins.getStatN());
        dto.setStatO(sysPrins.getStatO());
        dto.setStatP(sysPrins.getStatP());
        dto.setStatQ(sysPrins.getStatQ());
        dto.setStatR(sysPrins.getStatR());
        dto.setStatS(sysPrins.getStatS());
        dto.setStatT(sysPrins.getStatT());
        dto.setStatU(sysPrins.getStatU());
        dto.setStatV(sysPrins.getStatV());
        dto.setStatW(sysPrins.getStatW());
        dto.setStatX(sysPrins.getStatX());
        dto.setStatY(sysPrins.getStatY());
        dto.setStatZ(sysPrins.getStatZ());
        dto.setPoBox(sysPrins.getPoBox());
        dto.setNoRenewal(sysPrins.getNoRenewal());
        dto.setBlockCard(sysPrins.getBlockCard());
        dto.setAddrFlag(sysPrins.getAddrFlag());
        dto.setTempAway(sysPrins.getTempAway());
        dto.setRsps(sysPrins.getRsps());
        dto.setSession(sysPrins.getSession());
        dto.setBadState(sysPrins.getBadState());
        dto.setNBadState(sysPrins.getNBadState());
        dto.setNAStatRck(sysPrins.getNAStatRck());
        dto.setNm13(sysPrins.getNm13());
        dto.setTempAwayAtts(sysPrins.getTempAwayAtts());
        dto.setReportMethod(sysPrins.getReportMethod());
        dto.setContact(sysPrins.getContact());
        dto.setPhone(sysPrins.getPhone());
        dto.setActive(sysPrins.getActive());
        dto.setNotes(sysPrins.getNotes());
        dto.setDestroyStatus(sysPrins.getDestroyStatus());
        dto.setReturnStatus(sysPrins.getReturnStatus());
        return dto;
    }


    private ReportAddressDTO convertToDto(ReportAddress reportAddress) {
        ReportAddressDTO dto = new ReportAddressDTO();
        dto.setSysPrin(reportAddress.getId().getSysPrin());
        dto.setClient(reportAddress.getId().getClient());
        dto.setName(reportAddress.getName());
        dto.setAccount(reportAddress.getAccount());
        dto.setFirstName(reportAddress.getFirstName());
        dto.setLastName(reportAddress.getLastName());
        dto.setAddr1(reportAddress.getAddr1());
        dto.setAddr2(reportAddress.getAddr2());
        dto.setCity(reportAddress.getCity());
        dto.setState(reportAddress.getState());
        dto.setZip(reportAddress.getZip());
        dto.setOldAddr1(reportAddress.getOldAddr1());
        dto.setOldAddr2(reportAddress.getOldAddr2());
        dto.setOldCity(reportAddress.getOldCity());
        dto.setOldState(reportAddress.getOldState());
        dto.setOldZip(reportAddress.getOldZip());
        return dto;
    }

    private PinAtmTotalsDTO convertToDto(PinAtmTotals pinAtmTotals) {
        PinAtmTotalsDTO dto = new PinAtmTotalsDTO();
        dto.setId(pinAtmTotals.getId());
        dto.setSysPrin(pinAtmTotals.getSysPrin());
        dto.setClient(pinAtmTotals.getClient());
        dto.setActionId(pinAtmTotals.getActionId());
        dto.setCaseNumber(pinAtmTotals.getCaseNumber());
        dto.setDateTime(pinAtmTotals.getDateTime());
        dto.setAccount(pinAtmTotals.getAccount());
        dto.setName(pinAtmTotals.getName());
        dto.setBillingSp(pinAtmTotals.getBillingSp());
        dto.setCustType(pinAtmTotals.getCustType());
        dto.setWorkInd(pinAtmTotals.getWorkInd());
        return dto;
    }
}
