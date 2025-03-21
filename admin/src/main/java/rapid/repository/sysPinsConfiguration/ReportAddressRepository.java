package rapid.repository.sysPinsConfiguration;

import org.springframework.data.jpa.repository.JpaRepository;
import rapid.model.sysPinsConfiguration.ReportAddress;
import rapid.model.keyword.ClientSysPrinId;

public interface ReportAddressRepository extends JpaRepository<ReportAddress, ClientSysPrinId> {
}

