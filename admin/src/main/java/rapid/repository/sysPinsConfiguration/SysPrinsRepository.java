package rapid.repository.sysPinsConfiguration;

import org.springframework.data.jpa.repository.JpaRepository;
import rapid.model.sysPinsConfiguration.SysPrins;
import rapid.model.keyword.ClientSysPrinId;

public interface SysPrinsRepository extends JpaRepository<SysPrins, ClientSysPrinId> {
}

