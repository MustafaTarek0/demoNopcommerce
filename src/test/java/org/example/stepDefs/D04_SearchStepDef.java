package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.util.List;
import org.example.Pages.pageBase;

public class D04_SearchStepDef extends pageBase {

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


        @Then("product{string} should be visible")
        public void productShouldBeVisible(String Product)
                {

                        List<WebElement> temp = home.SearchProductElements();
                        System.out.println("products size :" + temp.size());
                        SoftAssert soft = new SoftAssert();
                        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
                        for (WebElement products : temp)
                        {
                                System.out.println("product:" + products.getText());
                                String ProductShown = products.getText().toLowerCase();
                                soft.assertEquals(ProductShown.contains(Product), true);
                        }

                }

                        @And("user click on product")
                        public void UserClickOnProduct()
                        {
                                home.ClickOnProduct().click();
                        }

                      @Then("sku{string} should be visible")
                      public void skuShouldBeShown(String Sku)
                      {

                              Assert.assertEquals(home.productSku().getText().contains(Sku),true);

                      }
}

