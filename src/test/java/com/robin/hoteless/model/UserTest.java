package com.robin.hoteless.model;

import junit.framework.TestCase;
import org.junit.Test;

public class UserTest extends TestCase {

    @Test
    public void testInput() {
        User user = new User();
        String firstName = "Robin";
        String lastName = "Gomez";

        user.setFirstName(firstName);
        user.setLastName(lastName);
        assertEquals(user.getFirstName(), firstName);
        assertEquals(user.getLastName(), lastName);
    }
}