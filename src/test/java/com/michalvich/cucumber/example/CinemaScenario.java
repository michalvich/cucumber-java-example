package com.michalvich.cucumber.example;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import static org.junit.Assert.assertEquals;

public class CinemaScenario {

    private Cinema cinema;

    @Given("^the cinema has (\\d+) seats$")
    public void createCinema(int numberOfSeats) {
        cinema = new Cinema();
        cinema.setNumberOfSeats(numberOfSeats);
    }

    @When("^the visitor buys (\\d*)$")
    public void requestTickets(int numberOfTickets) {
        cinema.setReservedSeats(cinema.getReservedSeats() + numberOfTickets);
    }

    @Then("^the cinema should have (\\d+) reserved seats$")
    public void checkReservedSeats(Integer reservedSeats) {
        assertEquals(cinema.getReservedSeats(), reservedSeats);
    }

    @And("^the cinema should have (\\d+) free seats$")
    public void checkFreeSeats(Integer freeSeats) throws Throwable {
        assertEquals(cinema.getFreeSeats(), freeSeats);
    }

}
