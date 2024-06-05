package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Squibler_Login {

  public void Signin() {
        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Get Link
        driver.get("https://www.squibler.io/");

        // Login button
        driver.findElement(By.xpath("(//a[normalize-space()='Log In'])[1]")).click();

        //Invalid Email
        driver.findElement(By.name("firstEmail")).sendKeys("bilal+1@gmai");

        //Valid  email and clicking on Sigin button
        driver.findElement(By.name("firstEmail")).clear();
        driver.findElement(By.name("firstEmail")).sendKeys("maryamshams@gmail.com");
        driver.findElement(By.className("singup-btn")).click();

        //Incorrect Password and clicking on Sigin button
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Squible23");
        driver.findElement(By.xpath("//button[@class='singup-btn']")).click();

        //we can use assertion here as well to verify the visibility of password input field.
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Squibler@123");
        driver.findElement(By.xpath("//button[@class='singup-btn']")).click();



    }
}
