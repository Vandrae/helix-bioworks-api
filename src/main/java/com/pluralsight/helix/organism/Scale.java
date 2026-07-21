package com.pluralsight.helix.organism;

public enum Scale {
    CLASS_I,
    CLASS_II,
    CLASS_III,
    CLASS_IV;

    //set prices of each scale class
    public Credits getBasePrice() {
        switch (this) {
            case CLASS_I -> {
                return new Credits(800.00);
            }
            case CLASS_II -> {
                return new Credits(1200.00);
            }
            case CLASS_III -> {
                return new Credits(10000.00);
            }
            case CLASS_IV -> {
                return new Credits(15000.00);
            }
            default -> throw new IllegalStateException("Unknown Scale Class");
        }
    }
}
