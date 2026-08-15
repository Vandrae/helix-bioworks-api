package com.pluralsight.helix.organism;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@JsonIgnoreProperties("organism")
@Entity
@Table(name =  "standard_mods")
public class StandardMod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "organism_id")
    private Organism organism;

    public StandardMod() {}

    //methods
    @Override
    public String toString() {
        return "Standard Modifications: " + name;
    }

    //constructor
    public StandardMod(String name) {
        this.name = name;
    }

    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
