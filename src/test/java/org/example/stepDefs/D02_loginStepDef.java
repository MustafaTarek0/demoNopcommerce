package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.example.Pages.pageBase;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef extends pageBase{

    P02_Login Login = new P02_Login();

    @Given("user go to login page")
    public void loginPage() throws InterruptedException {
        Thread.sleep(2000);
        Login.getloginLink().click();
    }


    @When("user Enter a valid email{string}")
    public void userEnterAValidEmail(String email)

    {
        Login.getEmail().sendKeys(email);
    }



    @And("user Enter a valid Password{string}")
    public void userEnterAValidPassword(String Password)
    {
        Login.getPassword().sendKeys(Password);
    }


    @And("user press on login button")
    public void LoginButtonuser()
    {
        Login.getLoginButton().click();
    }


    @Then("user login to the system successfully")

    public void AccountSuccessfullyLogin()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Login.getMyAccount().isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

        soft.assertAll();
    }

    @When("user entered an invalid Email{string}")
    public void userEnteredAnInvalidEmail(String Email)
    {
        Login.getEmail().sendKeys(Email);

    }

    @And("user entered an  invalid  password{string}")
    public void userEnteredAnInvalidPassword(String password)
    {
        Login.getPassword().sendKeys(password);
    }




    @Then("user could not login to the system")

    public void AccountUnSuccessfullyLogin()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Login.getUnsuccessfulMsg().isDisplayed());
        soft.assertEquals(Login.getUnsuccessfulMsg().getText(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
        System.out.println("Login was unsuccessful");


    }


    @And("Message should be red")
    public void messageShouldBeRed() {
        SoftAssert soft = new SoftAssert();
        String redMsg = Login.getUnsuccessfulMsg().getCssValue("color");
        soft.assertEquals(redMsg,"rgba(228, 67, 75, 1)");
        soft.assertAll();
    }
}
