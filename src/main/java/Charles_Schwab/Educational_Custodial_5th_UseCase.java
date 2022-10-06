package Charles_Schwab;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Educational_Custodial_5th_UseCase extends Reusable_Annotations {

    ExtentTest logger;

    public Educational_Custodial_5th_UseCase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger= Reusable_Annotations.logger;
    }//end of constructor

    @FindBy(xpath = "//*[@class= 'meganvpsr-main__menu__l1 meganv-activate-trigger']")
    WebElement Accounts_Products;//click
    @FindBy(xpath = "//*[id='EducationandCustodial']")
    WebElement Educational_Custodial;//click
    @FindBy(xpath = "//*[@class='bcn-button bcn-button--open-an-account  bcn-link-button']")
    WebElement Open_A_529_Account;//click
    @FindBy(xpath = "//*[@class='bcn-button bcn-button--open-an-account  bcn-link-button']")
    WebElement Apply_Now;

    public void AccountsProducts(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,Accounts_Products,logger,"AccountsProducts");
    }//end of AccountProducts

    public void EducationalCustodial(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Educational_Custodial,logger,"EducationalCustodial");
    }//end of EducationalCustodial

    public void OpenA529Account(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Open_A_529_Account,logger,"Open_A_529_Account");
    }//end of Open_A_529_Account

    public void ApplyNow(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Apply_Now,logger," Apply_Now");
    }//end of  Apply_Now



}//end of class
