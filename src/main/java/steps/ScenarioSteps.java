package steps;

import io.cucumber.java.en.When;
import pages.*;

public class ScenarioSteps {
    MainPage mainPage = new MainPage();
    MarketPage marketPage = new MarketPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    TVPage tvPage = new TVPage();
    SearchPage searchPage = new SearchPage();
    ResultPage resultPage = new ResultPage();

    @When("^выбран пункт главного меню \"(.+)\"$")
    public void selectMenuItem(String menuItem) {
        mainPage.selectIcon(menuItem);
    }

    @When("Переключиться на новую страницу")
    public void goToNewPage() {
        Object[] array = BaseSteps.getDriver().getWindowHandles().toArray();
        String mywindow = BaseSteps.getDriver().getWindowHandle();
        for (Object item : array) {
            if (!mywindow.equals(item.toString())) {
                BaseSteps.getDriver().switchTo().window(item.toString());
                break;
            }
        }
    }

    @When("^Выбран раздел каталога по теме:  \"(.+)\"$")
    public void selectTopicOnMarketPage(String menuItem) {
        marketPage.selectTopic(menuItem);
    }

    @When("^Выбран подраздел каталога по продукту:  \"(.+)\"$")
    public void selectCategory(String menuItem) {
        electronicsPage.selectCategory(menuItem);
    }

    @When("Нажимаем на кнопку Все фильтры")
    public void clickBtn() {
        tvPage.clickButton();
    }


    @When("Вводим сумму \"(.+)\"$")
    public void fillForm(String sum) {
        searchPage.fillField(sum);
    }

    @When("Выбираем производителей: \"(.+)\"$")
    public void clickMakers(String name) {
        searchPage.selectMakers(name);

    }

    @When("Нажать на кнопку Применить")
    public void goToResultPage() {
        searchPage.clickBtn();
    }

    @When("Находим наименование первого продукта")
    public void findFirstResultFromList() {
        resultPage.findFirstProduct();
    }

    @When("В поисковую строку ввести запомненное значение")
    public void searchProduct() {
        resultPage.searchProductByName();
    }

    @When("Проверяем соответствие результата выборки заполненному значению")
    public void checking() {
        resultPage.checkingForResults();
    }
}

