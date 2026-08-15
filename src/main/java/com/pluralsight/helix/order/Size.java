package com.pluralsight.helix.order;

public enum Size {
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE;

    public Double getPrice(){
        switch (this){
            case SMALL -> {
                return 500.00;
            }
            case MEDIUM -> {
                return 1000.00;
            }
            case LARGE -> {
                return 2000.00;
            }
            case EXTRA_LARGE -> {
                return 5000.00;
            }default -> throw new IllegalStateException("Unknown Size");
        }
    }



}
