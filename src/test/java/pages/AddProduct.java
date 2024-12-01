package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {
    public AddProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    WebDriver driver;

    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Computers']")
    private WebElement clickComputerXpath;
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    private WebElement clickDesktopXpath;
    @FindBy(xpath = "//img[@title='Show details for Build your own expensive computer']")
    private WebElement selectComputerXpath;
    @FindBy(xpath = "//input[@id='product_attribute_74_6_27_85']")
    private WebElement scrollXpath;
    @FindBy(xpath = "//input[@value='82']")
    private WebElement selectProcessorXpath;
    @FindBy(xpath = "//input[@value='85']")
    private WebElement selectRamXpath;
    @FindBy(xpath = "//input[@value='87']")
    private WebElement selectHddXpath;
    @FindBy(xpath = "//input[@value='88']")
    private WebElement selectSoftware1;
    @FindBy(xpath = "//input[@value='89']")
    private WebElement selectSoftware2;
    @FindBy(xpath = "//input[@value='90']")
    private WebElement selectSoftware3;
    @FindBy(xpath = "(//input[@id='add-to-cart-button-74'])[1]")
    private WebElement addCartXpath;

    public void clickComputer(){
        clickComputerXpath.click();
    }
    public void clickDesktop(){
        clickDesktopXpath.click();
    }
    public void selectComputer(){
        selectComputerXpath.click();
    }
    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",scrollXpath);
    }
    public void selectProcessor(){
        selectProcessorXpath.click();
    }
    public void selectRam(){
        selectRamXpath.click();
    }
    public void selectHdd(){
        selectHddXpath.click();
    }
    public void selectSoftware(){
        selectSoftware1.click();
        selectSoftware2.click();
        selectSoftware3.click();
    }
    public void addCart(){
        addCartXpath.click();
    }
}
