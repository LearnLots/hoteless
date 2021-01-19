package com.robin.hoteless.App;

import java.util.concurrent.atomic.AtomicLong;

public class AddNewUser {

    private String firstName;
    private String lastName;
    private AtomicLong counter;

    public AddNewUser(AtomicLong counter, String firstName, String lastName) {
        this.counter = counter;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }





}
