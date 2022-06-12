package steps;

import org.openqa.selenium.WebDriver;
import pages.Locators;
import util.UtilTest;
import base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class StepImplementation extends BaseTest {
    WebElement webElement;

    //Actions actions = new Actions(driver);
    //WebDriverWait wait = new WebDriverWait(driver, 15);
    String productName;
    UtilTest utilTest = new UtilTest();
    Locators locators = new Locators();


    @Step("Bulunduğumuz url <key> değerini içerdiği kontrol edilir.")
    public void checkUrl(String key) {
        Assert.assertTrue("İstenilen urlde değilsiniz!", utilTest.checkUrl(key));
    }


    @Step("Giriş yap butonu tıklanır.")
    public void hoverToLogin() {
        utilTest.click(locators.myAccount);
        utilTest.waitVisibility(locators.login);
        Assert.assertTrue("Giriş yap bulunamadı.", utilTest.isDisplayed(locators.login));
    }

    @Step("Giriş yap tıklanır.")
    public void clickLogin() {
        utilTest.click(locators.login);
        utilTest.waitVisibility(locators.email);
        Assert.assertTrue("E-posta alanı bulunamadı.", utilTest.isDisplayed(locators.email));
    }

    @Step("E-posta alanına <key> değeri yazılır.")
    public void writeToEmail(String key) {
        utilTest.findElement(locators.email).clear();
        utilTest.sendKeys(locators.email, key);
    }

    @Step("Email alanı Giriş yap tıklanır.")
    public void clickLoginButton() {
        utilTest.click(locators.emailLogin);
    }

    @Step("Şifre alanına <key> değeri yazılır.")
    public void writeToPassword(String key) {
        utilTest.click(locators.password);
        utilTest.sendKeys(locators.password,key);
    }

    @Step("Şifre alanı giriş yap butonu tıklanır.")
    public void clickToPasswordLogin() {
        utilTest.click(locators.passwordLogin);
    }

    @Step("Hesabım alanı görünene kadar beklenir.")
    public void checkMyAccount() {
        utilTest.waitVisibility(locators.myAccount);
    }

    @Step("<key> kullanıcısı ile girildiği kontrol edilir.")
    public void checkUserName(String key) {
        utilTest.click(locators.myAccount);
        String userName = utilTest.getText(locators.userCheck);
        Assert.assertEquals("İstenilen kullanıcı ile giriş yapılmamışır.", userName, key);
    }

    @Step("Arama alanına <key> yazılır.")
    public void sendKeySearchArea(String key) {
        utilTest.click(locators.searchBox);
        webElement = utilTest.findElement(locators.searchBox);
        utilTest.sendKeys2(webElement, key);

    }

    @Step("Arama alanında ENTER tıklanır.")
    public void sendEnter() {
        utilTest.sendEnter(locators.searchBox);
        utilTest.waitVisibility(locators.allComputer);
        Assert.assertTrue("Ürünler görüntülenemedi", utilTest.isDisplayed(locators.allComputer));
    }

    @Step("İlk sıradaki bilgisayar seçilir.")
    public void selectComputer() {
         utilTest.click(locators.selectComputer);

    }

    @Step("İkinci sekmeye geçilir.")
    public void changeTabs() {
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));
        utilTest.waitVisibility(locators.addToCart);
        Assert.assertTrue("ikinci sekmeye geçilemedi", utilTest.isDisplayed(locators.addToCart));
    }

    @Step("Sepete Ekle butonuna tıklanır.")
    public void addToCart() {
        utilTest.click(locators.addToCart);
    }

    @Step("Kapat butonu tıklanır.")
    public void clickCloseButton() {
        utilTest.waitVisibility(locators.closeButton);
        utilTest.click(locators.closeButton);
    }

    @Step("Farklı satıcıdan ürün sepete ekle butonuna tıklanır.")
    public void differentSellerAddToCart() {
        productName = utilTest.getText(locators.productName);
        utilTest.click(locators.differentSellerAddToCart);
    }

    @Step("Onarım paketi kapat butonu tıklanır.")
    public void clickClose() {
        utilTest.waitVisibility(locators.closeButtonSecond);
        utilTest.click(locators.closeButtonSecond);
    }

    @Step("Sepete git butonu tıklanır.")
    public void clickToCart() {
        utilTest.waitVisibility(locators.goToCart);
        utilTest.click(locators.goToCart);
    }

    @Step("Sepetteki ürünün doğruluğu kontrol edilir.")
    public void implementation1() {
        List<WebElement> list = utilTest.findElements(locators.productNamesInCart);
        String cartProductName = list.get(1).getText();
        Assert.assertEquals("Sepete istenilen ürün eklenememiştir.",  productName, cartProductName);

    }
}





