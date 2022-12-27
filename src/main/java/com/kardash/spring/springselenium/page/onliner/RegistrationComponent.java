package com.kardash.spring.springselenium.page.onliner;

import com.kardash.spring.springselenium.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationComponent extends Base {

    @Autowired
    private WebDriver webDriver;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement registrationButton;

    @FindBy(xpath = "//span[contains(@class,'i-checkbox__faux')]")
    private WebElement registrationCheckbox;

    public void clickButton(){
        registrationButton.click();
    }
    public void clickCheckBox() throws InterruptedException {
        registrationCheckbox.click();
    }

    public void registration(){
        this.registrationCheckbox.click();
        this.registrationButton.click();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.registrationButton.isDisplayed());
    }
}
