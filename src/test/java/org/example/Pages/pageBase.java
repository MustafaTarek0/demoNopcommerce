package org.example.Pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pageBase {
    public  pageBase()
    {
        PageFactory.initElements(Hooks.driver, this);

    }
    public static void Selecting(WebElement element, String value)
    {
        Select select = new Select(element);
        select.selectByValue(value);


    }
}
