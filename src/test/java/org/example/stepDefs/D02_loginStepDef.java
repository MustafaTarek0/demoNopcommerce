package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.example.Pages.P02_Login;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_Login Login = new P02_Login();

    @Given("user go to login page")
    public void loginPage()

    {
        System.out.println("aaaaaaaaaa");
        Login.LoginLink.click();
    }


    @When("user Enter a valid email{string}")
    public void userEnterAValidEmail(String email)

    {
        Login.email().sendKeys(email);
    }



    @And("user Enter a valid Password{string}")
    public void userEnterAValidPassword(String Password)
    {
        Login.Password().sendKeys(Password);
    }


    @And("user press on login button")
    public void LoginButtonuser()
    {
        Login.ButtonOfLogin().click();
    }


    @Then("user login to the system successfully")

    public void AccountSuccessfullyLogin()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Login.UserAccount().isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

        soft.assertAll();
    }

    @When("user entered an invalid Email{string}")
    public void userEnteredAnInvalidEmail(String Email)
    {
        Login.email().sendKeys(Email);

    }

    @And("user entered an  invalid  password{string}")
    public void userEnteredAnInvalidPassword(String password)
    {
        Login.Password().sendKeys(password);
    }




    @Then("user could not login to the system")

    public void AccountUnSuccessfullyLogin()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Login.UnsuccessfullyMsg().isDisplayed());
        soft.assertEquals(Login.UnsuccessfullyMsg().getText(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
        System.out.println("Login was unsuccessful");
        String red = Login.UnsuccessfullyMsg().getCssValue("color");
        System.out.println(red);
        soft.assertEquals(red,"rgba(228, 67, 75, 1)");

        soft.assertAll();

    }



}
