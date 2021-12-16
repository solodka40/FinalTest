package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import static steps.BaseSteps.getDriver;

public class BasePage {
    JavascriptExecutor jsExec = ((JavascriptExecutor) BaseSteps.getDriver());

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}
