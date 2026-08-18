package com.pluralsight.helix.repository;

import com.pluralsight.helix.organism.Genome;
import com.pluralsight.helix.organism.OffensiveAdaptation;
import com.pluralsight.helix.organism.Organism;
import com.pluralsight.helix.organism.Scale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganismRepository extends JpaRepository<Organism,Integer> {
    List<Organism> findByGenome(Genome genome);

    List<Organism> findByScale(Scale scale);

    List<Organism> findByWeaponsName( String name);

    List<Organism> findByDefensesName( String name);

}

