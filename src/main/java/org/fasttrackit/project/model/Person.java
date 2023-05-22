package org.fasttrackit.project.model;

import java.time.LocalDate;

public interface Person {
    String getFirstName();
    String getLastName();
    LocalDate getBirthDay();
}
