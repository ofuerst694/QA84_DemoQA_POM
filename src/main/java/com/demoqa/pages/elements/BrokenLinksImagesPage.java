package com.demoqa.pages.elements;

import com.demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

public class BrokenLinksImagesPage extends BasePage {
    public BrokenLinksImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a")
    List<WebElement> allLinks;
    public BrokenLinksImagesPage getAllLinks() {
        //size
        System.out.println("Total links on the page = " + allLinks.size());
        //list
        String url = "";
        Iterator<WebElement> iterator = allLinks.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
        }
        return this;
    }

    public BrokenLinksImagesPage checkBrokenLinks() {
        for (int i = 0; i < allLinks.size(); i++) {
            WebElement element =allLinks.get(i);
            String url = element.getAttribute("href");
            verifyLinks(url);
        }
        return this;
    }
}
