package Brokerage_Trading_2nd_TestCase;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Brokerage_Trading extends Reusable_Annotations {

    ExtentTest logger;
    public Homepage_Brokerage_Trading(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.logger= Reusable_Annotations.logger;
    }//end of constructor

    @FindBy(xpath = "//*[@class= 'meganvpsr-main__menu__l1 meganv-activate-trigger']")
    WebElement Accounts_Products;//click
    @FindBy(xpath = "//*[@id='BrokerageandTrading']")
    WebElement Brokerage_Trading;//click

    public void AccountsProducts(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,Accounts_Products,logger,"AccountsProducts");
    }//end of AccountProducts

    public void BrokerageTrading(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Brokerage_Trading,logger,"Brokerage_Trading");
    }//end of Brokerage_Trading


}//end of class
