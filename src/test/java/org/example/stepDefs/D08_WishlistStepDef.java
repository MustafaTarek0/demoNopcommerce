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
    }

    @When("user click on xbutton")
    public void buttonWishList()
    {
        home.xbutton().click();
    }


    @And("user click on wishlist button")
    public void WishlistElement ()
    {
        home.WishListElement().click();
    }

    @Then("user can check Qty of his product")
    public void QtyValueList ()
    {
        String temp = home.QtyValue().getAttribute("value");

          int i = Integer.parseInt(temp);
          System.out.println(temp);
          Assert.assertTrue(i > 0);



    }


    @And("message color should be green")
    public void messageColorShouldBeGreen() {
        SoftAssert soft = new SoftAssert();
        String Green = home.SuccessMsgGreen().getCssValue("background-color");
        soft.assertEquals(Green,"rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
}
