package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {
    String product;

    @FindBy(xpath = "(//DIV[@class='_3Fff3'])[1]")
    WebElement firstPoint;

    @FindBy(id = "header-search")
    WebElement globalSearch;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchingBtn;

    @FindBy(xpath = "(//H3[@class='_2UHry _2vVOc'])[1]")
    WebElement resultProduct;

    public void findFirstProduct() {
        product = firstPoint.getText();
    }

    public void searchProductByName() {
        globalSearch.click();
        fillField(globalSearch, product);
        searchingBtn.click();
    }

    public void checkingForResults() {
        Assert.assertEquals("Найденный товар: '" + resultProduct.getText() + "' не соответствует запомненному значению: '" + product + "'!", product, resultProduct.getText());
    }

}
