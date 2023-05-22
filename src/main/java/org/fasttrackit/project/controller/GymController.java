package org.fasttrackit.project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.project.model.Client;
import org.fasttrackit.project.model.dto.gym.GymDTO;
import org.fasttrackit.project.model.dto.gym.GymMapper;
import org.fasttrackit.project.service.GymService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.fasttrackit.project.model.dto.gym.GymMapper.toDto;
import static org.fasttrackit.project.model.dto.gym.GymMapper.toEntity;


@RestController
@RequestMapping("gym")
@RequiredArgsConstructor
@Slf4j
public class GymController {
    private final GymService service;

    @GetMapping
    public List<GymDTO> getAll(){
        return service.getAll().stream()
                .map(GymMapper::toDto)
                .toList();
    }

    @GetMapping("{id}")
    public GymDTO getById(@PathVariable String id) {
        return toDto(service.getById(id));
    }

    @PostMapping
    public GymDTO createNewGym(@RequestBody GymDTO newGym) {
        return toDto(service.createNewGym(toEntity(newGym)));
    }

    @PostMapping("{id}/add")
    public GymDTO addNewClient(@PathVariable String id, @RequestBody Client client) {
        return toDto(service.addNewClient(id, client));
    }

    @DeleteMapping("{id}")
    public GymDTO deleteById(@PathVariable String id) {
        return GymMapper.toDto(service.deleteById(id));
    }
}
