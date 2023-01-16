package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.WebElement;
import org.example.Pages.pageBase;
import org.testng.Assert;
import java.util.List;

public class D03_currenciesStepDef extends pageBase {

   P03_homepage Currencies = new P03_homepage();
   @When("user Click on currencies dropdown list")
   public void userClickToDropListCurrencyChanger()
   {
      Currencies.getCurrency().click();

   }

   @And("Click on Euro currency")
   public void euro()
   {
      Currencies.getEuro().click();

   }




   @And("Currencies should be changed to Euro")
   public void ShowProductElements()
   {
      List<WebElement> currency = Currencies.getProductElements();
      for (WebElement element : currency)
      {
         System.out.println("price:" + element.getText());
         String Price = element.getText();
         Assert.assertTrue(Price.contains("€"));
      }


   }



}
