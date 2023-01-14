package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.example.Pages.pageBase;
public class D08_WishlistStepDef extends pageBase {

    P03_homepage home = new P03_homepage();
    @When("user click on Wish button")
    public void wishButton()
    {
        home.getWishlistButton().click();
    }

    @Then("user should successfully added item")
    public void  WishListSuccessMsg() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        Thread.sleep(3000);
        soft.assertTrue(home.getSuccessMsgGreen().isDisplayed());
        soft.assertEquals(home.getSuccessMsgGreen().getText(),"The product has been added to your wishlist");
    }

    @When("user click on xbutton")
    public void buttonWishList() throws InterruptedException {
        Thread.sleep(4000);
        home.getXButton().click();
    }


    @And("user click on wishlist button")
    public void WishlistElement ()
    {
        home.getWishListElement().click();
    }

    @Then("user can check Qty of his product")
    public void QtyList ()
    {
        String qty = home.getQtyValue().getAttribute("value");

          int Q = Integer.parseInt(qty);
          System.out.println(qty);
          Assert.assertTrue(Q > 0);



    }


    @And("message color should be green")
    public void messageColorShouldBeGreen() {
        SoftAssert soft = new SoftAssert();
        String Green = home.getSuccessMsgGreen().getCssValue("background-color");
        soft.assertEquals(Green,"rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
}
