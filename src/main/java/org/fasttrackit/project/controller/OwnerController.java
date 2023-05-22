package org.fasttrackit.project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.project.model.Client;
import org.fasttrackit.project.model.Gym;
import org.fasttrackit.project.model.dto.gym.GymDTO;
import org.fasttrackit.project.model.dto.gym.GymMapper;
import org.fasttrackit.project.model.dto.owner.OwnerDTO;
import org.fasttrackit.project.model.dto.owner.OwnerMapper;
import org.fasttrackit.project.service.OwnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.fasttrackit.project.model.dto.owner.OwnerMapper.toDto;


@RestController
@RequestMapping("owner")
@RequiredArgsConstructor
@Slf4j
public class OwnerController {
    private final OwnerService service;

    @GetMapping
    public List<OwnerDTO> getAll(){
        return service.getAll().stream()
                .map(OwnerMapper::toDto)
                .toList();
    }

    @GetMapping("{id}")
    public OwnerDTO getOwnerById(@PathVariable String id){
        return toDto(service.getOwnerById(id));
    }

    @PostMapping("{id}/add")
    public OwnerDTO addNewGym(@PathVariable String id, @RequestBody Gym gym) {
        return OwnerMapper.toDto(service.addNewGym(id, gym));
    }
}
