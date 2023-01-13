package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homepage extends pageBase{

@FindBy(css = "#customerCurrency")
WebElement currency;

    @FindBy(css = "#customerCurrency > option:nth-child(2)")
    WebElement Euro;

    @FindBy(id = "small-searchterms")
    WebElement searchBar;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
    WebElement searchBtn;

    @FindBy(linkText = "Computers")
    WebElement HoverComputers;

    @FindBy(linkText = "Desktops")
    WebElement subCategoryDesktops;

    @FindBy(linkText = ".page-title")
    WebElement PageTitle;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    WebElement firstSlide;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[2]")
    WebElement secondSlide;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img")
    WebElement product;

    @FindBy(css = ".sku")
    WebElement sku;

    @FindBy(css ="a[href=\"http://www.facebook.com/nopCommerce\"]" )
    WebElement facebook;

    @FindBy(css ="a[href=\"/news/rss/1\"]" )
    WebElement rss;

    @FindBy(css ="a[href=\"http://www.youtube.com/user/nopCommerce\"]" )
    WebElement youtube;

    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]" )
    WebElement WishlistButton;

    @FindBy(xpath ="/html/body/div[5]/div" )
    WebElement successMsg;

    @FindBy(css = "#bar-notification > div > span")
    WebElement xbutton;

    @FindBy(css = "a[href=\"/wishlist\"]")
    WebElement WishListElement;

    @FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    WebElement twitter;

    @FindBy(css = ".qty-input")
    WebElement qty;
    public WebElement Currency()
  {

      return currency;
  }

  public WebElement Euro()
  {
      return Euro;
  }


      public List<WebElement> ProductElement()
      {
          return Hooks.driver.findElements(By.cssSelector(".price.actual-price"));


      }

      public WebElement SearchBar()
      {
          return searchBar;
      }

      public WebElement SearchButton()
      {

          return searchBtn;
      }
    public WebElement Hovering()
    {
        return HoverComputers;

    }
    public WebElement SubCategory()
    {

        return subCategoryDesktops;
    }
    public WebElement PageTitle()
    {
        return PageTitle;
    }

    public WebElement firstSlide ()
    {

        return firstSlide;

    }

      public List<WebElement>SearchProductElements()
      {

          return Hooks.driver.findElements(By.cssSelector(".product-item"));
      }

      public WebElement ClickOnProduct()
      {

          return product;
      }




      public WebElement productSku()
      {

          return sku;
      }


      public WebElement secondSlide()
      {
          return secondSlide;
      }

      public WebElement Facebook()
      {

          return facebook;
      }

    public WebElement Rssicon()
    {
        return rss;

    }

    public WebElement youtubeIcon()
    {
        return youtube;
    }

    public WebElement WishlistButton()
    {
        return WishlistButton;
    }

    public WebElement SuccessMsgGreen()
    {
        return successMsg;
    }
    public WebElement xbutton()
    {
        return xbutton;
    }
    public WebElement WishListElement()
    {
        return WishListElement;
    }

    public WebElement QtyValue ()
    {
        return qty;
    }



      public WebElement Twittericon()
      {
          return twitter;
      }


}
