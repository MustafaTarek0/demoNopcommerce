package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.example.Pages.pageBase;
public class D05_hoverCategoriesStepDef  extends pageBase {

    P03_homepage hover = new P03_homepage();
    @When("user hover on Computers category")
    public void UserHoverOnCategory()
    {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(hover.Hovering()).perform();
    }

    @And("user click on sub-category")
    public void desktops()
    {


        hover.SubCategory().click();

    }

    @Then("Sub-category page should be shown")
    public void ResultPageTitle()
    {

        String category = hover.PageTitle().getText().toLowerCase().trim();
         Assert.assertEquals(category, "desktops");

    }



}


