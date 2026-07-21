package com.pluralsight.helix.order;

import com.pluralsight.helix.Credits;

public class TransportPackage {
    private final Size size;

    //methods
    public Credits getPrice(){
        return size.getPrice();
    }

    //constructor
    public TransportPackage(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return " " + size + " " + getPrice();
    }
}
