package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//nav[@aria-label='Сервисы']")
    WebElement mainMenu;

    public void selectIcon(String menuItem) {
        mainMenu.findElement(By.xpath("//div[contains(text(),'" + menuItem + "')]")).click();
    }
}
