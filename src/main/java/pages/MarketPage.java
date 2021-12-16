package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPage extends BasePage {
    @FindBy(xpath = "//div[@class='_3mU1o']")
    WebElement marketMenuByTopic;

    public void selectTopic(String item) {
        marketMenuByTopic.findElement(By.xpath("//span[contains(text(),'" + item + "')]")).click();

    }
}
