package com.pluralsight.helix.order;

public class TransportPackage {
    private final Size size;

    //methods
    public Double getPrice(){
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
