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

    public WebElement maleGenderRadioButton()
   {


       return maleButton;


   }
    public WebElement femaleGenderRadioButton()
    {


        return femaleButton;


    }

   public WebElement FirstName()
   {

       return firstName;
   }

   public WebElement LastName()
   {

       return lastName;

   }
   public WebElement DateOfBirthDay()
   {
       return birthDay;


   }
    public WebElement DateOfBirthMonth()
    {
        return birthMonth;


    }
    public WebElement DateOfBirthYear()
    {
        return birthYear;


    }


   public WebElement Email()
   {

       return email;

   }

   public WebElement Password()
   {

       return password;

   }

   public WebElement ConfirmPassword()
   {

       return confirmPassword;
   }

   public WebElement RegisterButton()
   {
       return registerButton;

   }

   public WebElement ConfirmationMsg()
   {

       return message;

   }





}
