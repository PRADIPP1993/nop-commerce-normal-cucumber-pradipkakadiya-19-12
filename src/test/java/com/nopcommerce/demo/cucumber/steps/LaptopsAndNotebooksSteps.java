package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Map;

public class LaptopsAndNotebooksSteps {
    @When("^I mouse hover to LaptopsAndNotebooks tab and click$")
    public void iMouseHoverToLaptopsAndNotebooksTabAndClick() {
        new HomePage().mouseHoverToLaptopsNotebooksAndClick();
    }

    @Then("^Verify product are arranged in high to low order$")
    public void verifyProductAreArrangedInHighToLowOrder() {
        Map<String, ArrayList> mapArrays = new LaptopsAndNotebooksPage().arrangeProductHighToLowOrder();
        Assert.assertEquals(mapArrays.get("originalProductsPrice"), mapArrays.get("afterSortByPrice"));
    }

    @And("^I and selecting Price \\(High > Low\\) from Sort By dropdown$")
    public void iAndSelectingPriceHighLowFromSortByDropdown() {
        new LaptopsAndNotebooksPage().productSortBy();
    }

    @And("^I click on MacBook Link$")
    public void iClickOnMacBookLink() {
        new LaptopsAndNotebooksPage().clickOnMacBookLink();
    }

    @And("^Verify “MacBook” text$")
    public void verifyMacBookText() {
        Assert.assertEquals("MacBook Product not display", new LaptopsAndNotebooksPage().MACBookErrorMessage(), "MacBook");
    }

    @And("^I click on Shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new LaptopsAndNotebooksPage().clickOnShoppingCartButton();
    }

    @And("^Verify Shopping Cart$")
    public void verifyShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().shoppingCartTextErrorMessage(), "Shopping Cart  (0.00kg)", "Shopping cart is not displayed");
    }

    @And("^I update product quantity$")
    public void iUpdateProductQuantity() {
        new ShoppingCartPage().updateMacBookQuantity();
    }

    @And("^Verify Total price$")
    public void verifyTotalPrice() {
        Assert.assertEquals(new ShoppingCartPage().macBookTotalErrorMessage(), "£737.45", "Total not matched");
    }

    @And("^I click on Checkout Button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckButton();
    }

    @And("^Verify “MacBook” product name$")
    public void verifyMacBookProductName() {
        new ShoppingCartPage().macBookNameErrorMessage();
    }

    @And("^Verify Checkout text$")
    public void verifyCheckoutText() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().verifyCheckoutText(), "Checkout", "Invalid text displayed");
    }

    @And("^I click on Guest Checkout$")
    public void iClickOnGuestCheckout() {
        new LaptopsAndNotebooksPage().clickOnGuestCheckOut();
    }


    @And("^Verify \"([^\"]*)\"$")
    public void verify(String expectedText) {
        Assert.assertEquals("Invalid data", expectedText, new LaptopsAndNotebooksPage().verifyCustomerText());
    }

    @And("^I enter first name$")
    public void iEnterFirstName() {
        new LaptopsAndNotebooksPage().enterFirstName("pradip");
    }

    @And("^I enter last name$")
    public void iEnterLastName() {
        new LaptopsAndNotebooksPage().enterLastName("kakadiya");
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        new LaptopsAndNotebooksPage().enterEmail("pradipklaka@gmail.com");
    }

    @And("^I enter telephone number$")
    public void iEnterTelephoneNumber() {
        new LaptopsAndNotebooksPage().enterTelephone("8524562580");
    }

    @And("^I enter address$")
    public void iEnterAddress() {
        new LaptopsAndNotebooksPage().enterAddress("54 meera resi");
    }

    @And("^I enter city$")
    public void iEnterCity() {
        new LaptopsAndNotebooksPage().enterCity("surat");
    }

    @And("^I enter postcode$")
    public void iEnterPostcode() {
        new LaptopsAndNotebooksPage().enterPostcode("395010");
    }

    @And("^I enter country$")
    public void iEnterCountry() {
        new LaptopsAndNotebooksPage().entercountry("India");
    }

    @And("^I enter state$")
    public void iEnterState() {
        new LaptopsAndNotebooksPage().enterState("guj");
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {

        new LaptopsAndNotebooksPage().checkOutContinueButton();
    }

    @And("^I add comments$")
    public void iAddComments() {
        new LaptopsAndNotebooksPage().addComments();
    }

    @And("^I click on checkbox$")
    public void iClickOnCheckbox() {
        new LaptopsAndNotebooksPage().clickOnCheckBox();
    }

    @And("^I click on checkout continue button$")
    public void iClickOnCheckoutContinueButton() {
        new LaptopsAndNotebooksPage().checkOutContinueButton();
    }

}
