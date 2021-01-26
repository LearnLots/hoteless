package com.robin.hoteless.model;

public class Room {
    private double price;
    private String bed;
    private int numberOfBeds;
    private boolean hasKitchenette;

    public double getPrice() {
        return price;
    }

    public Room setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getBed() {
        return bed;
    }

    public Room setBed(String bed) {
        this.bed = bed;
        return this;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public Room setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        return this;
    }

    public boolean hasKitchenette() {
        return hasKitchenette;
    }

    public Room setHasKitchenette(boolean hasKitchenette) {
        this.hasKitchenette = hasKitchenette;
        return this;
    }
}
