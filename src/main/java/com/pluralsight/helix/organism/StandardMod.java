package com.pluralsight.helix.organism;

public class StandardMod {

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
