package Charles_Schwab;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brokerage_Trading_2nd_TestCase extends Reusable_Annotations {

    ExtentTest logger;

    public Brokerage_Trading_2nd_TestCase(WebDriver driver) {
        PageFactory.initElements(driver , this);
        this.logger= Reusable_Annotations.logger;

    }//end of constructor method

    @FindBy(xpath = "//*[@class= 'meganvpsr-main__menu__l1 meganv-activate-trigger']")
    WebElement Accounts_Products;//click
    @FindBy(xpath = "//*[@id='BrokerageandTrading']")
    WebElement Brokerage_Trading;//click
    @FindBy(xpath = "//*[@class='bcn-button bcn-button--open-an-account bcn-button--large-text general-referral-oaa bcn-link-button']")
    WebElement OpenABrokerageAccount;//click
    @FindBy(xpath = "//*[@class='appendquerystring tile-deck-outline__link']")
    WebElement IndividualBrokerage;//click
    @FindBy(xpath = "//*[@class='sdps-button sdps-button--fluid sdps-button--primary']")
    WebElement GetStarted;//click

    public void AccountsProducts(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,Accounts_Products,logger,"AccountsProducts");
    }//end of AccountProducts

    public void BrokerageTrading(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Brokerage_Trading,logger,"Brokerage_Trading");
    }//end of Brokerage_Trading

    public void Open_Brokerage_Account(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,OpenABrokerageAccount,logger,"OpenABrokerageAccount");
    }//end of OpenABrokerageAccount

    public void Individual_Brokerage(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,IndividualBrokerage,logger,"IndividualBrokerage");
    }//end of IndividualBrokerage

    public void Get_Started(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,GetStarted,logger,"GetStarted");
    }//end of GetStarted

}//end of class
