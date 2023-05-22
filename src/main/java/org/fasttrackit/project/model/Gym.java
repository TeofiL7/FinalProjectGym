package org.fasttrackit.project.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Gym{
    @Id
    @GeneratedValue
    private Integer gymId;
    @Column
    private String gymName;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Owner owner;
    @OneToMany(mappedBy = "gym", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = LAZY)
    private List<Client> clients;
    @ManyToOne
    @JsonIgnore
    private Owner owners;

    public void addClient(Client client){
        clients.add(client);
        client.setGym(this);
    }

}
