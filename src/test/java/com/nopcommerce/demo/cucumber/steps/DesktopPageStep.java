package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.HpProductPage;
import com.nopcommerce.demo.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Map;

public class DesktopPageStep {
    @Given("^I am in Desktops page$")
    public void iAmInDesktopsPage() {
        new HomePage().mouseHoverToDesktopAndClick();
    }

    @Then("^I verify products are arranged in Alphabetical order$")
    public void iVerifyProductsAreArrangedInAlphabeticalOrder() {
        Map<String, ArrayList> mapArrays = new DesktopPage().arrangeProductInDescendingOrder();
       Assert.assertEquals(mapArrays.get("originalProductsName"), mapArrays.get("afterSortByZToAProductsName"));
    }

    @When("^I select currency from drop down$")
    public void iSelectCurrencyFromDropDown() {
        new HomePage().clickOnCurrency();
    }

    @And("^I select position Name: A to Z from Sort By dropdown$")
    public void iSelectPositionNameAToZFromSortByDropdown() {
        new DesktopPage().sortByName();
    }
    @And("^I click on Hp Product page$")
    public void iClickOnHpProductPage() {
        new DesktopPage().clickOnHpProduct();
    }

    @And("^Verify the product text$")
    public void verifyTheProductText() {
        Assert.assertEquals(new HpProductPage().HpTextErrorMessage(), "HP LP3065", "HP LP3065 Product not display");
    }

    @And("^I select year \"([^\"]*)\" month \"([^\"]*)\" and date \"([^\"]*)\"$")
    public void iSelectYearMonthAndDate(String year, String month, String date) {
        new HpProductPage().selectDate(year,month,date);
    }

    @And("^I change product quantity$")
    public void iChangeProductQuantity() {
        new HpProductPage().changeProductQuantity();
    }

    @And("^I click on Add to Cart Button$")
    public void iClickOnAddToCartButton() {
        new HpProductPage().clickOnAddToCartButton();
    }

    @And("^Verify product is added to Shopping cart$")
    public void verifyProductIsAddedToShoppingCart() {
        Assert.assertEquals(new HpProductPage().addToCartErrorMessage(), "HP LP3065");
    }

    @And("^I click on Shopping Cart Button$")
    public void iClickOnShoppingCartButton() {
        new HpProductPage().clickOnShoppingCartButton();
    }

    @And("^Verify Shopping Cart text$")
    public void verifyShoppingCartText() {
        Assert.assertEquals(new ShoppingCartPage().shoppingCartTextErrorMessage(),"Shopping Cart  (1.00kg)", "Shopping cart is not displayed" );
    }

    @And("^Verify product name$")
    public void verifyProductName() {
        Assert.assertEquals(new ShoppingCartPage().productNameErrorMessage(), "HP LP3065", "Product name not matched");
    }
    @And("^Verify Model number$")
    public void verifyModelNumber() {
        Assert.assertEquals(new ShoppingCartPage().modelErrorMessage(),"Product 21","Model not matched" );
    }

    @And("^Verify Total$")
    public void verifyTotal() {
        Assert.assertEquals(new ShoppingCartPage().priceTotalErrorMessage(),"£74.73", "Total not matched" );
    }

    @And("^verify the delivery date \"([^\"]*)\"$")
    public void verifyTheDeliveryDate(String expectedDate) {
        Assert.assertEquals("Invalid text", expectedDate, new ShoppingCartPage().deliveryDateErrorMessage());
    }


}
