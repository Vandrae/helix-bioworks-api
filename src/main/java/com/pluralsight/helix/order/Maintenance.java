package com.pluralsight.helix.order;

import com.pluralsight.helix.Credits;

public class Maintenance {

    //set price of a maintenance package
    public Credits getPrice(){
        return new Credits(150.00);

    }

    @Override
    public String toString() {
        return "Standard Maintenance " + " " + getPrice();
    }
}
