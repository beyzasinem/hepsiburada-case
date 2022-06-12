package util;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class UtilTest extends BaseTest {

    WebElement webElement;
    WebDriverWait wait = new WebDriverWait(driver,15);
    Actions actions;

    public WebElement findElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }


    public String getText(By locator) {
        return findElement(locator)
                .getText();
    }

    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendKeys(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void sendKeys2(WebElement element, String text) {
        if (element.isDisplayed() && element.isEnabled()){
            element.sendKeys(text);
        }
    }

    public void sendEnter(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(Keys.ENTER);
    }

    public boolean checkUrl(String key) {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.contains(key);
    }


    //Gönderilen web elementin görünür olmasını bekler
    public void waitVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean isDisplayed(By locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
                    .isDisplayed();
        } catch (TimeoutException te) {
            return false;
        }
    }

}
