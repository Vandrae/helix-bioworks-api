package com.pluralsight.helix.organism;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Behaviors {
    @ManyToOne
    int id;
    private String name;

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
