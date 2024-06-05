package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Squibler_Register {

    public void Signup() {
        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Get Link
        driver.get("https://www.squibler.io/");

        // Sign Up button
        driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();

        //Invalid Email
        driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("bila@gmail");

        driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).clear();

        //Valid  email and clicking on Sigin button
        driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("maryamshams@gmail.com");
        driver.findElement(By.className("singup-btn")).click();

        //Name
        driver.findElement(By.id("username")).sendKeys("Bilal");

        //Password
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Squibler@123");

        //Confirm Password
        driver.findElement(By.xpath("//input[@placeholder='Repeat your password']")).sendKeys("Squibler@123");

        //signup button
        driver.findElement(By.className("singup-btn")).click();

    }
    }
