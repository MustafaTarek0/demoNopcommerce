package org.example.Pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class P02_Login extends pageBase {


    @FindBy(className = "ico-login")
    WebElement loginIcon;

    @FindBy(css = "#Email")
    WebElement email;

    @FindBy(css = "#Password")
    WebElement password;

    @FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")
    WebElement loginBtn;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement myAcc;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement unSuccessfulMsg;

    public WebElement getloginLink () {
        return loginIcon;
    }

    public WebElement getEmail()
    {
        return email;

    }

    public WebElement getPassword()
    {
        return password;
    }
    public WebElement getLoginButton()
    {
        return loginBtn;
    }

    public WebElement getMyAccount()
    {
      return myAcc;
    }

    public WebElement getUnsuccessfulMsg()
    {
        return unSuccessfulMsg;
    }
}
