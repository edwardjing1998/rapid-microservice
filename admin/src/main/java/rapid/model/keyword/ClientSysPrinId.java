package rapid.model.keyword;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientSysPrinId implements Serializable {

    @Column(name = "SYS_PRIN")
    private String sysPrin;  // System Principal ID

    @Column(name = "CLIENT")
    private String client;  // Client Identifier

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientSysPrinId that = (ClientSysPrinId) o;
        return Objects.equals(sysPrin, that.sysPrin) && Objects.equals(client, that.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysPrin, client);
    }
}


