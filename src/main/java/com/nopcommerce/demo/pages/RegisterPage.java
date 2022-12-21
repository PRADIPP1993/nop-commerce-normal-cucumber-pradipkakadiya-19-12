package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register Account']")
    WebElement registerAccountText;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstname;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastname;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement agreeCheckBox;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueButton;

    public String verifyRegisterAccount() {
        log.info("Verify Register Account Text " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }

    public void enterFirstName(String text) {
        log.info("Enter FirstName " + text + " to firstname field " + firstname.toString());
        sendTextToElement(firstname, text + getAlphaNumericString(5));
    }

    public void enterLastName(String text) {
        log.info("Enter lastname " + text + " to lastname field " + lastname.toString());
        sendTextToElement(lastname, text + getAlphaNumericString(5));
    }

    public void enterEmail(String text) {
        log.info("Enter Email " + text + " to email field " + email.toString());
        sendTextToElement(email, text + getAlphaNumericString(5));
    }

    public void enterTelephone(String text) {
        log.info("Enter telephone " + text + " to telephone field " + telephone.toString());
        sendTextToElement(telephone, text);
    }

    public void enterPassword(String text) {
        log.info("Enter password " + text + " to password field " + password.toString());
        sendTextToElement(password, text);
    }

    public void enterConformPassword(String text) {
        log.info("Enter Conformpassword " + text + " to confirm password field " + confirmPassword.toString());
        sendTextToElement(confirmPassword, text);
    }

    public void clickOnSubcribe() {
        List<WebElement> radioButtons = driver.findElements(By.xpath("//fieldset[3]//input"));
        for (WebElement e : radioButtons) {
            if (e.getText().equals("Yes")) {
                e.click();
                break;
            }
        }

    }

    public void clickOnAgree() {
        log.info("Click on Agree" + agreeCheckBox.toString());
        clickOnElement(agreeCheckBox);
    }

    public void clickOnContinue() {
        log.info("Click on continue" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
