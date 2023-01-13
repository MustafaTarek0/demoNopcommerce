package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.example.Pages.pageBase;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef extends pageBase {

    P03_homepage home = new P03_homepage();
    @When("user opens facebook link")
    public void FacebookIcon()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        home.Facebook().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @Then("New Tab {string} should be opened")
    public void newTabShouldBeOpened(String link)
    {


        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),(link));
        Hooks.driver.close();

    }


    @When("user opens twitter link")
    public void TwitterPageIcon()
    {
        home.Twittericon().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

    }


    @When("user opens rss link")
    public void RssIconPage()
    {

        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        home.Rss().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

    }


    @When("user opens youtube link")
    public void YoutubeIconPage ()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        home.youtubeIcon().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));


    }

}
