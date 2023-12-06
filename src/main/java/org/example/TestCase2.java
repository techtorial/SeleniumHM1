package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/radio-button");

        WebElement radioBTN = driver.findElement(By.xpath("//span[contains(text(),'Radio Button')]"));
        radioBTN.click();
        WebElement yesRadioBTN = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesRadioBTN.click();
        WebElement youHaveSelectedMsg = driver.findElement(By.xpath("//p[@class='mt-3']"));
        WebElement MessageLocation = driver.findElement(By.xpath("//span[@class='text-success']"));
        String expectedYesMsg = "Yes";
        System.out.println(youHaveSelectedMsg.isDisplayed() && MessageLocation.getText().equalsIgnoreCase(expectedYesMsg) ? "radio button yes message passed" : "radio button yes message Failed");
        WebElement impressiveRadioBTN = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveRadioBTN.click();
        String expectedimpressiveMsg = "Impressive";
        System.out.println(youHaveSelectedMsg.isDisplayed() && MessageLocation.getText().equalsIgnoreCase(expectedimpressiveMsg) ? "radio button impressive message passed" : "radio button impressive message Failed");
        driver.quit();

    }
}
