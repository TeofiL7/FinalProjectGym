package org.fasttrackit.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client implements Person{
    @Id
    @GeneratedValue
    private Integer clientId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private LocalDate birthDay;
    @ManyToOne
    @JsonIgnore
    private Gym gym;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthDay() {
        return birthDay;
    }
}
