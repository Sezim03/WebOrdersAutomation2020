package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * It meant to be extended
 */
public class AbstractBasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);

    // we must create wait method here not inside the test class to prevent a mess

    public AbstractBasePage() {

        //  to find annotations like @ Test, @Beforetest
        PageFactory.initElements(Driver.getDriver(),  this);

    }
}
