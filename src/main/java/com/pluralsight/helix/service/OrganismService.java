package com.pluralsight.helix.service;

import com.pluralsight.helix.organism.Organism;
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
}
