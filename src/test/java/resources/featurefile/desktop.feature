@regression
Feature: Desktop Test
  As a user I should navigate to Desktop page successfully

  @smoke
  Scenario: I will verify products are arranged in Alphabetical order
    Given I am in Desktops page
    When I mousehover to desktop and click
    And I select menu "Show All Desktops"
    Then I verify products are arranged in Alphabetical order

  @sanity
  Scenario: I will verify products are added to shopping cart successfully
    Given I am on homepage
    When I select currency from drop down
    And I mousehover to desktop and click
    And I select menu "Show All DeskTops"
    And I select position Name: A to Z from Sort By dropdown
    And I click on Hp Product page
    And Verify the product text
    And I select year "2022" month "November" and date "30"
    And I change product quantity
    And I click on Add to Cart Button
    And Verify product is added to Shopping cart
    And I click on Shopping Cart Button
    And Verify Shopping Cart text
    And Verify product name
    And verify the delivery date "2022-11-30"
    And Verify Model number
    And Verify Total