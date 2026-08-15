package com.pluralsight.helix.order;

public enum Size {
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE;

    public Credits getPrice(){
        switch (this){
            case SMALL -> {
                return new Credits(500);
            }
            case MEDIUM -> {
                return new Credits(1000);
            }
            case LARGE -> {
                return new Credits(2000);
            }
            case EXTRA_LARGE -> {
                return new Credits(5000);
            }default -> throw new IllegalStateException("Unknown Size");
        }
    }



}
