package com.pluralsight.helix.organism;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class StandardMod {
    @ManyToOne
    int id;
    private String name;

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
