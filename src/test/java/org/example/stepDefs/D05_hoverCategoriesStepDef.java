package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.example.Pages.pageBase;

import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef  extends pageBase {

    P03_homepage hover = new P03_homepage();
    @When("user hover on Computers category")
    public void UserHoverOnCategory()
    {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(hover.getHovering()).perform();
    }

    @And("user click on sub-category {string}")
    public void desktops(String Category)
    {
if (Category.equals("Desktops"))
{
    Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    hover.getSubCategory().click();
}
else {
    hover.getComputersCategory().click();

}



    }

    @Then("Sub-category title {string} page should be visible")
    public void ResultPageTitle(String Category)  {
if (Category.equals("Desktops")) {
    Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    String subCategory = hover.getPageTitle().getText().toLowerCase().trim();
    Assert.assertEquals(subCategory, "desktops");
}
else {
    System.out.println(hover.getDesktopsTitle().getText());
    Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    Assert.assertEquals(hover.getDesktopsTitle().getText().toLowerCase().trim(), "desktops");
}
    }



}


