package com.pluralsight.helix.organism;

import com.pluralsight.helix.Credits;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "offensive_adaptations")
public class OffensiveAdaptation extends Adaptation {

    //pulling from Adaptation
    public OffensiveAdaptation(String name, double basePrice, boolean isExtra) {
        super(name, basePrice, isExtra);
    }
}
