package com.pluralsight.helix.organism;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@JsonIgnoreProperties("organism")
@Entity
@Table(name = "defensive_adaptations")
public class DefensiveAdaptation extends Adaptation {

    public DefensiveAdaptation() {}

    //pulling from Adaptation
    public DefensiveAdaptation(String name, double basePrice, boolean isExtra) {
        super(name, basePrice, isExtra);
    }
}
