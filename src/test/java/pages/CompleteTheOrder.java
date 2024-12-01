package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CompleteTheOrder {
    WebDriver driver;

    public CompleteTheOrder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Shopping cart']")
    private WebElement scrollCartXpath;
    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
    private WebElement checkCartXpath;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement scrollCheckoutXpath;
    @FindBy(xpath = "//input[@id='termsofservice']")
    private WebElement clickTermsXpath;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement clickCheckoutXpath;
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    private WebElement countryXpath;
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    private WebElement cityXpath;
    @FindBy(xpath = "(//input[@id='BillingNewAddress_Address1'])[1]")
    private WebElement adress1Xpath;
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    private WebElement zipCodeXpath;
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    private WebElement phoneNumberXpath;
    @FindBy(xpath = "//input[@onclick='Billing.save()']")
    private WebElement billingXpath;
    @FindBy(xpath = "//input[@onclick='Shipping.save()']")
    private WebElement shippingXpath;
    @FindBy(xpath = "(//input[@class='button-1 shipping-method-next-step-button'])[1]")
    private WebElement shippingMethodXpath;
    @FindBy(xpath = "(//input[@class='button-1 payment-method-next-step-button'])[1]")
    private WebElement paymentMethodXpath;
    @FindBy(xpath = "(//input[@class='button-1 payment-info-next-step-button'])[1]")
    private WebElement paymentInfoXpath;
    @FindBy(xpath = "//input[@value='Confirm']")
    private WebElement confirmXpath;
    @FindBy(xpath = "//strong[normalize-space()='2212.00']")
    private WebElement assertTotalXpath;
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    private WebElement assertOrderXpath;

    public void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",scrollCartXpath);
    }
    public void checkCart(){
        checkCartXpath.click();
    }
    public void scrollCheckout(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",scrollCheckoutXpath);
    }
    public void clickTerms(){
        clickTermsXpath.click();
    }
    public void clickCheckout(){
        clickCheckoutXpath.click();
    }
    public void country(){
        Select select = new Select(countryXpath);
        select.selectByVisibleText("Turkey");
    }
    public void city(){
        cityXpath.sendKeys("istanbul");
    }
    public void adress1(){
        adress1Xpath.sendKeys("osmangazi mh. sancaktepe");
    }
    public void zipCode(){
        zipCodeXpath.sendKeys("34782");
    }
    public void phoneNumber(){
        phoneNumberXpath.sendKeys("05331231231");
    }
    public void billing(){
        billingXpath.click();
    }
    public void shipping(){
        shippingXpath.click();
    }
    public void shippingMethod(){
        shippingMethodXpath.click();
    }
    public void paymentMethod(){
        paymentMethodXpath.click();
    }
    public void paymentInfo(){
        paymentInfoXpath.click();
    }
    public void scrollConfirm(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",confirmXpath);
    }
    public void assertTotal(){
        String assertTotal1 = assertTotalXpath.getText();
        Assert.assertTrue(assertTotal1.contains("22"));
    }
    public void clickConfirm(){
        confirmXpath.click();
    }
    public void assertOrder(){
        Assert.assertTrue(assertOrderXpath.isDisplayed());
    }
}
