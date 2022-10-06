package Brokerage_Trading_2nd_TestCase;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2_Brokerage_Trading extends Reusable_Annotations {

    ExtentTest logger;
    public HomePage2_Brokerage_Trading(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.logger= Reusable_Annotations.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[@class='bcn-button bcn-button--open-an-account bcn-button--large-text general-referral-oaa bcn-link-button']")
    WebElement OpenABrokerageAccount;//click

    public void Open_Brokerage_Account(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,OpenABrokerageAccount,logger,"OpenABrokerageAccount");
    }//end of OpenABrokerageAccount




}//end of class
