package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {

    P03_homepage home = new P03_homepage();
    @When("user click on Wish button")
    public void wishButton()
    {
        home.WishlistButton().click();
    }

    @Then("user should successfully added item")
    public void  WishListSuccessMsg()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(home.SuccessMsgGreen().isDisplayed());
        soft.assertEquals(home.SuccessMsgGreen().getText(),"The product has been added to your wishlist");
        System.out.println("The product has been added to your wishlist");
        String Green = home.SuccessMsgGreen().getCssValue("background-color");
        System.out.println(Green);
        soft.assertEquals(Green,"rgba(75, 176, 122, 1)");
        soft.assertAll();
    }

    @When("user click on xbutton")
    public void xbuttonWishList()
    {
        home.xbutton().click();
    }


    @And("user click on wishlist button")
    public void WishElement ()
    {
        home.WishListElement().click();
    }

    @Then("user can check Qty of his product")
    public void Qtyvaluelist ()
    {
        String temp = home.QtyValue().getAttribute("value");

          int i = Integer.parseInt(temp);
          System.out.println(temp);
          Assert.assertTrue(i > 0);
          Assert.assertFalse(i <= 0);


    }


}
