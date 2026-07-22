package com.pluralsight.helix.repository;

import com.pluralsight.helix.organism.Organism;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganismRepository extends JpaRepository<Organism,Integer> {
}
