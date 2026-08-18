package com.pluralsight.helix.service;

import com.pluralsight.helix.organism.Genome;
import com.pluralsight.helix.organism.OffensiveAdaptation;
import com.pluralsight.helix.organism.Organism;
import com.pluralsight.helix.organism.Scale;
import com.pluralsight.helix.repository.OrganismRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrganismService {
    @Autowired
    private OrganismRepository organismRepository;

    public List<Organism> getAllOrganisms() {
        return organismRepository.findAll();
    }

    public Organism getOrganismById(int id) {
        return organismRepository.findById(id).orElse(null);
    }

    public List<Organism> getGenomeByGenome(String genome) {
        return organismRepository.findByGenome(Genome.valueOf(genome));
    }

    public List<Organism> getScaleByScale(String scale) {
        return organismRepository.findByScale(Scale.valueOf(scale));
    }

    public List<Organism> getOffensiveAdaptationByOffensiveAdaptation(String name) {
        return organismRepository.findByWeaponsName(name);
    }

    public List<Organism> getDefensiveAdaptationByDefensiveAdaptation(String name) {
        return organismRepository.findByDefensesName(name);
    }
}
