package Charles_Schwab;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mutual_Funds_13th_TestCase extends Reusable_Annotations {


    ExtentTest logger;

    public Mutual_Funds_13th_TestCase(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.logger= Reusable_Annotations.logger;

    }//end of constructor method


    //define all webelement on this page
   //click
    @FindBy(xpath = "//*[@class= 'meganvpsr-main__menu__l1 meganv-activate-trigger']")
    WebElement Accounts_Products;//click

    @FindBy(xpath = "//*[@id='MutualFunds']")
    WebElement MutualFunds;//click

    @FindBy(xpath = "//*[@class='bcn-button bcn-button--primary bcn-button--large-text  bcn-link-button']")
    WebElement OpenAccount;//click

    @FindBy(xpath = "//*[@class='bcn-button bcn-button--primary bcn-button--large-text  bcn-link-button']")
    WebElement ExploreMutualFundTypes;//click

    public void AccountsProducts(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,Accounts_Products,logger,"AccountsProducts");
    }//end of AccountProducts

    public void Mutual_Funds(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,MutualFunds,logger,"MutualFunds");
    }//end of MutualFunds

    public void Open_Account(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,OpenAccount,logger,"OpenAccount");
    }//end of OpenAccount

    public void Explore_Mutual_FundTypes() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,ExploreMutualFundTypes,logger,"ExploreMutualFundTypes");
    }//end of ExploreMutualFundTypes



}//end of class
