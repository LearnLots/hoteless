package com.robin.hoteless;

import com.robin.hoteless.Model.Room;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testModels {

    @Test
    public void testOutput() {
        // Test Values
        String bedSize = "Large";
        boolean hasKitchenette = true;
        double roomPrice = 44.21;
        int numberOfBeds = 5;


        Room room = new Room();
        room.setBed(bedSize);
        room.setHasKitchenette(hasKitchenette);
        room.setPrice(roomPrice);
        room.setNubmerOfBeds(numberOfBeds);

        assertEquals(room.getBed(), bedSize);
        assertEquals(room.getNubmerOfBeds(), numberOfBeds);
        assertEquals(room.getPrice(), roomPrice, .01);
        assertEquals(room.hasKitchenette(), hasKitchenette);
    }
}
