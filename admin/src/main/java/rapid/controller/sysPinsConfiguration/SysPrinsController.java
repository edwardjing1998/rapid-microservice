package rapid.controller.sysPinsConfiguration;

import org.springframework.web.bind.annotation.*;
import rapid.dto.sysPinsConfiguration.SysPrinsDTO;
import rapid.dto.sysPinsConfiguration.ReportAddressDTO;
import rapid.dto.sysPinsConfiguration.PinAtmTotalsDTO;
import rapid.service.sysPinsConfiguration.SysPrinsService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SysPrinsController {
    private final SysPrinsService sysPrinsService;

    public SysPrinsController(SysPrinsService sysPrinsService) {
        this.sysPrinsService = sysPrinsService;
    }

    @GetMapping("/SysPrins")
    public List<SysPrinsDTO> getAllSysPrins() {
        return sysPrinsService.getAllSysPrins();
    }

    @GetMapping("/ReportAddress")
    public List<ReportAddressDTO> getAllReportAddresses() {
        return sysPrinsService.getAllReportAddresses();
    }

    @GetMapping("/PinAtmTotals")
    public List<PinAtmTotalsDTO> getAllPinAtmTotals() {
        return sysPrinsService.getAllPinAtmTotals();
    }
}
