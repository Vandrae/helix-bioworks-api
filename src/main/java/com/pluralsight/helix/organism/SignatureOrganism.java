package com.pluralsight.helix.organism;

import com.pluralsight.helix.Credits;

public class SignatureOrganism extends Organism {

    public SignatureOrganism(Genome genome, Scale scale, boolean acceleratedGrowth) {
        super(genome, scale, acceleratedGrowth);
    }

    //preset templates
    public static Organism phantom() {

        Organism phantom = new Organism(Genome.REPTILIAN, Scale.CLASS_II, false);

        DefensiveAdaptation phantomDefensive1 = new DefensiveAdaptation("Toxin Immunity", new Credits(500), false);
        DefensiveAdaptation phantomDefensive2 = new DefensiveAdaptation("Rapid Clotting Tissue", new Credits(500), false);
        DefensiveAdaptation phantomDefensive3 = new DefensiveAdaptation("Severe Cold Hide", new Credits(500), false);
        phantom.addDefenses(phantomDefensive1);
        phantom.addDefenses(phantomDefensive2);
        phantom.addDefenses(phantomDefensive3);

        OffensiveAdaptation phantomOffensive1 = new OffensiveAdaptation("Venom Glands", new Credits(500), false);
        OffensiveAdaptation phantomOffensive2 = new OffensiveAdaptation("Razor bone spurs", new Credits(500), false);
        OffensiveAdaptation phantomOffensive3 = new OffensiveAdaptation("Active Camouflage", new Credits(500), false);
        phantom.addWeapons(phantomOffensive1);
        phantom.addWeapons(phantomOffensive2);
        phantom.addWeapons(phantomOffensive3);

        StandardMod phantomStandard1 = new StandardMod("Pack Tactics");
        StandardMod phantomStandard2 = new StandardMod("Neural Compliance");
        StandardMod phantomStandard3 = new StandardMod("Infrared Vision");
        StandardMod phantomStandard4 = new StandardMod("Aggression tuning");
        StandardMod phantomStandard5 = new StandardMod("Enhanced Smell");
        phantom.addMods(phantomStandard1);
        phantom.addMods(phantomStandard2);
        phantom.addMods(phantomStandard3);
        phantom.addMods(phantomStandard4);
        phantom.addMods(phantomStandard5);

        Behaviors phantomBehavior1 = new Behaviors("Aggression Targeting");
        Behaviors phantomBehavior2 = new Behaviors("Territorial");
        phantom.addBehaviors(phantomBehavior1);
        phantom.addBehaviors(phantomBehavior2);

        return phantom;
    }

}
