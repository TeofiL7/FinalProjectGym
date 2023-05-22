package org.fasttrackit.project.model.dto.owner;


import org.fasttrackit.project.model.Owner;

import org.springframework.stereotype.Component;

@Component
public class OwnerMapper {
    public static OwnerDTO toDto(Owner entity) {
        return OwnerDTO.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .birthDay(entity.getBirthDay())
                .build();
    }

    public static Owner toEntity(OwnerDTO ownerDTO){
        return Owner.builder()
                .id(ownerDTO.id())
                .firstName(ownerDTO.firstName())
                .lastName(ownerDTO.lastName())
                .birthDay(ownerDTO.birthDay())
                .build();
    }
}
