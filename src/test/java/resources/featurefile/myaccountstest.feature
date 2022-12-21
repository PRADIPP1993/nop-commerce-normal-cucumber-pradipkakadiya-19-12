@regression
Feature: MyAccounts Test
  As a user I want to test my accounts test
 @smoke
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on "My Account" tab
    And I select "Register" menu
    Then Verify "Register Account" text is displayed
  @sanity
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on "My Account" tab
    And I select "Login" menu
    Then Verify "Returning Customer" text is displayed on login page

  Scenario: User register to account successfully
    Given I am on homepage
    When I click on "My Account" tab
    And I select "Register" menu
    And I enter firstname
    And I enter lasttname
    And I enter emaidId
    And I enter telephone
    And I enter password
    And I enter confirm password
    And I click on Subscribe radio button
    And I click on privacy policy check box
    And I click on register continue button
    And Verify the message “Your Account Has Been Created!”
    And I click on Continue button
    And I click on my account link
    And I select "Logout" menu
    And I verify "Account Logout" is displayed
    And I click on Continue button on logout page