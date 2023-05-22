package org.fasttrackit.project.service;

import org.fasttrackit.project.exceptions.ResourceNotFoundException;
import org.fasttrackit.project.model.Client;
import org.fasttrackit.project.model.Gym;
import org.fasttrackit.project.repository.ClientRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ClientService {
    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public void addAllClient(List<Client> clients){
        repository.saveAll(clients);
    }

    public List<Client> getAllClients() {
        return repository.findAll();
    }

    public Client getById(String id) {
        return repository.findById(Integer.valueOf(id))
                .orElseThrow(() -> new ResourceNotFoundException("Client with id %s was not found".formatted(id)));
    }

    public Client addNewClient(Client newClient) {
        return repository.save(newClient);
    }

    public Client deleteById(String id) {
        Client deletedClient = getById(id);
        repository.deleteById(Integer.valueOf(id));
        return deletedClient;
    }
}
