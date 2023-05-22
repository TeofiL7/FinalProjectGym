package org.fasttrackit.project.repository;

import org.fasttrackit.project.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
