package com.hotwire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




/**
 * Created by Admin on 07.11.14.
 */
public abstract class AbstractPage {
    public static final int PAGE_WAIT = 2;



    public AbstractPage(WebDriver webDriverInstance) {
        PageFactory.initElements(
                new CustomElementLocatorFactory(webDriverInstance, PAGE_WAIT),
                this);
    }

    public AbstractPage(WebDriver webDriverInstance, By element) {
        new WebDriverWait(webDriverInstance, PAGE_WAIT)
                .until(ExpectedConditions.visibilityOfElementLocated(element));
        PageFactory.initElements(
                new CustomElementLocatorFactory(webDriverInstance, PAGE_WAIT),
                this);
    }

    public AbstractPage(WebDriver webDriverInstance, Integer timeout) {
        PageFactory.initElements(
                new CustomElementLocatorFactory(webDriverInstance, timeout),
                this);

    }

    public AbstractPage(WebDriver webDriverInstance, String tile) {

        //need to implement waiting for the page
        assert (webDriverInstance.getPageSource().contains(tile));
        PageFactory.initElements(
                new CustomElementLocatorFactory(webDriverInstance, PAGE_WAIT),
                this);


    }

}
