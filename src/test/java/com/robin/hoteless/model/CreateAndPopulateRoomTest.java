package com.robin.hoteless.model;

import com.robin.hoteless.model.Room;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreateAndPopulateRoomTest {

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
        room.setNumberOfBeds(numberOfBeds);

        assertEquals(room.getBed(), bedSize);
        assertEquals(room.getNumberOfBeds(), numberOfBeds);
        assertEquals(room.getPrice(), roomPrice, .01);
        assertEquals(room.hasKitchenette(), hasKitchenette);
    }
}
