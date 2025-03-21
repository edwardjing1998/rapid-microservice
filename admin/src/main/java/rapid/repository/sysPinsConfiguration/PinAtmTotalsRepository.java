package rapid.repository.sysPinsConfiguration;

import org.springframework.data.jpa.repository.JpaRepository;
import rapid.model.sysPinsConfiguration.PinAtmTotals;
import rapid.model.keyword.ClientSysPrinId;

public interface PinAtmTotalsRepository extends JpaRepository<PinAtmTotals, ClientSysPrinId> {
}

