package org.example.Pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class P02_Login {


    public WebElement loginLink () {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.cssSelector("#Email"));

    }

    public WebElement Password()
    {
        return Hooks.driver.findElement(By.cssSelector("#Password"));
    }
    public WebElement loginButton()
    {
        return Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button"));
    }

    public WebElement myAccount()
    {
      return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
    }

    public WebElement UnsuccessfulMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
    }
}
