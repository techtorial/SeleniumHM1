package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/text-box");
        WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
        userName.sendKeys("David Hunt");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("hunt@gmail.com");
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAddress.sendKeys("123 test street");
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("789 test Avenue");
        WebElement submitBTN = driver.findElement(By.id("//button[@id='submit']"));
        submitBTN.submit();
        WebElement displayedName = driver.findElement(By.xpath("//p[@id='name']"));
        String actualname = displayedName.getText().substring(displayedName.getText().indexOf(':') + 1);
        String expectedName = "David Hunt";
        System.out.println(actualname.equals(expectedName) ? "Displayed name match" : "Displayed name DOES NOT  match");

        WebElement displayedemail = driver.findElement(By.xpath("//p[@id='email']"));
        String actualemail = displayedemail.getText().substring(displayedemail.getText().indexOf(':') + 1);
        String expectedemail = "hunt@gmail.com";
        System.out.println(actualemail.equals(expectedemail) ? "Displayed email match" : "Displayed email DOES NOT  match");

        WebElement displayedCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        String actualCurrentAddress = displayedCurrentAddress.getText().substring(displayedCurrentAddress.getText().indexOf(':') + 1);
        String expecteddCurrentAddress = "123 test street";
        System.out.println(actualCurrentAddress.equals(expecteddCurrentAddress) ? "Displayed current address match" : "Displayed current address DOES NOT  match");


        WebElement displayedPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        String actualPermanentAddress = displayedPermanentAddress.getText().substring(displayedPermanentAddress.getText().indexOf(':') + 1);
        String expectedPermanentAddress = "789 test Avenue";
        System.out.println(actualPermanentAddress.equals(expectedPermanentAddress) ? "Displayed Permanent address match" : "Displayed Permanent address DOES NOT  match");

        driver.quit();
    }
}
