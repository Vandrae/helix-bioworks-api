package com.pluralsight.helix.organism;

import com.pluralsight.helix.Credits;
import jakarta.persistence.*;

@MappedSuperclass

public class Adaptation {
    //auto increment handled by the db because of (strategy = GenerationType.IDENTITY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "base_price")
    private double basePrice;

    @Column(name = "is_extra")
    private boolean isExtra;

    @ManyToOne
    @JoinColumn(name = "organism_id")
    private Organism organism;

    //methods
    public Credits getPrice(Scale scale) {
        switch (scale) {
            case CLASS_I -> {
                return new Credits(basePrice.amount() * 1);
            }
            case CLASS_II -> {
                return new Credits(basePrice.amount() * 2);
            }
            case CLASS_III -> {
                return new Credits(basePrice.amount() * 3);
            }
            case CLASS_IV -> {
                return new Credits(basePrice.amount() * 4);
            }
            default -> throw new IllegalStateException("Unknown Scale Class");

        }
    }

    //message confirmation of what the premium charge is and for how much
    @Override
    public String toString() {
        return "Premium Charge - " + name + " | " + basePrice;
    }

    //constructor
    public Adaptation(String name, double basePrice, boolean isExtra) {
        this.name = name;
        this.basePrice = basePrice;
        this.isExtra = isExtra;
    }

    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Credits getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Credits basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }
}
