package com.pluralsight.helix;

public record Credits(double amount) {

    //methods
    public Credits add(Credits cost) {
        return new Credits(this.amount + cost.amount);
    }

    @Override
    public String toString() {
        return String.format("⏣%,.2f", amount) + " " + "CR";
    }
}
