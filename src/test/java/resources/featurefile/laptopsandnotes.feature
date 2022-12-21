@regression
Feature: Laptops And Notebooks Test
  As a user I should navigate to Laptops And Notebooks page successfully

  @smoke
  Scenario: I will verify products are displayed in high to low order
    Given I am on homepage
    When I mouse hover to LaptopsAndNotebooks tab and click
    And I select menu "Show All Laptops & Notebooks"
    Then Verify product are arranged in high to low order

  @sanity
  Scenario: I will verify that user has placed order successfully
    Given I am on homepage
    When I select currency from drop down
    And I mouse hover to LaptopsAndNotebooks tab and click
    And I select menu "Show All Laptops & Notebooks"
    And I and selecting Price (High > Low) from Sort By dropdown
    And I click on MacBook Link
    And Verify “MacBook” text
    And I click on Add to Cart Button
    And I click on Shopping cart link
    And Verify Shopping Cart
    And Verify “MacBook” product name
    And I update product quantity
    And Verify Total price
    And I click on Checkout Button
    And Verify Checkout text
    And I click on Guest Checkout
    And I enter first name
    And I enter last name
    And I enter email
    And I enter telephone number
    And I enter address
    And I enter city
    And I enter postcode
    And I enter country
    And I enter state
    And I click on continue button
    And I add comments
    And I click on checkbox
    And I click on checkout continue button