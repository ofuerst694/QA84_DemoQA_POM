package com.demoqa.pages.widgets;

import com.demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;

public class ToolTipsPage extends BasePage {
    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }




//    @FindBy(css = "[aria-describedby='buttonToolTip']")
//    WebElement buttonToolTip;
//
//    public ToolTipsPage verifyToolTips(String value) {
//        waitIsElementVisibility(buttonToolTip,10);
//        Assertions.assertEquals(value, getValue(toolTipButton, "aria-describedby"));
//        return this;
//    }


}
