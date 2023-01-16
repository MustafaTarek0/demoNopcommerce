package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.example.Pages.pageBase;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef  extends pageBase {

    P03_homepage hovering = new P03_homepage();
    @When("user can hover on Computers tab")
    public void UserHoverOnCategory()
    {
        Actions Act = new Actions(Hooks.driver);
        Act.moveToElement(hovering.getHovering()).perform();
    }

    @And("user click on sub-tab {string}")
    public void desktops(String Category)
    {
if (Category.equals("Desktops"))
{
    Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    hovering.getSubCategory().click();
}
else {
    hovering.getComputersCategory().click();

}



    }

    @Then("Sub-category title {string} page should be visible")
    public void ResultPageTitle(String Category)  {
if (Category.equals("Desktops")) {
    Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    String subCategory = hovering.getPageTitle().getText().toLowerCase().trim();
    Assert.assertEquals(subCategory, "desktops");
}
else {
    System.out.println(hovering.getDesktopsTitle().getText());
    Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    Assert.assertEquals(hovering.getDesktopsTitle().getText().toLowerCase().trim(), "desktops");
}
    }



}


