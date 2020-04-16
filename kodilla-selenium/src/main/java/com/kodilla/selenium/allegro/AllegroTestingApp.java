package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement cross = driver.findElement(By.cssSelector("button[data-role='close-and-accept-consent']"));
        cross.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement filtr = driver.findElement(By.xpath("//*[@class=\"_d25db_2P-5I _1h7wt _k70df _7qjq4\"]"));
        Select category = new Select(filtr);
        category.selectByIndex(3);
        WebElement input = driver.findElement(By.xpath("//*[@class=\"_d25db_3K7x6 _14uqc\"]"));
        input.sendKeys("Mavic mini");
        input.submit();
    }
}
