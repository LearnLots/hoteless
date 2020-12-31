package com.robin.hoteless.Model;

public class Room {
    private double price;
    private String bed;
    private int nubmerOfBeds;
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

    public int getNubmerOfBeds() {
        return nubmerOfBeds;
    }

    public Room setNubmerOfBeds(int nubmerOfBeds) {
        this.nubmerOfBeds = nubmerOfBeds;
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
