package com.robin.hoteless.model;

import java.time.LocalDate;
import java.util.Date;

public class Reservation {
    private int id;
    private Date creationDate;
    private int lengthOfStay;
    private double dailyRate;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String roomType;
    private double preCheckInCostEstimate;
    private static int totalReservations;

    public Reservation(Date creationDate,
                       int lengthOfStay,
                       LocalDate checkInDate,
                       LocalDate checkOutDate,
                       double dailyRate,
                       String roomType,
                       double preCheckInCostEstimate) {
        this.id = totalReservations + 10000;
        this.creationDate = creationDate;
        this.lengthOfStay = lengthOfStay;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.dailyRate = dailyRate;
        this.roomType = roomType;
        this.preCheckInCostEstimate = preCheckInCostEstimate;
        this.totalReservations++;
    }

//    public void show() {
//        System.out.printf(
//                "   - Your confirmation number is %s.\n" +
//                        "   - We've reserved a %s room for %d days starting on %s and ending on %s\n" +
//                        "   - Based on your daily rate of %s, the total cost of your stay will be $%.2f \n",
//                id, roomType, lengthOfStay, checkInDate, checkOutDate, dailyRate, preCheckInCostEstimate);
//
//    }

    static void showReservations() {
        System.out.println(totalReservations);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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

    public double getPreCheckInCostEstimate() {
        return preCheckInCostEstimate;
    }

    public void setPreCheckInCostEstimate(double preCheckInCostEstimate) {
        this.preCheckInCostEstimate = preCheckInCostEstimate;
    }

    public static int getTotalReservations() {
        return totalReservations;
    }

    public static void setTotalReservations(int totalReservations) {
        Reservation.totalReservations = totalReservations;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", reservationCreationDate=" + creationDate +
                ", lengthOfStay=" + lengthOfStay +
                ", dailyRate=" + dailyRate +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", roomType='" + roomType + '\'' +
                ", totalCostOfStay=" + preCheckInCostEstimate +
                '}';
    }
}
