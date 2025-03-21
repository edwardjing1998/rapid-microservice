package rapid.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private String client;
    private String name;
    private String addr;
    private String city;
    private String state;
    private String zip;
    private String contact;
    private String phone;
    private Boolean active;
}
