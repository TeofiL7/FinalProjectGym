package org.fasttrackit.project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.project.model.Client;
import org.fasttrackit.project.model.dto.client.ClientDTO;
import org.fasttrackit.project.model.dto.client.ClientMapper;
import org.fasttrackit.project.model.dto.gym.GymDTO;
import org.fasttrackit.project.model.dto.gym.GymMapper;
import org.fasttrackit.project.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.fasttrackit.project.model.dto.client.ClientMapper.toDto;
import static org.fasttrackit.project.model.dto.client.ClientMapper.toEntity;

@RestController
@RequestMapping("client")
@RequiredArgsConstructor
@Slf4j
public class ClientController {
    private final ClientService service;

    @GetMapping
    public List<ClientDTO> getAllClients(){
        return service.getAllClients().stream()
                .map(ClientMapper::toDto)
                .toList();
    }

    @GetMapping("{id}")
    public ClientDTO getById(@PathVariable String id) {
        return toDto(service.getById(id));
    }

    @PostMapping("{id}")
    public ClientDTO addNewClient(@RequestBody ClientDTO newClient) {
        return ClientMapper.toDto(service.addNewClient(ClientMapper.toEntity(newClient)));
    }

    @DeleteMapping("{id}")
    public ClientDTO deleteById(@PathVariable String id) {
        return ClientMapper.toDto(service.deleteById(id));
    }
}
