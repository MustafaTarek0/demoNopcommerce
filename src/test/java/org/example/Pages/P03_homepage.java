package org.example.Pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(css = "body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement subCategoryDesktops;

    @FindBy(className = "page-title")
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

    @FindBy(css = "body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(1) > a")
    WebElement computersCategory;

    @FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-body > div.category-grid.sub-category-grid > div > div:nth-child(1) > div > h2 > a")
    WebElement desktopsTitle;
    public WebElement getComputersCategory() {
        return computersCategory;
    }

    public WebElement getDesktopsTitle() {
        return desktopsTitle;
    }

    public WebElement getCurrency()
  {

      return currency;
  }

  public WebElement getEuro()
  {
      return Euro;
  }


      public List<WebElement> getProductElements()
      {
          return Hooks.driver.findElements(By.cssSelector(".price.actual-price"));


      }

      public WebElement getSearchBar()
      {
          return searchBar;
      }

      public WebElement getSearchButton()
      {

          return searchBtn;
      }
    public WebElement getHovering()
    {
        return HoverComputers;

    }
    public WebElement getSubCategory()
    {

        return subCategoryDesktops;
    }
    public WebElement getPageTitle()
    {
        return PageTitle;
    }

    public WebElement getfirstSlide ()
    {

        return firstSlide;

    }

      public List<WebElement>getSearchProductElements()
      {

          return Hooks.driver.findElements(By.cssSelector(".product-item"));
      }

      public WebElement getClickOnProduct()
      {

          return product;
      }




      public WebElement getProductSku()
      {

          return sku;
      }


      public WebElement getSecondSlide()
      {
          return secondSlide;
      }

      public WebElement getFacebookLink()
      {

          return facebook;
      }

    public WebElement getRssLink()
    {
        return rss;

    }

    public WebElement getYoutubeUrl()
    {
        return youtube;
    }

    public WebElement getWishlistButton()
    {
        return WishlistButton;
    }

    public WebElement getSuccessMsgGreen()
    {
        return successMsg;
    }
    public WebElement getXButton()
    {
        return xbutton;
    }
    public WebElement getWishListElement()
    {
        return WishListElement;
    }

    public WebElement getQtyValue ()
    {
        return qty;
    }



      public WebElement getTwitterLink()
      {
          return twitter;
      }


}
