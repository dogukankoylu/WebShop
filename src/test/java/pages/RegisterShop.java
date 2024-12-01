package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class RegisterShop {
    public RegisterShop(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    WebDriver driver;

    public void newTab(){
        ((JavascriptExecutor)driver).executeScript("window.open();");
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
    public void startPage(){
        driver.get("https://demowebshop.tricentis.com/register");
    }

    @FindBy(xpath = "//input[@id='gender-male']")
    private WebElement genderXpath;
    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement nameXpath;
    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastNameXpath;
    @FindBy(xpath = "//input[@id='Email']")
    private WebElement mailXpath;
    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordXpath;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    private WebElement rePasswordXpath;
    @FindBy(xpath = "//input[@id='register-button']")
    private WebElement signUpXpath;

    public void selectGender(){
        genderXpath.click();
    }
    public void firstName(){
        nameXpath.click();
        nameXpath.sendKeys("Adem");
    }
    public void lastName(){
        lastNameXpath.sendKeys("Aydemir");
    }
    public void mail(){
        mailXpath.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
    }
    public void password(){
        passwordXpath.sendKeys("Adem123456");
    }
    public void rePassword(){
        rePasswordXpath.sendKeys("Adem123456");
    }
    public void signUp(){
        signUpXpath.click();
    }
}
