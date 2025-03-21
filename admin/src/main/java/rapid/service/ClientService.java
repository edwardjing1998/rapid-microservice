package rapid.service;

import org.springframework.stereotype.Service;
import rapid.dto.ClientDTO;
import rapid.model.Client;
import rapid.repository.ClientRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientDTO> getAllClients() {
        return clientRepository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public Optional<ClientDTO> getClientById(String clientId) {
        return clientRepository.findById(clientId).map(this::convertToDto);
    }

    public ClientDTO saveClient(ClientDTO clientDTO) {
        Client client = convertToEntity(clientDTO);
        return convertToDto(clientRepository.save(client));
    }

    public void deleteClient(String clientId) {
        clientRepository.deleteById(clientId);
    }

    private ClientDTO convertToDto(Client client) {
        return new ClientDTO(
                client.getClient(),
                client.getName(),
                client.getAddr(),
                client.getCity(),
                client.getState(),
                client.getZip(),
                client.getContact(),
                client.getPhone(),
                client.getActive()
        );
    }

    private Client convertToEntity(ClientDTO clientDTO) {
        return new Client(
                clientDTO.getClient(),
                clientDTO.getName(),
                clientDTO.getAddr(),
                clientDTO.getCity(),
                clientDTO.getState(),
                clientDTO.getZip(),
                clientDTO.getContact(),
                clientDTO.getPhone(),
                clientDTO.getActive()
        );
    }
}
