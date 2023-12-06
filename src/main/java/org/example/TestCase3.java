package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com/");
        WebElement SauceDemoUserName = driver.findElement(By.xpath("//input[@id='user-name']"));
        SauceDemoUserName.sendKeys("Java.");
        WebElement SauceDemoPassword = driver.findElement(By.xpath("//input[@id='password']"));
        SauceDemoPassword.sendKeys("Selenium.");
        WebElement SauceDemoLoginBTN = driver.findElement(By.xpath("//input[@id='login-button']"));
        SauceDemoLoginBTN.click();
        WebElement errorMSG = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String expectedMSG="Epic sadface: Username and password do not match any user in this service";
        System.out.println(errorMSG.getText().equals(expectedMSG)? "Error message Passed":"Error message Failed");
        driver.quit();

    }
}
