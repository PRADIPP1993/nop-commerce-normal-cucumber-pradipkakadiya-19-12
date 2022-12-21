package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1[contains(text(), 'Shopping Cart')]")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productNameText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group date']/input")
    WebElement deliveryDateText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement modelText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement priceText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement macBookNameText;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement macBookQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement macBookUpdateButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement macBookTotal;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkoutButton;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement updateQty;


    public String shoppingCartTextErrorMessage() {
        log.info("Enter shoppingcart text error message " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String productNameErrorMessage() {
        log.info(" Verify Product name error Message" + productNameText.toString());
        return getTextFromElement(productNameText);
    }


    public String modelErrorMessage() {
        log.info("Verify model error message" + modelText.toString());
        return getTextFromElement(modelText);
    }

    public String priceTotalErrorMessage() {
        log.info("Verify price total error message" + priceText.toString());
        return getTextFromElement(priceText);
    }

    public String macBookNameErrorMessage() {
        log.info("Verify Macbook name error message" + macBookNameText.toString());
        return getTextFromElement(macBookNameText);
    }

    public void updateMacBookQuantity() {
        updateQty.clear();
        sendTextToElement(macBookQuantity, "2");
        clickOnElement(macBookUpdateButton);
    }

    public String macBookTotalErrorMessage() {
        log.info("Verify macbook total error message" + macBookTotal.toString());
        return getTextFromElement(macBookTotal);
    }

    public void clickOnCheckButton() {
        log.info("Click on check button" + checkoutButton.toString());
        clickOnElement(checkoutButton);
    }

    public String deliveryDateErrorMessage() {
        return deliveryDateText.getAttribute("value");

    }

}