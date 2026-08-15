package com.pluralsight.helix.organism;



public enum Scale {
    CLASS_I,
    CLASS_II,
    CLASS_III,
    CLASS_IV;

    //set prices of each scale class
    public Double getBasePrice() {
        switch (this) {
            case CLASS_I -> {
                return 800.00;
            }
            case CLASS_II -> {
                return 1200.00;
            }
            case CLASS_III -> {
                return 10000.00;
            }
            case CLASS_IV -> {
                return 15000.00;
            }
            default -> throw new IllegalStateException("Unknown Scale Class");
        }
    }
}
