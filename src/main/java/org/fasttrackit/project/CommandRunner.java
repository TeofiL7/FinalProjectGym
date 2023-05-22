/*package org.fasttrackit.project;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.project.model.Client;
import org.fasttrackit.project.model.Gym;
import org.fasttrackit.project.model.Owner;
import org.fasttrackit.project.service.ClientService;
import org.fasttrackit.project.service.GymService;
import org.fasttrackit.project.service.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class CommandRunner implements CommandLineRunner {
    private final ClientService clientService;
    private final GymService gymService;
    private final OwnerService ownerService;
    @Override
    public void run(String... args) throws Exception {

        log.info("Runner is populating with data");

        gymService.addAllGym(List.of(
                Gym.builder()
                        .gymName("SUNNY")
                        .owner(Owner.builder()
                                .firstName("MARDE")
                                .lastName("CASEWQ")
                                .birthDay(LocalDate.of(3234,5,6))
                                .build())
                        .build(),
                Gym.builder()
                        .gymName("Yonii")
                        .owner(Owner.builder()
                                .firstName("XI")
                                .lastName("KAI")
                                .birthDay(LocalDate.of(4543,5,6))
                                .build())
                        .build()

        ));

        clientService.addAllClient(List.of(
                Client.builder()
                        .firstName("ALEX")
                        .lastName("MIRET")
                        .birthDay(LocalDate.of(1345,4,6))
                        .gym(gymService.getAll().get(0))
                        .build(),
                Client.builder()
                        .firstName("CUREA")
                        .lastName("BIFER")
                        .birthDay(LocalDate.of(2345,5,6))
                        .gym(gymService.getAll().get(1))
                        .build()
        ));

        ownerService.addAllOwner(List.of(
                Owner.builder()
                        .firstName("Viera")
                        .lastName("XI")
                        .birthDay(LocalDate.of(2012,3,4))
                        .build(),
                Owner.builder()
                        .firstName("Micles")
                        .lastName("XI")
                        .birthDay(LocalDate.of(2012,3,4))
                        .build()
        ));
    }
}

 */



