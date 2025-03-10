package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Document {

    public void CreateBiography(){

      WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
//Get template on dashboard
        driver.findElement(By.cssSelector("body > app-root:nth-child(3) > div:nth-child(1) > app-dashboard:nth-child(2) > div:nth-child(1) >" +
                " div:nth-child(1) > app-navigation:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > a:nth-child(2)")).click();
//Select General Fiction
        driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/app-dashboard[1]/div[1]/div[2]/dashboard-templates[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]" +
        "/div[1]/app-template-project-boxes[1]/div[1]")).click();

//get text editor
        driver.findElement(By.xpath("//div[@data-placeholder='Here you will see text generated by" +
                " Smart Writer']")).sendKeys("An AI-powered story writer, like Squibler, functions" +
                " as a sophisticated writing tool that assists writers in creating their stories. It offers " +
                "suggestions, creates story elements, helps overcome writer's block by providing prompts and" +
                " new ideas, and even creates visuals for your story. Squibler is not just an AI story generato" +
                "r but a comprehensive companion for the entire writing journey. ");
    }
}
