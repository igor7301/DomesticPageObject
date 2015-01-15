package com.hotwire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Admin on 07.11.14.
 */
public class HomePage extends AbstractPage {

    @FindBy(xpath = ".//*[@id='genRandom7-hotelDestinationFields']//input[@name='destCity']")
    private WebElement hotelLocation;

    @FindBy(xpath = ".//input[@id='startDateCalendarHotel-field']")
    private WebElement startDate;

    @FindBy(xpath = ".//input[@id='endDateCalendarHotel-field']")
    private WebElement endDate;

    @FindBy(xpath = ".//*[@id='findHotelButton']")
    private WebElement startHotelSearch;

    @FindBy(xpath = ".//*[@id='tyyyuuiton']")
    private WebElement tmp;

    public HomePage(WebDriver webDriverInstance) {
        super(webDriverInstance, "tile.hotwire.home");
    }

    public String getStartDate() {
        return startDate.getAttribute("value");
    }

    public void setStartDate(String startDate) {
        this.startDate.sendKeys(startDate);
    }

    public String getEndDate() {
        return endDate.getAttribute("value");
    }

    public void setEndDate(String endDate) {
        this.endDate.sendKeys(endDate);
    }

    public String getHotelLocation() {
        return hotelLocation.getAttribute("value");
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation.sendKeys(hotelLocation);
    }

    public void startHotelSearch() {
       startHotelSearch.click();
    }

}
