package com.robin.hoteless.Model;

public class Room {
    private float price;
    private String bed;
    private int nubmerOfBeds;
    private boolean hasKitchenette;

    public float getPrice() {
        return price;
    }

    public Room setPrice(float price) {
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

    public boolean isHasKitchenette() {
        return hasKitchenette;
    }

    public Room setHasKitchenette(boolean hasKitchenette) {
        this.hasKitchenette = hasKitchenette;
        return this;
    }
}
