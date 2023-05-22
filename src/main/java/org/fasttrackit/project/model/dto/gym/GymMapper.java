package org.fasttrackit.project.model.dto.gym;


import org.fasttrackit.project.model.Gym;
import org.fasttrackit.project.model.Owner;
import org.springframework.stereotype.Component;

@Component
public class GymMapper {
    public static GymDTO toDto(Gym entity) {
        return GymDTO.builder()
                .gymId(entity.getGymId())
                .gymName(entity.getGymName())
                .owner(entity.getOwner())
                .clients(entity.getClients())
                .build();
    }

    public static Gym toEntity(GymDTO gymDTO){
        return Gym.builder()
                .gymId(gymDTO.gymId())
                .gymName(gymDTO.gymName())
                .owner(gymDTO.owner())
                .clients(gymDTO.clients())
                .build();
    }
}