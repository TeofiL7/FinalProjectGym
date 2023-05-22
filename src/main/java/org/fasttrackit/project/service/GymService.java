package org.fasttrackit.project.service;

import org.fasttrackit.project.exceptions.ResourceNotFoundException;
import org.fasttrackit.project.model.Client;
import org.fasttrackit.project.model.Gym;
import org.fasttrackit.project.repository.GymRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GymService {
    private final GymRepository repository;

    public GymService(GymRepository repository) {
        this.repository = repository;
    }

    public void addAllGym(List<Gym> gyms){
        repository.saveAll(gyms);
    }
    public List<Gym> getAll() {
        return repository.findAll();
    }

    public Gym getById(String id) {
        return repository.findById(Integer.valueOf(id))
                .orElseThrow(() -> new ResourceNotFoundException("Gym with id %s was not found".formatted(id)));
    }

    public Gym createNewGym(Gym newGym) {
        return repository.save(newGym);
    }

    public Gym addNewClient(String id, Client client) {
        Gym gym = getById(id);
        gym.addClient(client);
        return repository.save(gym);
    }

    public Gym deleteById(String id) {
        Gym gymDeleted = getById(id);
        repository.deleteById(Integer.valueOf(id));
        return gymDeleted;
    }
}
