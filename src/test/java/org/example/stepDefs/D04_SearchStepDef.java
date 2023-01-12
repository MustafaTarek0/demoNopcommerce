package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;

public class D04_SearchStepDef {

        P03_homepage home = new P03_homepage();
        @When("user enter product name on search bar {string}")
        public void userEnterProductNameOnSearchBar(String serial)
        {

                home.SearchBar().sendKeys(serial);

        }


        @And("click on search button")
        public void ClickSearchButton()
        {
                home.SearchButton().click();
        }


        @Then("proudct{string} should be shown")
        public void proudctShouldBeShown(String Product)
                {

                        List<WebElement> temp = home.SearchProductElements();
                        System.out.println("null:" + temp.size());
                        SoftAssert soft = new SoftAssert();
                        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
                        for (WebElement element : temp)
                        {
                                System.out.println("null:" + element.getText());
                                String ProductShown = element.getText().toLowerCase();
                                soft.assertEquals(ProductShown.contains(Product), true);
                        }
                       soft.assertAll();
                }

                        @And("user click on product")
                        public void UserClickonProduct()
                        {
                                home.ClickOnProduct().click();
                        }

                      @Then("sku{string} should be shown")
                      public void skuShouldBeShown(String Sku)
                      {

                              Assert.assertEquals(home.SearchProudctsku().getText().contains(Sku),true);

                      }
}

