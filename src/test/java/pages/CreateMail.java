package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateMail {
    public CreateMail(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public void startPage(){
        driver.get("https://www.mohmal.com/en/inbox");
    }
    private By changeMail = By.xpath("//div[@id='dashboard']//a[1]//*[name()='svg']");
    private By copy = By.xpath("//div[@class='email']");

    public void createMail(){
        driver.findElement(changeMail).click();
    }
    public void copyMail(){
        driver.findElement(copy).click();
    }


}
