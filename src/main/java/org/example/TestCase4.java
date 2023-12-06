package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com/");

        WebElement SauceDemoUserName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement SauceDemoPassword = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement SauceDemoLoginBTN = driver.findElement(By.xpath("//input[@id='login-button']"));

        SauceDemoUserName.clear();
        SauceDemoUserName.sendKeys("standard_user");
        SauceDemoPassword.clear();
        SauceDemoPassword.sendKeys("secret_sauce");
        SauceDemoLoginBTN.click();
        String expectedCurrentUrl="https://www.saucedemo.com/inventory.html";
        System.out.println(expectedCurrentUrl.equals(driver.getCurrentUrl())?"Current Url Passed":"Current Url Failed");
        driver.quit();

    }
}
