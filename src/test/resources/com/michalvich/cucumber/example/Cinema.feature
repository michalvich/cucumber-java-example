Feature: Visitor buys tickets
  As an Visitor
  I want to buy tickets to a cinema
  So that I can go and watch a movie

  Scenario Outline: the cinema has sufficient seats
    Given the cinema has <number_of_seats> seats
    When the visitor buys <number_of_tickets>
    Then the cinema should have <reserved_seats> reserved seats
    And the cinema should have <free_seats> free seats

  Examples:
    |number_of_seats|number_of_tickets|reserved_seats|free_seats|
    |100            |10               |10            |90        |
    |100            |100              |100           |0         |
    |50             |2                |2             |48        |