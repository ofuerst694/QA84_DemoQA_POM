package com.demoqa.pages.widgets;

import com.demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectPage extends BasePage {
    public SelectPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "oldSelectMenu")
    WebElement oldSelectMenu;
    public SelectPage oldStyleSelect(String color) {
        new Select(oldSelectMenu).selectByVisibleText(color);
        return this;
    }
}
