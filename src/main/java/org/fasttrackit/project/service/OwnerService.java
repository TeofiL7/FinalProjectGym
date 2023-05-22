package org.fasttrackit.project.service;

import org.fasttrackit.project.exceptions.ResourceNotFoundException;
import org.fasttrackit.project.model.Gym;
import org.fasttrackit.project.model.Owner;
import org.fasttrackit.project.repository.OwnerRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class OwnerService {
    private final OwnerRepository repository;

    public OwnerService(OwnerRepository repository) {
        this.repository = repository;
    }

    public void addAllOwner(List<Owner> owners){
        repository.saveAll(owners);
    }

    public List<Owner> getAll() {
        return repository.findAll();
    }

    public Owner getOwnerById(String id) {
        return repository.findById(Integer.valueOf(id))
                .orElseThrow(() -> new ResourceNotFoundException("Owner with id %s was not found".formatted(id)));
    }

    public Owner addNewGym(String id, Gym gym) {
        Owner owner = getOwnerById(id);
        owner.addGym(gym);
        return repository.save(owner);
    }

}

