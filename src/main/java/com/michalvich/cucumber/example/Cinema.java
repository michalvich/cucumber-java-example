package com.michalvich.cucumber.example;

public class Cinema {

    private Integer numberOfSeats;

    private Integer reservedSeats;

    public Cinema() {
        this.numberOfSeats = 0;
        this.reservedSeats = 0;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(Integer reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public Integer getFreeSeats() {
        return numberOfSeats-reservedSeats;
    }

}
