package com.pluralsight.helix.controller;

import com.pluralsight.helix.organism.Organism;
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

    //add POST/PUT/DELETE endpoints

}
