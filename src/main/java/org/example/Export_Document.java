package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Export_Document
{
    public void Export() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Get File from top menu
        driver.findElement(By.xpath("//div[@class='header__leftSideArea pull-left']//button[2]")).click();

        //Click on Download
        driver.findElement(By.xpath("//button[normalize-space()='Download']")).click();

        //Click on PDF

    }
}
