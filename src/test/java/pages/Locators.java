package pages;

import org.openqa.selenium.By;

public class Locators {
    public By myAccount = By.id("myAccount");
    public By login = By.id("login");
    public By email = By.id("txtUserName");
    public By emailLogin = By.id("btnLogin");
    public By password = By.xpath("//input[@id='txtPassword']");
    public By passwordLogin = By.id("btnEmailSelect");
    public By userCheck = By.cssSelector("span.sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR");
    public By searchBox = By.cssSelector("div[role='combobox']");
    public By allComputer = By.cssSelector("div.productListContent-innerWrapper");
    public By selectComputer = By.cssSelector("li[id='i0']");
    public By addToCart = By.id("addToCart");
    public By closeButton = By.cssSelector("a.checkoutui-Modal-2iZXl");
    public By productName = By.id("product-name");
    public By differentSellerAddToCart = By.cssSelector("div[class='marketplace-list']>table>tbody>tr:nth-of-type(1)>td:nth-of-type(3)>div>form");
    public By closeButtonSecond = By.cssSelector("i.close");
    public By goToCart = By.cssSelector("div.checkoutui-ProductOnBasketHeader-m4tLG>button:nth-of-type(1)");
    public By productNamesInCart = By.cssSelector("div[class='product_properties_2hkip']>div:nth-of-type(2)>a");
}
