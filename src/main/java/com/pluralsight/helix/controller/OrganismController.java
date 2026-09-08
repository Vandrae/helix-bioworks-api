package com.pluralsight.helix.controller;

import com.pluralsight.helix.organism.*;
import com.pluralsight.helix.service.OrganismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/organisms")

public class OrganismController {
    @Autowired
    private OrganismService organismService;

    //create method that handles get request returns all organisms
    @GetMapping
    public List<Organism> organismList(){
        return organismService.getAllOrganisms();
    }

    //Get a single organism
    @GetMapping("/{id}")
    public Organism organismLookUp(@PathVariable int id){
        return organismService.getOrganismById(id);
    }

    //filter by genome
    @GetMapping("/genome/{genome}")
    public List<Organism> genomeFilter(@PathVariable String genome){
        return organismService.getGenomeByGenome(genome);
    }

    //filter by size
    @GetMapping("/size/{scale}")
    public List<Organism> sizeFilter(@PathVariable String scale){
        return organismService.getScaleByScale(scale);
    }

    //filter by Offensive Adapt
    @GetMapping("/offensive-adaptation/{name}")
    public List<Organism> offensiveFilter(@PathVariable String name){
        return organismService.getOffensiveAdaptationByOffensiveAdaptation(name);
    }

    //filter by Defensive Adapt
    @GetMapping("/defensive-adaptation/{name}")
    public List<Organism> defensiveFilter(@PathVariable String name){
        return organismService.getDefensiveAdaptationByDefensiveAdaptation(name);
    }

    //filter by Standard Attributes
    @GetMapping("/standard-adaptation/{name}")
    public List<Organism> standardFilter(@PathVariable String name){
        return organismService.getStandardByStandard(name);
    }

    //filter by Behavioral Conditioning
    @GetMapping("/behavioral-adaptation/{name}")
    public List<Organism> behavioralFilter(@PathVariable String name){
        return organismService.getBehaviorByBehavior(name);
    }

    //add POST/DELETE endpoints for
    //DefensiveAdaptation
    //OffensiveAdaptation
    //StandardMod
    //Behaviors

    //PUT endpoints
    @PutMapping("/{id}")
    public Organism updateOrganism(@PathVariable int id,@RequestBody Organism organism){
        return organismService.updateOrganism(id, organism);
    }

    @PutMapping("/{organismId}/offensive-adaptation/{adaptationId}")
    public OffensiveAdaptation updateOffensiveAdaptation(
            @PathVariable int organismId,
            @PathVariable int adaptationId,
            @RequestBody OffensiveAdaptation offensiveAdaptation){
        return organismService.updateOffensiveAdaptation(organismId,adaptationId,offensiveAdaptation);
    }

    @PutMapping("/{organismId}/defensive-adaptation/{adaptationId}")
    public DefensiveAdaptation updateDefensiveAdaptation(
            @PathVariable int organismId,
            @PathVariable int adaptationId,
            @RequestBody DefensiveAdaptation defensiveAdaptation){
        return organismService.updateDefensiveAdaptation(organismId,adaptationId,defensiveAdaptation);
    }

    @PutMapping("/{organismId}/standard-adaptation/{adaptationId}")
    public StandardMod updateStandardMod(
            @PathVariable int organismId,
            @PathVariable int adaptationId,
            @RequestBody StandardMod standardMod){
        return organismService.updateStandardMod(organismId,adaptationId,standardMod);
    }

    @PutMapping("/{organismId}/behavioral-adaptation/{adaptationId}")
    public Behaviors updateBehavior(
            @PathVariable int organismId,
            @PathVariable int adaptationId,
            @RequestBody Behaviors behaviors){
        return organismService.updateBehavior(organismId,adaptationId,behaviors);
    }

    //POST = CREATE
    @PostMapping("/{id}")
    public Organism createOrganism(@RequestBody Organism organism){
        return organismService.createOrganism(organism);
    }

    @PostMapping("/{organismId}/offensive-adaptation")
    public OffensiveAdaptation createOffensiveAdaptation(
            @PathVariable int organismId,
            @RequestBody OffensiveAdaptation offensiveAdaptation){
        return organismService.createOffensiveAdaptation(organismId, offensiveAdaptation);
    }

    @PostMapping("/{organismId}/defensive-adaptation")
    public DefensiveAdaptation createDefensiveAdaptation(
            @PathVariable int organismId,
            @RequestBody DefensiveAdaptation defensiveAdaptation){
        return organismService.createDefensiveAdaptation(organismId, defensiveAdaptation);
    }

    @PostMapping("/{organismId}/standard-adaptation")
    public StandardMod createStandardAdaptation(
            @PathVariable int organismId,
            @RequestBody StandardMod standardMod){
        return organismService.createStandardAdaptation(organismId, standardMod);
    }

    //DELETE = DELETE
    @DeleteMapping("/{id}")
    public void deleteOrganism(@PathVariable int id){
        organismService.deleteOrganism(id);
    }


}
