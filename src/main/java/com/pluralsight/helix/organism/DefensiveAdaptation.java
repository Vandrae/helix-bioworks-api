package com.pluralsight.helix.organism;

import com.pluralsight.helix.Credits;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "defensive_adaptations")
public class DefensiveAdaptation extends Adaptation {


    //pulling from Adaptation
    public DefensiveAdaptation(String name, double basePrice, boolean isExtra) {
        super(name, basePrice, isExtra);
    }
}
