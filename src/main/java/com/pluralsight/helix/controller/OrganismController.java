package com.pluralsight.helix.controller;

import com.pluralsight.helix.organism.Organism;
import com.pluralsight.helix.service.OrganismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Organism> organismLookUp(){
        return null;
    }

    //filter by genome
    @GetMapping("/genome/{id}")
    public List<Organism> genomeFilter(){
        return null;
    }

    //filter by size
    @GetMapping("/size/{id}")
    public List<Organism> sizeFilter(){
        return null;
    }

    //filter by Offensive Adapt
    @GetMapping
    public List<Organism> offensiveFilter(){
        return null;
    }

    //filter by Defensive Adapt
    @GetMapping
    public List<Organism> defensiveFilter(){
        return null;
    }

    //filter by Standard Attributes
    @GetMapping
    public List<Organism> standardFilter(){
        return null;
    }

    //filter by Behavioral Conditioning
    @GetMapping
    public List<Organism> behavioralFilter(){
        return null;
    }

    //filter by Accelerated Growth
    @GetMapping
    public List<Organism> growthFilter(){
        return null;
    }

    //get all adaptations for one organism
    @GetMapping("/organisms/{id}/adaptations")
    public List<Organism> adaptationsLookUp(){
        return null;
    }

}
