package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        bookRoom();
    }

    public static void bookRoom() {
        Double bedCost;
        String bedType;
        Scanner s = new Scanner(System.in);

        // create room types hashmap <associated with roomCost hashmap by key value>
        Map<Integer, String> roomTypes = new HashMap<>();
        roomTypes.put(1, "King");
        roomTypes.put(2, "Double Queen");
        roomTypes.put(3, "Single Queen");
        roomTypes.put(4, "Full");

        // create room cost hashmap <associated with roomTypes hashmap by key value>
        Map<Integer, Double> roomCost = new HashMap<>();
        roomCost.put(1,159.99);
        roomCost.put(2,139.99);
        roomCost.put(3,129.99);
        roomCost.put(4,109.99);

        System.out.println();
        System.out.println("Welcome to our room booking tool! Here is our current availability:\n");

        // print hashmap of room types
        for (Integer i : roomTypes.keySet()) {
            System.out.printf("%s - %s\n", i, roomTypes.get(i));
        }

        System.out.println("hello");
        System.out.println();
        System.out.println("Please enter a number corresponding to your preferred room type:");

        // user input : request room preference <pulls from hashmap for room type and price>
        int preferredRoom = s.nextInt();

        while (preferredRoom < 1 || preferredRoom > 4)
        {
            System.out.println("Your entry " + preferredRoom + " is invalid. Please choose a number between 1 and " +
                    roomTypes.size() + " which corresponds with your desired room configuration.");
            preferredRoom = s.nextInt();
        }
        // set room roomCost value from hashmap based on preferredRoom value
        bedCost = roomCost.get(preferredRoom);

        // set room roomType value from hashmap based on preferredRoom value
        bedType = roomTypes.get(preferredRoom);

        // print cost of room per night
        System.out.printf("For the %s room it will cost $%s per night.\n" +
                "How many nights would you like to stay?\n", bedType.toLowerCase(),bedCost);

        // user input : ask for length of stay
        int nights = s.nextInt();
        s.nextLine();

        System.out.println("Enter your desired check-in date in mm/dd/yy format:");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yy");
        LocalDate checkIn = null;

        // create boolean for try/catch block to handle parsing exceptions
        boolean parseError;
        do {
            try {
                // user input : request check-in date in mm/dd/yy format
                parseError = false;
                checkIn = LocalDate.parse(s.nextLine(), format);
            } catch (Exception e) {
                // if incorrect format, repeat request for proper date format
                parseError = true;
                System.out.println("Your entry is invalid. Please enter a valid date in mm/dd/yy format:");
            }
        } while (parseError);

        // compute checkOut date
        LocalDate checkOut = IncrementDate(checkIn, nights);

        // calculate total cost of stay based on bedCost and # of nights
        double total = bedCost * nights;

        // print out details of reservation
        System.out.printf("Here are the details of your reservation:\n" +
                "Room Type: %s\n" +
                "Nights: %s\n" +
                "Cost Per Night: %s\n" +
                "Check-in: %s\n" +
                "Checkout: %s\n" +
                "Total Cost: $%.2f\n\n" +
                "Type Y to confirm your reservation or N to cancel:\n",bedType.toLowerCase(),nights,bedCost,checkIn,checkOut,total);

        // user input : confirm reservation details
        String confirmation = s.nextLine();

        // validate "Y" or "N" response to confirmation
        while (!confirmation.equalsIgnoreCase("N") && !confirmation.equalsIgnoreCase("Y"))
        {
            System.out.println("Your entry of " + confirmation + " is not valid. Please enter Y or N:");
            confirmation = s.nextLine();
        }
        if (confirmation.equalsIgnoreCase("N")) {
            System.out.println("Your reservation has been cancelled.");
        } else {
            // once confirmed, create new reservation object using Reservation method
            Reservation newReservation = new Reservation(new Date(),nights,checkIn,checkOut,bedCost,bedType,total);
            System.out.println("Your reservation has been confirmed!");

            // print reservation confirmation including reservation id
            newReservation.show();
        }
    }

    // method: increment dates for check-out calculation
    public static LocalDate IncrementDate(LocalDate initialDate, int daysToIncrement) {
        LocalDate incrementedDate = initialDate.plusDays(daysToIncrement);
        return incrementedDate;
    }

    static class Reservation {
        int id;
        Date made;
        int stayDays;
        double dailyRate;
        LocalDate in;
        LocalDate out;
        String bedType;
        double total;
        static int totalReservations;

        Reservation(Date m, int s, LocalDate i, LocalDate o, double d, String b, double t) {
            id = totalReservations + 10000;
            made = m;
            stayDays = s;
            in = i;
            out = o;
            dailyRate = d;
            bedType = b;
            total = t;
            totalReservations++;
        }

        void show() {
            System.out.printf(
                    "   - Your confirmation number is %s.\n" +
                            "   - We've reserved a %s room for %d days starting on %s and ending on %s\n" +
                            "   - Based on your daily rate of %s, the total cost of your stay will be $%.2f \n",
                    id, bedType, stayDays, in, out, dailyRate,total);

        }

        static void showReservations() {
            System.out.println(totalReservations);
        }

    }
}
