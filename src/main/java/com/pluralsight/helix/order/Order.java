package com.pluralsight.helix.order;

import java.util.ArrayList;

public class Order {
    private final ArrayList<Organism> creature;
    private TransportPackage transportPackage;
    private Maintenance maintenance;

    public Order() {
        this.creature = new ArrayList<>();
        this.transportPackage = null;
        this.maintenance = null;
    }

    public void addOrganism(Organism singleCreature) {
        creature.add(singleCreature);
    }

    public void setTransportPackage(TransportPackage transportPackage) {
        this.transportPackage = transportPackage;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public void cancelOrder(){
        creature.clear();
        transportPackage = null;
        maintenance = null;
    }

    public Credits getTotal() {
        Credits total = new Credits(0);
        for (Organism singleCreature : creature) {
            total = total.add(singleCreature.getPrice());
        }

        //if there is nothing on the transport package list don't print the list
        if (transportPackage != null) {
            total = total.add(transportPackage.getPrice());
        }

        //if there is nothing on the transport package list don't print the list
        if (maintenance != null) {
            total = total.add(maintenance.getPrice());
        }
        return total;
    }

    public String getOrderSummary() {

        StringBuilder newString = new StringBuilder();
        for (Organism stringOrganism : creature) {
            newString.append(stringOrganism).append("\n\n");
        }
        if (maintenance != null) {
            newString.append("Maintenance: ").append(maintenance).append("\n");
        }
        if (transportPackage != null) {
            newString.append("Transport package: ").append(transportPackage).append("\n");


        }

        // add a blank separator line between built items
        return "╔══════════════════════════════╗" + "\n" +
                "║        HELIX BIOWORKS        ║" + "\n" +
                "╚══════════════════════════════╝" + "\n" +
                " " + "\n" +
                newString + "\n" +
                "Total: " + getTotal() + "\n" +
                " " + "\n\n";
    }
}
