package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {
    @FindBy(xpath = "//div[@class='section _2MUss _3jiXh OM29h NRIlq']")
    WebElement leftMenu;

    public void selectCategory(String item) {
        leftMenu.findElement(By.xpath("//li/div/a[contains(text(),'" + item + "')]")).click();
    }
}
