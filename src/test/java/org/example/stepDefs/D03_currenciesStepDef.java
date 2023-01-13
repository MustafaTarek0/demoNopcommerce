package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.Pages.pageBase;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;

public class D03_currenciesStepDef extends pageBase {

   P03_homepage Currencies = new P03_homepage();
   @When("user Click on currencies dropdown list")
   public void userClickToDropListCurrencyChanger()
   {
      Currencies.Currency().click();

   }

   @And("Click on Euro currency")
   public void euro()
   {
      Currencies.Euro().click();

   }




   @And("Currencies should be changed to Euro")
   public void ShowProductElements()
   {
      List<WebElement> currency = Currencies.ProductElement();
      for (WebElement element : currency)
      {
         System.out.println("price:" + element.getText());
         String Price = element.getText();
         Assert.assertTrue(Price.contains("€"));
      }


   }



}
