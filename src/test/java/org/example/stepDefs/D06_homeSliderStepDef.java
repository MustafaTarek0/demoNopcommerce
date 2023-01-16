package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.testng.Assert;
import org.example.Pages.pageBase;


public class D06_homeSliderStepDef extends pageBase {

    P03_homepage home = new P03_homepage();
    @When("user click on Nokia Lumia Slider")
    public void NokiaLumia1020()
    {

        home.getfirstSlide().click();



    }

    @Then("user navigate to Nokia page")
    public void navigateToNokiaPageUrl()
    {

        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");


    }


    @When("user click on I-Phone Slider")
    public void iPhoneSlider()
    {

        home.getSecondSlide().click();


    }
    @Then("user navigate to I-Phone page")
    public void navigateToIphoneUrl()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");


    }

}
