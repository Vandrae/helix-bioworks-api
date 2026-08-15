package com.pluralsight.helix.order;



public class Maintenance {

    //set price of a maintenance package
    public Double getPrice(){
        return 150.00;

    }

    @Override
    public String toString() {
        return "Standard Maintenance " + " " + getPrice();
    }
}
