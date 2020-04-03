package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","d:/se/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pl-pl.facebook.com/");
        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]"));
        Select yearSelect = new Select(inputField);
        yearSelect.selectByIndex(2);

    }
}
