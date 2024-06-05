package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Document
{
    public void Delete() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Get File from top menu
        driver.findElement(By.xpath("//div[@class='header__leftSideArea pull-left']//button[2]")).click();

        //Click on move to trash button from dropdown
        driver.findElement(By.xpath("//button[normalize-space()='Move to Trash']")).click();

       //Due to limited time didn't handled the yes and no popup
    }
}
