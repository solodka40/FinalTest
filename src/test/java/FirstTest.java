//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.concurrent.TimeUnit;
//
//public class FirstTest {
//
//    private WebDriver driver;
//    private String baseUrl;
//    private Actions actions;
//
//    @Before
//    public void beforeTest() {
//
//        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
//        baseUrl = "http://www.yandex.ru";
//        driver = new ChromeDriver();
//        actions = new Actions(driver);
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.manage().window().maximize();
//        driver.get(baseUrl);
//    }
//
//    @Test
//    public void testInsurance() {
//        Wait<WebDriver> wait = new WebDriverWait(driver, 80, 1000);
//        driver.findElement(By.xpath("//div[@class=\"services-new__item-title\" and contains (text(),'Маркет')]")).click();
//        Object[] array = driver.getWindowHandles().toArray();
//        String mywindow = driver.getWindowHandle();
//        for (Object item : array) {
//            if (!mywindow.equals(item.toString())) {
//                driver.switchTo().window(item.toString());
//                break;
//            }
//        }
//        driver.findElement(By.xpath("//a[@href='/catalog--elektronika/54440']")).click();
//        driver.findElement(By.xpath("//li/div/a[@href=\"/catalog--televizory/26960210/list?hid=90639\"]")).click();
//
//        driver.findElement(By.xpath("//span[contains(text(),'Все фильтры')]")).click();
//        driver.findElement(By.xpath("//h4[contains(text(),'Цена')]")).click();
//        fillField(By.xpath("(//INPUT[@type='text'])[2]"), "20000");
//
//        actions.click(driver.findElement(By.xpath("//input[@type='checkbox' and @value='LG']"))).build().perform();
//        actions.click(driver.findElement(By.xpath("//input[@type='checkbox' and @value='Samsung']"))).build().perform();
//        driver.findElement(By.xpath("//a[@href and (contains(text(),'предложений'))]")).click();
//        String firstPoint = driver.findElement(By.xpath("(//DIV[@class='_3Fff3'])[1]")).getText();
//        driver.findElement(By.id("header-search")).click();
//        fillField(By.id("header-search"), firstPoint);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Assert.assertEquals("Найденный товар не соответствует запомненному!", firstPoint, driver.findElement(By.xpath("(//H3[@class='_2UHry _2vVOc'])[1]")).getText());
//
////
//    }
//
//    public void fillField(By locator, String value) {
//        driver.findElement(locator).clear();
//        driver.findElement(locator).sendKeys(value);
//    }
//
//    @After
//    public void afterTest() {
//        driver.quit();
//    }
//
//
//}
//
