package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    List<WebElement> topMenu;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopNotebooksLink;
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsLink;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyLink;
    @CacheLookup
    @FindBy(xpath = "/span[text()='My Account']")
    WebElement myAccountLink;

    public void clickOnCurrency(){
        log.info("Clicking on currency dropdown");
        clickOnElement(currencyLink);
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e:currencyList ) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }
    public void selectMenu(String menu) {
       // List<WebElement> topMenuList = driver.findElements(topMenu);
        try {
            for (WebElement element : topMenu) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            //topMenuList = driver.findElements(topMenu);
        }
    }

    public void mouseHoverToDesktopAndClick(){
        log.info("Mouse Hovering to Desktop and Clicking on it: " + desktopLink.toString() );
        mouseHoverToElementAndClick(desktopLink);
    }

    public void mouseHoverToLaptopsNotebooksAndClick(){
        log.info("Mouse Hovering to LaptopsNotebooks and Clicking on it: " + laptopNotebooksLink.toString() );
        mouseHoverToElementAndClick(laptopNotebooksLink);
    }

    public void mouseHoverToComponentsAndClick(){
        log.info("Mouse Hovering to Components and Clicking on it: " + componentsLink.toString() );
        mouseHoverToElementAndClick(componentsLink);
    }

    public void clickOnMyAccount(){
        log.info("Clicking on my account: " + myAccountLink.toString() );
        clickOnElement(myAccountLink);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }
}