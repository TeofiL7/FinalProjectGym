package org.fasttrackit.project.model.dto.client;

import org.fasttrackit.project.model.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {
    public static ClientDTO toDto(Client entity){
        return ClientDTO.builder()
                .clientId(entity.getClientId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .birthDay(entity.getBirthDay())
                .gym(entity.getGym())
                .build();
    }

    public static Client toEntity(ClientDTO clientDTO){
        return Client.builder()
                .clientId(clientDTO.clientId())
                .firstName(clientDTO.firstName())
                .lastName(clientDTO.lastName())
                .birthDay(clientDTO.birthDay())
                .gym(clientDTO.gym())
                .build();
    }
}
