package com.pluralsight.helix.organism;

public class Behaviors {
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
