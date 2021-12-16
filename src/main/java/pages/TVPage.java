package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'Все фильтры')]")
    WebElement allFiltersBtn;

    public void clickButton() {
        allFiltersBtn.click();
    }
}
