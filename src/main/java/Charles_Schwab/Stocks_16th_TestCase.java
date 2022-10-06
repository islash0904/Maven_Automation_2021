package Charles_Schwab;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stocks_16th_TestCase extends Reusable_Annotations {

    ExtentTest loggers;

    //create a constructor
    public Stocks_16th_TestCase(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.loggers= Reusable_Annotations.logger;

    }//end of Constructor Method

    @FindBy(xpath = "//*[@class= 'meganvpsr-main__menu__l1 meganv-activate-trigger']")
    WebElement Accounts_Products;//click
    @FindBy(xpath = "//*[@id='Stocks']")
    WebElement Stocks;
    @FindBy(xpath = "//*[@class='bcn-button bcn-button--primary  bcn-link-button']")
    WebElement LearnMore;
    @FindBy(xpath = "//*[@class='bcn-button bcn-button--open-an-account  bcn-link-button']")
    WebElement Open_An_Account;

    public void AccountsProducts(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,Accounts_Products,loggers,"AccountsProducts");

    }//end of AccountProducts

    public void Stcks(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Stocks,loggers,"Stocks");
    }//end of Stocks

    public void Learnmore(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,LearnMore,loggers,"LearnMore");
    }//end of LearnMore
    public void OpenAnAccount(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Open_An_Account,loggers,"OpenAnAccount");
    }//end of Open An Account


}//end of class
