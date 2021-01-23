package com.robin.hoteless.model;

import java.time.LocalDate;
import java.util.Date;

public class Reservation {
    private int id;
    private Date reservationCreationDate;
    private int lengthOfStay;
    private double dailyRate;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String roomType;
    private double totalCostOfStay;
    private static int totalReservations;

    public Reservation(Date reservationCreationDate,
                       int lengthOfStay,
                       LocalDate checkInDate,
                       LocalDate checkOutDate,
                       double dailyRate,
                       String roomType,
                       double totalCostOfStay) {
        this.id = totalReservations + 10000;
        this.reservationCreationDate = reservationCreationDate;
        this.lengthOfStay = lengthOfStay;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.dailyRate = dailyRate;
        this.roomType = roomType;
        this.totalCostOfStay = totalCostOfStay;
        this.totalReservations++;
    }

    public void show() {
        System.out.printf(
                "   - Your confirmation number is %s.\n" +
                        "   - We've reserved a %s room for %d days starting on %s and ending on %s\n" +
                        "   - Based on your daily rate of %s, the total cost of your stay will be $%.2f \n",
                id, roomType, lengthOfStay, checkInDate, checkOutDate, dailyRate, totalCostOfStay);

    }

    static void showReservations() {
        System.out.println(totalReservations);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReservationCreationDate() {
        return reservationCreationDate;
    }

    public void setReservationCreationDate(Date reservationCreationDate) {
        this.reservationCreationDate = reservationCreationDate;
    }

    public int getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(int lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getTotalCostOfStay() {
        return totalCostOfStay;
    }

    public void setTotalCostOfStay(double totalCostOfStay) {
        this.totalCostOfStay = totalCostOfStay;
    }

    public static int getTotalReservations() {
        return totalReservations;
    }

    public static void setTotalReservations(int totalReservations) {
        Reservation.totalReservations = totalReservations;
    }
}
