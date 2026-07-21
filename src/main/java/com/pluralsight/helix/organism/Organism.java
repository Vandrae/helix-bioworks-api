package com.pluralsight.helix.organism;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Organism {
    private final ArrayList<OffensiveAdaptation> weapons;
    private final ArrayList<DefensiveAdaptation> defenses;
    private final ArrayList<StandardMod> mods;
    private final ArrayList<Behaviors> behaviors;
    private final Genome genome;
    private final Scale scale;
    boolean acceleratedGrowth;

    //methods
    public Credits getPrice() {

        Credits total = scale.getBasePrice();
        int wepCount = 0;
        int defCount = 0;
        //loop through each item on the list then get the price of each weapon and add it to
        // the price of the creature's size
        for (OffensiveAdaptation weapon : weapons) {
            if (wepCount <= 2) {
                total = total.add(weapon.getPrice(scale));
            } else {
                //compounding price if there are more than 3 adaptations on a single creature
                //total of the first 3 x the price of the 4th
                //total of 3 x the price of the 4th x the price of the 5th
                total = new Credits(total.amount() * weapon.getPrice(scale).amount());
            }
            wepCount += 1;
        }

        for (DefensiveAdaptation defense : defenses) {
            if (defCount <= 2) {
                total = total.add(defense.getPrice(scale));
            } else {
                total = new Credits(total.amount() * defense.getPrice(scale).amount());
            }
            defCount += 1;
        }

        if (acceleratedGrowth) {
            //converting the product of amount and 1.15 back to a credit so it can be used
            total = new Credits(total.amount() * 1.15);
        }
        return total;
    }

    //to string for receipt
    @Override
    public String toString() {
        return "Genome: " + genome + "\n" +
                "Scale: " + scale + "\n" +
                " " + "\n" +
                "Offensive Adaptations: " + "\n" +
                formatList(weapons, false) + "\n" +
                "   " + "\n" +
                "Defensive Adaptations: " + "\n" +
                formatList(defenses, false) + "\n" +
                " " + "\n" +
                "Mods: " + "\n" +
                formatList(mods, false) + "\n" +
                " " + "\n" +
                "Behavioral conditioning: " + "\n" +
                formatList(behaviors, false) + "\n" +
                " " + "\n" +
                //changes True/False to Yes/No
                "Accelerated Growth: " + (acceleratedGrowth ? "Yes" : "No") + "\n" +
                "Total Price: " + getPrice();
    }


    public Organism(Genome genome, Scale scale, boolean acceleratedGrowth) {
        this.weapons = new ArrayList<>();
        this.defenses = new ArrayList<>();
        this.mods = new ArrayList<>();
        this.behaviors = new ArrayList<>();
        this.genome = genome;
        this.scale = scale;
        this.acceleratedGrowth = acceleratedGrowth;
    }

    //Format Lists to be used in tostring for better looking outputs
    //a list of anytype and everything on it is converted into a string
    private String formatList(List<?> items, boolean brackets){
        String open;
        if (brackets){
            open ="[\n\t";
        }else{
            open = "\t";
        }

        String close;
        if (brackets){
            close ="\n]";
        }else{
            close = " ";
        }

        return items.stream().map(Object::toString)
                .collect(Collectors.joining(",\n\t", open, close));
    }

    //add to arraylist
    public void setAcceleratedGrowth(boolean acceleratedGrowth) {
        this.acceleratedGrowth = acceleratedGrowth;
    }

    public void addWeapons(OffensiveAdaptation singleWeapon) {
        weapons.add(singleWeapon);
    }


    public void addDefenses(DefensiveAdaptation singleDefense) {
        defenses.add(singleDefense);
    }


    public void addMods(StandardMod singleMod) {
        mods.add(singleMod);
    }

    public ArrayList<StandardMod> getMods() {
        return mods;
    }

    public void addBehaviors(Behaviors singleBehavior) {
        behaviors.add(singleBehavior);
    }

