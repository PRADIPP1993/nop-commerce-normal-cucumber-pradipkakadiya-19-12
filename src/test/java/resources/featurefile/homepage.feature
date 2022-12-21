@regression
Feature: Homepage Test
  As a user I want to navigate to Desktop page successfully
@smoke
  Scenario: User should navigate to desktops page successfully
    Given I am on homepage
    When I mousehover to desktop and click
    And I select menu "Show All Desktops"
    Then Verify "Desktops" text


  @sanity
  Scenario: User should navigate to Laptops and Notebooks page successfully
    Given I am on homepage
    When I mouse hover to laptops and notesbook page and click
    And I select menu "Show All Laptops & Notebooks"
    Then I verify "Laptops & Notebooks" text

  Scenario: User should navigate to Components page successfully
    Given I am on homepage
    When I mouse hover to Components page and click
    And I select menu "Show All Components"
    Then I verify "Components" page