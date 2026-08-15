package com.pluralsight.helix.organism;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@JsonIgnoreProperties("organism")
@Entity
@Table(name =  "behaviors")
public class Behaviors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "organism_id")
    private Organism organism;

    public Behaviors() {}


    //methods
    @Override
    public String toString() {
        return "Behavioral conditioning: " + name;
    }

    //constructor
    public Behaviors(String name) {
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
