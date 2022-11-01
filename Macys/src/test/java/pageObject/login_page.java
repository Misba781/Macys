package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_page extends Config {

    public login_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;}

    //Locator
        @FindBy(how= How.XPATH, using ="//*[@id=\'flexid_5991\']/a/span")
        public WebElement clickSingInbutton;


    public void clickSignIn() {
        clickSingInbutton.click();

    }
}
