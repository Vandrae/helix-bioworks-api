package com.pluralsight.helix.service;

import com.pluralsight.helix.organism.*;
import com.pluralsight.helix.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrganismService {
    @Autowired
    private OrganismRepository organismRepository;
    @Autowired
    private DefensiveAdaptationRepository defensiveAdaptationRepository;
    @Autowired
    private OffensiveAdaptationRepository offensiveAdaptationRepository;
    @Autowired
    private StandardModRepository standardModRepository;
    @Autowired
    private BehaviorsRepository behaviorsRepository;


    //Get methods
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

    public List<Organism> getStandardByStandard(String name) {
        return organismRepository.findByModsName(name);
    }

    public List<Organism> getBehaviorByBehavior(String name) {
        return organismRepository.findByBehaviorsName(name);
    }

    //Update methods
    public Organism updateOrganism(int id, Organism updatedOrganism){
        updatedOrganism.setId(id);
    return organismRepository.save(updatedOrganism);
    }

    public DefensiveAdaptation updateDefensiveAdaptation(
            int organismId,
            int adaptationId,
            DefensiveAdaptation defensiveAdaptation){
        defensiveAdaptation.setId(adaptationId);
        return defensiveAdaptationRepository.save(defensiveAdaptation);
    }

    public OffensiveAdaptation updateOffensiveAdaptation(
            int organismId,
            int adaptationId,
            OffensiveAdaptation offensiveAdaptation){
        offensiveAdaptation.setId(adaptationId);
        return offensiveAdaptationRepository.save(offensiveAdaptation);
    }

    public StandardMod updateStandardMod(
            int organismId,
            int adaptationId,
            StandardMod standardMod){
        standardMod.setId(adaptationId);
        return standardModRepository.save(standardMod);
    }

    public Behaviors updateBehavior(
            int organismId,
            int adaptationId,
            Behaviors behaviors){
        behaviors.setId(adaptationId);
        return behaviorsRepository.save(behaviors);
    }

    //Create methods
    public Organism createOrganism(Organism organism){
        return organismRepository.save(organism);
    }

    public OffensiveAdaptation createOffensiveAdaptation(
        int organismId,
        OffensiveAdaptation offensiveAdaptation){
        Organism organism = organismRepository.findById(organismId).orElse(null);
        offensiveAdaptation.setOrganism(organism);
            return offensiveAdaptationRepository.save(offensiveAdaptation);
    }

    public DefensiveAdaptation createDefensiveAdaptation(
            int organismId,
            DefensiveAdaptation defensiveAdaptation){
        Organism organism = organismRepository.findById(organismId).orElse(null);
        defensiveAdaptation.setOrganism(organism);
        return defensiveAdaptationRepository.save(defensiveAdaptation);
    }

    public StandardMod createStandardAdaptation(
            int organismId,
            StandardMod standardMod){
        Organism organism = organismRepository.findById(organismId).orElse(null);
        standardMod.setOrganism(organism);
        return standardModRepository.save(standardMod);
    }

    //Delete methods
    public void deleteOrganism(int id){
        organismRepository.deleteById(id);
    }
}
