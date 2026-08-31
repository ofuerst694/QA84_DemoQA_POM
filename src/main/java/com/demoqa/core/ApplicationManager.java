package com.demoqa.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    String browser;
    protected WebDriver driver;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public WebDriver start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    protected void stop() {
        if (driver != null) {
            driver.quit();
        }
    }
}
