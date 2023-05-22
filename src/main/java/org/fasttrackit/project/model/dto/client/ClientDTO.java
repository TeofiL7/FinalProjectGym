package org.fasttrackit.project.model.dto.client;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import org.fasttrackit.project.model.Gym;

import java.time.LocalDate;

@Builder
public record ClientDTO(

        Integer clientId,

        String firstName,

        String lastName,

        LocalDate birthDay,
        Gym gym

) {
}
