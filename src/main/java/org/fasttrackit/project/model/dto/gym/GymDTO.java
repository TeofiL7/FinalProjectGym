package org.fasttrackit.project.model.dto.gym;

import lombok.Builder;
import org.fasttrackit.project.model.Client;
import org.fasttrackit.project.model.Owner;

import java.util.List;

@Builder
public record GymDTO (
        Integer gymId,
        String gymName,
        Owner owner,
        List<Client> clients

){
}
