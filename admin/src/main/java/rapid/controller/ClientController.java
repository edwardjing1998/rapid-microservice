package rapid.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rapid.dto.ClientDTO;
import rapid.service.ClientService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<List<ClientDTO>> getAllClients() {
        return ResponseEntity.ok(clientService.getAllClients());
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<ClientDTO> getClientById(@PathVariable String clientId) {
        Optional<ClientDTO> client = clientService.getClientById(clientId);
        return client.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDTO) {
        return ResponseEntity.ok(clientService.saveClient(clientDTO));
    }

    @PutMapping("/{clientId}")
    public ResponseEntity<ClientDTO> updateClient(@PathVariable String clientId, @RequestBody ClientDTO clientDTO) {
        clientDTO.setClient(clientId);
        return ResponseEntity.ok(clientService.saveClient(clientDTO));
    }

    @DeleteMapping("/{clientId}")
    public ResponseEntity<Void> deleteClient(@PathVariable String clientId) {
        clientService.deleteClient(clientId);
        return ResponseEntity.noContent().build();
    }
}
