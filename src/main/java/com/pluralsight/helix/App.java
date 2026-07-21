package com.pluralsight.helix;

import com.pluralsight.creature.*;
import com.pluralsight.helix.order.ReceiptWriter;
import com.pluralsight.order.*;

import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static Order order = new Order();
    public static Organism organismChoice;
    public static Genome genomeChoice;
    public static Scale scaleChoice;
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        homeMenu();
    }

    public static void homeMenu() {
        while (true) {
            System.out.println("""
                     ╔══════════════════════════════╗
                     ║        HELIX BIOWORKS        ║
                     ╚══════════════════════════════╝
                    """);
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.println(" ");
            int homeInput = input.nextInt();

            //calls methods with code for each function
            switch (homeInput) {
                case 1:
                    addCreature();
                    break;
                case 0:
                    System.out.println("The program exits");
                    return;
            }

        }

    }
    //menu methods

    public static void addCreature() {
        while (true) {
            System.out.println("""
                     ╔══════════════════════════════╗
                     ║          Order Menu          ║
                     ╚══════════════════════════════╝
                    """);
            System.out.println("1) Commission Creature (build form scratch)");
            System.out.println("2) Template Creature (pre-built Creatures)");
            System.out.println("3) Add Transport Package");
            System.out.println("4) Add Maintenance Kit");
            System.out.println("5) Checkout");
            System.out.println("0) Cancel Order");
            System.out.println(" ");
            int newOrderInput = input.nextInt();

            switch (newOrderInput) {
                case 1:
                    //Commission Creature
                    commissionCreature();
                    break;
                case 2:
                    templateCreature();
                    break;
                case 3:
                    //Add Transport Package
                    transportPackage();
                    break;
                case 4:
                    //Add Maintenance Kit
                    maintenanceKit();
                    break;
                case 5:
                    //Checkout
                    Checkout();
                    return;
                case 0:
                    //Cancel Order using App.cancelOrder(); to makesure we call the correct cancelOrder() method
                    App.cancelOrder();
                    return;
            }
        }
    }

    public static void commissionCreature() {
        while (true) {
            System.out.println("""
                     ╔══════════════════════════════╗
                     ║      Commission Creature     ║
                     ╚══════════════════════════════╝
                    """);
            System.out.println("1) Genome");
            System.out.println("2) Size");
            System.out.println(YELLOW +"3) Offensive Adaptations (premium charge)");
            System.out.println("4) Defensive Adaptations (premium charge)" + RESET);
            System.out.println("5) Standard Attributes");
            System.out.println("6) Behavioral Conditioning");
            System.out.println(YELLOW + "7) Accelerated Growth +15% (Rush Order)" + RESET);
            System.out.println("8) Add to Cart");
            System.out.println("0) Back");
            System.out.println(" ");
            int commissionInput = input.nextInt();

            switch (commissionInput) {
                case 1:
                    //Genome
                    genomeMenu();
                    break;
                case 2:
                    //Scale
                    sizeMenu();
                    break;
                case 3:
                    //OO
                    offensiveMenu();
                    break;
                case 4:
                    //DO
                    defensiveMenu();
                    break;
                case 5:
                    //SA
                    standardMenu();
                    break;
                case 6:
                    //Conditioning
                    behaviorMenu();
                    break;
                case 7:
                    //GV
                    acceleratedGrowth();
                    break;
                case 8:
                    order.addOrganism(organismChoice);
                    System.out.println(order.getOrderSummary());
                    return;
                case 0:
                    return;
            }
        }

    }

    public static void genomeMenu() {
        System.out.println("""
                     ╔══════════════════════════════╗
                     ║          Genome Menu         ║
                     ╚══════════════════════════════╝
                    """);
        System.out.println("1) Primate");
        System.out.println("2) Insectoid");
        System.out.println("3) Reptilian");
        System.out.println("4) Avian");
        System.out.println("5) Aquatic");
        System.out.println("6) Apex");
        System.out.println("0) Back");
        System.out.println(" ");
        int genomeInput = input.nextInt();

        switch (genomeInput) {
            case 1:
                genomeChoice = Genome.PRIMATE;
                System.out.println("you selected the Primate Genome");
                System.out.println(" ");
                break;
            case 2:
                genomeChoice = Genome.INSECTOID;
                System.out.println("you selected the Insectoid Genome");
                System.out.println(" ");
                break;
            case 3:
                genomeChoice = Genome.REPTILIAN;
                System.out.println("you selected the Reptilian Genome");
                System.out.println(" ");
                break;
            case 4:
                genomeChoice = Genome.AVIAN;
                System.out.println("you selected the Avian Genome");
                System.out.println(" ");
                break;
            case 5:
                genomeChoice = Genome.AQUATIC;
                System.out.println("you selected the Aquatic Genome");
                System.out.println(" ");
                break;
            case 6:
                genomeChoice = Genome.APEX;
                System.out.println("you selected the Apex Genome");
                System.out.println(" ");
                break;
            case 0:
                break;
        }
    }

    public static void sizeMenu() {
        System.out.println("""
                     ╔══════════════════════════════╗
                     ║           Size Menu          ║
                     ╚══════════════════════════════╝
                    """);
        System.out.println("1) Class I - ⏣800 (Dog)");
        System.out.println("2) Class II - ⏣1200 (Human)");
        System.out.println("3) Class III - ⏣10000 (Car)");
        System.out.println("4) Class IV - ⏣15000 (Excavator)");
        System.out.println("0) Cancel Order");
        System.out.println(" ");
        int sizeInput = input.nextInt();

        switch (sizeInput) {
            case 1:
                scaleChoice = Scale.CLASS_I;
                System.out.println("you selected Class I");
                break;
            case 2:
                scaleChoice = Scale.CLASS_II;
                System.out.println("you selected Class II");
                break;
            case 3:
                scaleChoice = Scale.CLASS_III;
                System.out.println("you selected Class III");
                break;
            case 4:
                scaleChoice = Scale.CLASS_IV;
                System.out.println("you selected Class IV");
                break;
            case 0:
                break;

        }
        if (sizeInput >= 1) {
            organismChoice = new Organism(genomeChoice, scaleChoice, false);
        }

    }

    public static void offensiveMenu() {
        while (true) {
            System.out.println("""
                     ╔══════════════════════════════╗
                     ║       Offensive Traits       ║
                     ╚══════════════════════════════╝
                    """);
            System.out.println("Each option up to 3 is 500 the 4th and after is a compounding price on itself");
            System.out.println(" ");
            System.out.println("1) Venom Glands");
            System.out.println("2) Razor bone spurs");
            System.out.println("3) Bio-electric organs");
            System.out.println("4) Acid secretion sacs");
            System.out.println("5) Crushing Appendages");
            System.out.println("6) Active Camouflage");
            System.out.println("0) Back");
            System.out.println(" ");
            int offensiveInput = input.nextInt();


            switch (offensiveInput) {
                case 1:
                    organismChoice.addWeapons(new OffensiveAdaptation("Venom Glands", new Credits(500), false));
                    System.out.println("Venom Glands has been added");
                    break;
                case 2:
                    organismChoice.addWeapons(new OffensiveAdaptation("Razor bone spurs", new Credits(500), false));
                    System.out.println("Razor bone spurs has been added");
                    break;
                case 3:
                    organismChoice.addWeapons(new OffensiveAdaptation("Bio-electric organs", new Credits(500), false));
                    System.out.println("Bio-electric organs has been added");
                    break;
                case 4:
                    organismChoice.addWeapons(new OffensiveAdaptation("Acid secretion sacs", new Credits(500), false));
                    System.out.println("Acid secretion sacs has been added");
                    break;
                case 5:
                    organismChoice.addWeapons(new OffensiveAdaptation("Crushing Appendages", new Credits(500), false));
                    System.out.println("Crushing Appendages has been added");
                    break;
                case 6:
                    organismChoice.addWeapons(new OffensiveAdaptation("Active Camouflage", new Credits(500), false));
                    System.out.println("Active Camouflage has been added");
                    break;
                case 0:
                    return;

            }
        }
    }

    public static void defensiveMenu() {
        while (true) {
            System.out.println("""
                     ╔══════════════════════════════╗
                     ║       Defensive Traits       ║
                     ╚══════════════════════════════╝
                    """);
            System.out.println("Each option up to 3 is 500 the 4th and after is a compounding price on itself");
            System.out.println(" ");
            System.out.println("1) Subdermal Armor");
            System.out.println("2) Rapid Clotting Tissue");
            System.out.println("3) Toxin Immunity");
            System.out.println("4) Chromatophore Camo");
            System.out.println("5) Severe Heat Hide");
            System.out.println("6) Severe Cold Hide");
            System.out.println("0) Back");
            System.out.println(" ");
            int defensiveInput = input.nextInt();


            switch (defensiveInput) {
                case 1:
                    organismChoice.addDefenses(new DefensiveAdaptation("Subdermal Armor", new Credits(500), false));
                    System.out.println("Subdermal Armor has been added");
                    break;
                case 2:
                    organismChoice.addDefenses(new DefensiveAdaptation("Rapid Clotting Tissue", new Credits(500), false));
                    System.out.println("Rapid Clotting Tissue has been added");
                    break;
                case 3:
                    organismChoice.addDefenses(new DefensiveAdaptation("Toxin Immunity", new Credits(500), false));
                    System.out.println("Toxin Immunity has been added");
                    break;
                case 4:
                    organismChoice.addDefenses(new DefensiveAdaptation("Chromatophore Camo", new Credits(500), false));
                    System.out.println("Chromatophore Camo has been added");
                    break;
                case 5:
                    organismChoice.addDefenses(new DefensiveAdaptation("Severe Heat Hide", new Credits(500), false));
                    System.out.println("Severe Heat Hide has been added");
                    break;
                case 6:
                    organismChoice.addDefenses(new DefensiveAdaptation("Severe Cold Hide", new Credits(500), false));
                    System.out.println("Severe Cold Hide has been added");
                    break;
                case 0:
                    return;

            }
        }
    }

    public static void standardMenu() {
        while (true) {
            System.out.println("""
                     ╔══════════════════════════════╗
                     ║       Standard Traits        ║
                     ╚══════════════════════════════╝
                    """);
            System.out.println("Choose any number of Options no extra charge");
            System.out.println(" ");
            System.out.println("1) Enhanced Smell");
            System.out.println("2) Infrared Vision");
            System.out.println("3) Increased Stamina");
            System.out.println("4) Aggression tuning");
            System.out.println("5) Pack Tactics");
            System.out.println("6) Vocal Suppression");
            System.out.println("7) Neural Compliance");
            System.out.println("0) Back");
            System.out.println(" ");
            int standardInput = input.nextInt();

            switch (standardInput) {
                case 1:
                    organismChoice.addMods(new StandardMod("Enhanced Smell"));
                    System.out.println("Enhanced Smell has been added");
                    break;
                case 2:
                    organismChoice.addMods(new StandardMod("Infrared Vision"));
                    System.out.println("Infrared Vision has been added");
                    break;
                case 3:
                    organismChoice.addMods(new StandardMod("Increased Stamina"));
                    System.out.println("Increased Stamina has been added");
                    break;
                case 4:
                    organismChoice.addMods(new StandardMod("Aggression tuning"));
                    System.out.println("Aggression Tuning has been added");
                    break;
                case 5:
                    organismChoice.addMods(new StandardMod("Pack Tactics"));
                    System.out.println("Pack Tactics has been added");
                    break;
                case 6:
                    organismChoice.addMods(new StandardMod("Vocal Suppression"));
                    System.out.println("Vocal Suppression has been added");
                    break;
                case 7:
                    organismChoice.addMods(new StandardMod("Neural Compliance"));
                    System.out.println("Neural Compliance has been added");
                    break;
                case 0:
                    return;

            }
        }
    }

    public static void behaviorMenu() {
        while (true) {
            System.out.println("""
                     ╔══════════════════════════════╗
                     ║    Behavioral Conditioning   ║
                     ╚══════════════════════════════╝
                    """);
            System.out.println("Choose any number of Options no extra charge");
            System.out.println(" ");
            System.out.println("1) Imprinting Bonding");
            System.out.println("2) Aggression Targeting");
            System.out.println("3) Territorial");
            System.out.println("4) Feral");
            System.out.println("5) Memory Erasure");
            System.out.println("0) Back");
            System.out.println(" ");
            int behaviorInput = input.nextInt();

            switch (behaviorInput) {
                case 1:
                    organismChoice.addBehaviors(new Behaviors("Imprinting Bonding"));
                    System.out.println("Imprinting Bonding has been added");
                    break;
                case 2:
                    organismChoice.addBehaviors(new Behaviors("Aggression Targeting"));
                    System.out.println("Aggression Targeting has been added");
                    break;
                case 3:
                    organismChoice.addBehaviors(new Behaviors("Territorial"));
                    System.out.println("Territorial has been added");
                    break;
                case 4:
                    organismChoice.addBehaviors(new Behaviors("Feral"));
                    System.out.println("Feral has been added");
                    break;
                case 5:
                    organismChoice.addBehaviors(new Behaviors("Memory Erasure"));
                    System.out.println("Memory Erasure has been added");
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void acceleratedGrowth() {
        System.out.println("Do you want Accelerated Growth?");
        System.out.println(" ");
        System.out.println("1) Yes");
        System.out.println("2) No");
        System.out.println("0) Back");
        System.out.println(" ");
        int growthInput = input.nextInt();

        switch (growthInput) {
            case 1:
                organismChoice.setAcceleratedGrowth(true);
                System.out.println("Accelerated Growth has been added");
                break;
            case 2:
                break;
            case 0:
                break;
        }
    }

    public static void templateCreature() {
        System.out.println("""
                     ╔══════════════════════════════╗
                     ║      Template Creatures      ║
                     ╚══════════════════════════════╝
                    """);
        System.out.println(" ");
        System.out.println("1) The Phantom - ⏣7,200");
        System.out.println("0) Back");
        System.out.println(" ");
        int templateInput = input.nextInt();

        switch (templateInput) {
            case 1:
                order.addOrganism(SignatureOrganism.phantom());
                System.out.println(order.getOrderSummary());
                System.out.println("The Phantom has been added");
                break;
            case 0:
                break;
        }
    }

    public static void transportPackage() {
        System.out.println("""
                     ╔══════════════════════════════╗
                     ║       Transport Package      ║
                     ╚══════════════════════════════╝
                    """);
        System.out.println(" ");
        System.out.println("1) Small Transport Crate - ⏣500");
        System.out.println("2) Medium Transport Crate - ⏣1000");
        System.out.println("3) Large Transport Crate - ⏣2000");
        System.out.println("4) Extra Large Transport Crate - ⏣5000");
        System.out.println("0) Back");
        System.out.println(" ");
        int transportInput = input.nextInt();

        switch (transportInput) {
            case 1:
                order.setTransportPackage(new TransportPackage(Size.SMALL));
                System.out.println(order.getOrderSummary());
                System.out.println("Small Transport Crate added");
                break;
            case 2:
                order.setTransportPackage(new TransportPackage(Size.MEDIUM));
                System.out.println(order.getOrderSummary());
                System.out.println("Medium Transport Crate added");
                break;
            case 3:
                order.setTransportPackage(new TransportPackage(Size.LARGE));
                System.out.println(order.getOrderSummary());
                System.out.println("Large Transport Crate added");
                break;
            case 4:
                order.setTransportPackage(new TransportPackage(Size.EXTRA_LARGE));
                System.out.println(order.getOrderSummary());
                System.out.println("Extra Large Transport Crate added");
                break;
            case 0:
                break;
        }
    }

    public static void maintenanceKit() {
        System.out.println("Do you want to add a Maintenance Kit?");
        System.out.println(" ");
        System.out.println("1) Yes - ⏣150 ");
        System.out.println("2) No");
        System.out.println("0) Back");
        System.out.println("================================");
        int maintenanceInput = input.nextInt();
        switch (maintenanceInput) {
            case 1:
                order.setMaintenance(new Maintenance());
                System.out.println(order.getOrderSummary());
                System.out.println("Maintenance Kit added");
                break;
            case 2:
                break;
            case 0:
                break;
        }
    }

    public static void Checkout() {
        System.out.println(order.getOrderSummary());
        confirmOrder();
    }

    public static void confirmOrder() {
        System.out.println("Are you sure you want to Check Out?");
        System.out.println("1) Yes - Confirm");
        System.out.println("2) No - Cancel Order");
        int checkoutInput = input.nextInt();

        switch (checkoutInput) {
            case 1:
                ReceiptWriter.receipt(order);
                break;
            case 2:
                cancelOrder();
                break;
        }
    }

    public static void cancelOrder() {
        order.cancelOrder();
    }
}
