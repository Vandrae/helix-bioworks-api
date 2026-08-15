package com.pluralsight.helix.organism;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@JsonIgnoreProperties("organism")
@Entity
@Table(name = "offensive_adaptations")
public class OffensiveAdaptation extends Adaptation {

    public OffensiveAdaptation() {}

    //pulling from Adaptation
    public OffensiveAdaptation(String name, double basePrice, boolean isExtra) {
        super(name, basePrice, isExtra);
    }
}
