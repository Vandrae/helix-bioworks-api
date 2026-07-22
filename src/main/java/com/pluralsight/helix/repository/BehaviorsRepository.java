package com.pluralsight.helix.repository;

import com.pluralsight.helix.organism.Behaviors;
import com.pluralsight.helix.organism.DefensiveAdaptation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BehaviorsRepository extends JpaRepository<Behaviors,Integer> {
}
