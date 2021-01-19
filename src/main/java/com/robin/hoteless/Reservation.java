package com.robin.hoteless;

import java.time.LocalDate;
import java.util.Date;

public class Reservation {
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
