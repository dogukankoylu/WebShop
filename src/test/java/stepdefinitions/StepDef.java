package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;
import utilities.MyDriver;


public class StepDef {
    WebDriver driver;
    MyDriver myDriver = new MyDriver();
    CreateMail createMail;
    RegisterShop registerShop;
    SignIn signIn;
    AddProduct addProduct;
    CompleteTheOrder completeTheOrder;
    @Given("create new mail")
    public void createNewMail() throws InterruptedException {
        driver = myDriver.start();
        createMail = new CreateMail(driver);
        createMail.startPage();
        createMail.createMail();
        Thread.sleep(1500);
        createMail.copyMail();
    }

    @And("register on shop")
    public void registerOnShop() throws InterruptedException {
        registerShop = new RegisterShop(driver);
        registerShop.newTab();
        registerShop.startPage();
        Thread.sleep(2000);
        registerShop.selectGender();
        registerShop.firstName();
        registerShop.lastName();
        registerShop.mail();
        registerShop.password();
        registerShop.rePassword();
        registerShop.signUp();
    }

    @And("sign in to shop")
    public void signInToShop() throws InterruptedException {
        signIn = new SignIn(driver);
        Thread.sleep(2000);
        signIn.logOut();
        signIn.login();
        signIn.mail();
        signIn.password();
        signIn.loginButton();
    }

    @And("add product")
    public void addProduct() throws InterruptedException {
        addProduct = new AddProduct(driver);
        Thread.sleep(2000);
        addProduct.clickComputer();
        addProduct.clickDesktop();
        addProduct.selectComputer();
        addProduct.scrollPage();
        addProduct.selectProcessor();
        addProduct.selectRam();
        addProduct.selectHdd();
        addProduct.selectSoftware();
        addProduct.addCart();
    }

    @When("complete the order")
    public void completeTheOrder() throws InterruptedException {
        completeTheOrder = new CompleteTheOrder(driver);
        Thread.sleep(2000);
        completeTheOrder.scrollPage();
        Thread.sleep(2000);
        completeTheOrder.checkCart();
        completeTheOrder.scrollCheckout();
        completeTheOrder.clickTerms();
        completeTheOrder.clickCheckout();
        completeTheOrder.country();
        completeTheOrder.city();
        completeTheOrder.adress1();
        completeTheOrder.zipCode();
        completeTheOrder.phoneNumber();
        completeTheOrder.billing();
        completeTheOrder.shipping();
        completeTheOrder.shippingMethod();
        completeTheOrder.paymentMethod();
        completeTheOrder.paymentInfo();
        completeTheOrder.scrollConfirm();
        completeTheOrder.assertTotal();
        completeTheOrder.clickConfirm();
        completeTheOrder.assertOrder();
        myDriver.closeDriver();
    }
}
