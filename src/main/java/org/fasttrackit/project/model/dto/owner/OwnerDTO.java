package org.fasttrackit.project.model.dto.owner;

import lombok.Builder;
import org.fasttrackit.project.model.Gym;

import java.time.LocalDate;
import java.util.List;

@Builder
public record OwnerDTO (
        Integer id,
        String firstName,
        String lastName,
        LocalDate birthDay
){
}
