package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    public static void Selecting(WebElement dropbox,String value)
    {
        Select select = new Select(dropbox);
        select.selectByVisibleText(value);


    }

    P01_Register register = new P01_Register();

    @Given("user go to register page")
    public void registerPage()
    {

        register.registerLink.click();


    }



    @And("user select gender type")
    public void setGenderButton()
    {
        register.genderButton().click();

    }


    @And("user enter first name")
            public void FirstName()
    {

        register.FirstName().sendKeys("automation");

    }

    @And("user enter last name")

    public void LastName()
    {
        register.LastName().sendKeys("tester");

    }


    @And("user enter date of birth")

            public void DateOfBirth()
    {

        Selecting(register.DateOfBirthDay(),"17" );
        Selecting(register.DateOfBirthMonth(),"May" );
        Selecting(register.DateOfBirthYear(), "1987");

    }



    @And("user enter email \"test@example.com\" field")

    public void Email()
    {
        register.Email().sendKeys("test@example.com");

    }

    @And("user fills Password")

    public void Password()
    {

        register.Password().sendKeys("P@ssw0rd");

    }

    @And("user fills confirm password")
    public void ConfirmPassword()
    {
        register.ConfirmPassword().sendKeys("P@ssw0rd");

    }

    @And("user clicks on register button")
    public void RegisterButton()
    {
        register.RegisterButton().click();

    }

    @Then("success message is displayed")

    public void ConfirmMsgTemplate()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.ConfirmationMsg().isDisplayed());
        soft.assertEquals(register.ConfirmationMsg().getText(),"Your registration completed");
        String Green = register.ConfirmationMsg().getCssValue("color");
        System.out.println(Green);
        soft.assertEquals(Green,"rgba(76, 177, 124, 1)");

        soft.assertAll();






    }



}
