package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Document {
    public void Searc() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Search field
       driver.findElement(By.xpath("//input[@id='mat-input-2']")).click();

       //type something in search field
        driver.findElement(By.xpath("\"//input[@id='mat-input-2']\"")).sendKeys("bio");

       //Select Biography from dropdown
        driver.findElement(By.xpath("//mat-option[@id='mat-option-59']")).click();

        //

    }

}
