package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signup_page extends Config {



    public signup_page(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }


    @FindBy(how= How.XPATH, using ="//*[@id=\'globalSearchInputField\']")
    public WebElement clickSearch;





    public void clickSearch(){
        clickSearch.click();
    }



}