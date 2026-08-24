package com.demoqa.pages;

import com.demoqa.core.BasePage;
import com.demoqa.pages.alertsFrameWindows.AlertsPage;
import com.demoqa.pages.alertsFrameWindows.FramesPage;
import com.demoqa.pages.alertsFrameWindows.NestedFramesPage;
import com.demoqa.pages.alertsFrameWindows.WindowsPage;
import com.demoqa.pages.bookStore.LoginPage;
import com.demoqa.pages.widgets.SelectPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/login']")
    WebElement loginLink;
    public LoginPage getLogin() {
        clickWithJS(loginLink,0,500);
        return new LoginPage(driver);
    }


    @FindBy(css = "a[href='/alerts']")
    WebElement alertItem;
    public AlertsPage getAlerts() {
        clickWithJS(alertItem,0,200);
        return new AlertsPage(driver);
    }

    @FindBy(css = "a[href='/browser-windows']")
    WebElement browserWindows;
    public WindowsPage getBrowserWindows() {
        clickWithJS(browserWindows,0,150);
        return new WindowsPage(driver);
    }

    @FindBy(css = "a[href='/frames']")
    WebElement frames;

    public FramesPage getFrames() {
        click(frames);
        return new FramesPage(driver);
    }

    @FindBy(css = "a[href='/nestedframes']")
    WebElement nestedFrames;

    public NestedFramesPage getNestedFrames() {
        clickWithJS(nestedFrames,0,400);
        return new NestedFramesPage(driver);
    }

    @FindBy( css = "a[href='/select-menu']")
    WebElement selectMenu;
    public SelectPage getSelectMenu() {
        clickWithJS(selectMenu,0,600);
        return new SelectPage(driver);
    }
}