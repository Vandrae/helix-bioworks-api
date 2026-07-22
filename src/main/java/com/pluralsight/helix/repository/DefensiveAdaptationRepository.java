package com.pluralsight.helix.repository;

import com.pluralsight.helix.organism.DefensiveAdaptation;
import com.pluralsight.helix.organism.Organism;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefensiveAdaptationRepository extends JpaRepository<DefensiveAdaptation,Integer> {
}
