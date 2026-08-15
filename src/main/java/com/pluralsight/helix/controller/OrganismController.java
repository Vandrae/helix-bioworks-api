package com.pluralsight.helix.controller;

import com.pluralsight.helix.organism.Organism;
import com.pluralsight.helix.service.OrganismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
