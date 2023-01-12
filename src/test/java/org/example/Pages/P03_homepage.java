package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homepage {


  public WebElement Currency()
  {

      return Hooks.driver.findElement(By.cssSelector("#customerCurrency"));
  }

  public WebElement Euro()
  {
      return Hooks.driver.findElement(By.cssSelector("#customerCurrency > option:nth-child(2)"));
  }
  public WebElement getCurrencyLabel()
  {

      return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span"));
  }

      public List<WebElement> ProductElement()
      {
          return Hooks.driver.findElements(By.cssSelector(".price.actual-price"));


      }

      public WebElement SearchBar()
      {
          return Hooks.driver.findElement(By.id("small-searchterms"));
      }

      public WebElement SearchButton()
      {

          return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button"));
      }
    public WebElement Hovering()
    {
        return Hooks.driver.findElement(By.linkText("Computers"));

    }
    public WebElement SubCategory()
    {

        return Hooks.driver.findElement(By.linkText("Desktops"));
    }
    public WebElement PageTitle()
    {
        return Hooks.driver.findElement(By.cssSelector(".page-title"));
    }

    public WebElement firstSlide ()
    {

        return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));

    }

      public List<WebElement>SearchProductElements()
      {

          return Hooks.driver.findElements(By.cssSelector(".product-item"));
      }

      public WebElement ClickOnProduct()
      {

          return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img"));
      }




      public WebElement SearchProudctsku()
      {

          return Hooks.driver.findElement(By.cssSelector(".sku"));
      }


      public WebElement secondSlide()
      {
          return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
      }

      public WebElement Facebookicon()
      {

          return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
      }

    public WebElement Rssicon()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));

    }

    public WebElement TubeIcon()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

    public WebElement WishlistButton()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public WebElement SuccessMsgGreen()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[5]/div"));
    }
    public WebElement xbutton()
    {
        return Hooks.driver.findElement(By.cssSelector("#bar-notification > div > span"));
    }
    public WebElement WishListElement()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/wishlist\"]"));
    }

    public WebElement QtyValue ()
    {
        return Hooks.driver.findElement(By.cssSelector(".qty-input"));
    }



      public WebElement Twittericon()
      {
          return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
      }


}
