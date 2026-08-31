package com.demoqa.pages.elements;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class UploadPage extends BasePage {
    Robot robot;

    public UploadPage(WebDriver driver) {
        super(driver);
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    @FindBy(id = "uploadFile")
    WebElement uploadFile;

    public UploadPage performKeyEvent() {
        // clickWithJS(uploadFile,0,300);
        //scrollWithJS(0,-100);
        clickWithRectangle(uploadFile);
        //press SHIFT
        pause(1000);
        robot.keyPress(KeyEvent.VK_SHIFT);
        //press d(upper case as SHIFT key is pressed)
        pause(1000);
        robot.keyPress(KeyEvent.VK_D);
        //release SHIFT
        robot.keyRelease(KeyEvent.VK_SHIFT);
        //press 1, ., t, x, t
        pause(1000);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);
        //press ENTER
        pause(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        return this;
    }
    @FindBy(css = "#uploadedFilePath")
    WebElement uploadedFilePath;
    public UploadPage verifyFilePath(String path) {
        Assertions.assertTrue(isContainsText(path,uploadedFilePath));
                return this;
    }
}
