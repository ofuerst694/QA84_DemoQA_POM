package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.widgets.SelectPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WidgetsTests extends TestBase {
    SidePanel sidePanel;
    SelectPage select;

    @BeforeEach
    public void preconditions(){
        sidePanel = new SidePanel(driver);
        select = new SelectPage(driver);
        new HomePage(driver).getWidgets();
    }
    @Test
    public void oldStyleSelectMenuTest(){
        sidePanel.getSelectMenu();
        select.oldStyleSelect("Green")
                .verifyColor();
    }
}
