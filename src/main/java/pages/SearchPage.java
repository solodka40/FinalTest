package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BasePage {

    @FindBy(xpath = "(//INPUT[@type='text'])[2]")
    WebElement sumFrom;

    @FindBy(xpath = "//section/div[@class='tamef' and @data-tid='5d98e15f'][2]")
    WebElement maker;

    @FindBy(xpath = "//a[@href and (contains(text(),'предложени'))]")
    WebElement resultBtn;

    @FindBy(xpath = "//input[@class='_34OG2']")
    WebElement searchingPoint;

    public void fillField(String value) {
        sumFrom.sendKeys(value);
    }

    public void selectMakers(String nameField) {
        fillField(searchingPoint, nameField);
        jsExec.executeScript("arguments[0].click();", maker.findElement(By.xpath("//input[@type='checkbox' and @value='" + nameField + "']")));

    }

    public void clickBtn() {
        resultBtn.click();
    }

}


