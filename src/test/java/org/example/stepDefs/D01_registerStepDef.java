package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P01_Register;
import org.example.Pages.pageBase;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class D01_registerStepDef extends pageBase {



    P01_Register register = new P01_Register();
    Random ran = new Random();
    int randomNumber = ran.nextInt(100);

    @Given("user go to register page")
    public void registerPage()
    {

        register.registerLink.click();


    }



    @And("user select gender type{string}")
    public void setGenderButton(String gender)
    {
        if (gender.equals("male")){
            register.getMaleGenderRadioButton().click();
        }
        else if (gender.equals("female")){
            register.getFemaleGenderRadioButton().click();
        }

    }



    @And("user enter first name{string}")
            public void FirstName(String firstName)
    {

        register.getFirstName().sendKeys(firstName+randomNumber);

    }

    @And("user enter last name{string}")

    public void LastName(String lastName)
    {
        register.getLastName().sendKeys(lastName+randomNumber);

    }


    @And("user enter date of birth")

            public void DateOfBirth()
    {

        Selecting(register.getDateOfBirthDay(),"12" );
        Selecting(register.getDateOfBirthMonth(),"9" );
        Selecting(register.getDateOfBirthYear(), "1997");

    }



    @And("user enter his email {string}")
    public void Email(String email)
    {
        register.getEmail().sendKeys(randomNumber+email);

    }

    @And("user enter his Password {string}")
    public void Password(String Password)
    {
        register.getPassword().sendKeys(Password);

    }

    @And("user confirms his password {string}")
    public void ConfirmPassword(String Password)
    {
        register.getConfirmPassword().sendKeys(Password);

    }

    @And("user clicks on register button")
    public void RegisterButton()
    {
        register.getRegisterButton().click();

    }

    @Then("success message is displayed {string}")

    public void ConfirmMsgTemplate(String msg)
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.getConfirmationMsg().isDisplayed());
        soft.assertEquals(register.getConfirmationMsg().getText(),msg);
        soft.assertAll();
    }


    @And("color of success message should be green")
    public void colorOfSuccessMessageShouldBeGreen() {
        SoftAssert soft = new SoftAssert();
        String color = register.getConfirmationMsg().getCssValue("color");
        soft.assertEquals(color,"rgba(76, 177, 124, 1)");
        soft.assertAll();

    }
}
