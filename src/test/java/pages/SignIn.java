package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
    public SignIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Log out']")
    private WebElement logOutXpath;
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    private WebElement loginXpath;
    @FindBy(xpath = "//input[@id='Email']")
    private WebElement mailXpath;
    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordXpath;
    @FindBy(xpath = "//input[@value='Log in']")
    private WebElement loginButtonXpath;

    public void logOut(){
        logOutXpath.click();
    }
    public void login(){
        loginXpath.click();
    }
    public void mail(){
        mailXpath.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
    }
    public void password(){
        passwordXpath.sendKeys("Adem123456");
    }
    public void loginButton(){
        loginButtonXpath.click();
    }
}
