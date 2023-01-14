package org.example.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P01_Register extends pageBase {



   @FindBy(className = "ico-register")
    public WebElement registerLink;

   @FindBy(css = "#gender-male")
   WebElement maleButton;

   @FindBy(css = "#gender-female")
   WebElement femaleButton;

   @FindBy(css = "#FirstName")
   WebElement firstName;

    @FindBy(css = "#LastName")
    WebElement lastName;

    @FindBy(name = "DateOfBirthDay")
    WebElement birthDay;

    @FindBy(name = "DateOfBirthMonth")
    WebElement birthMonth;

    @FindBy(name = "DateOfBirthYear")
    WebElement birthYear;

    @FindBy(css = "#Email")
    WebElement email;

    @FindBy(css = "#Password")
    WebElement password;
    @FindBy(css = "#ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(css = "#register-button")
    WebElement registerButton;

    @FindBy(className = "result")
    WebElement message;

    public WebElement getMaleGenderRadioButton()
   {


       return maleButton;


   }
    public WebElement getFemaleGenderRadioButton()
    {


        return femaleButton;


    }

   public WebElement getFirstName()
   {

       return firstName;
   }

   public WebElement getLastName()
   {

       return lastName;

   }
   public WebElement getDateOfBirthDay()
   {
       return birthDay;


   }
    public WebElement getDateOfBirthMonth()
    {
        return birthMonth;


    }
    public WebElement getDateOfBirthYear()
    {
        return birthYear;


    }


   public WebElement getEmail()
   {

       return email;

   }

   public WebElement getPassword()
   {

       return password;

   }

   public WebElement getConfirmPassword()
   {

       return confirmPassword;
   }

   public WebElement getRegisterButton()
   {
       return registerButton;

   }

   public WebElement getConfirmationMsg()
   {

       return message;

   }





}
