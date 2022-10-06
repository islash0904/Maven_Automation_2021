package Charles_Schwab;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Choice_Retirement_6th_UserStory extends Reusable_Annotations {

    ExtentTest lgger;
    //create the constructor
    public Personal_Choice_Retirement_6th_UserStory(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.lgger= Reusable_Annotations.logger;

    }

    @FindBy(xpath = "//*[@class= 'meganvpsr-main__menu__l1 meganv-activate-trigger']")
    WebElement Accounts_Products;//click
    @FindBy(xpath = "//*[text()='Personal Choice Retirement']")
    WebElement Personal_Choice_Retirement;
    @FindBy(xpath = "//*[@class='bcn-button bcn-button--open-an-account  bcn-link-button']")
    WebElement Open_Your_PCRA;


    public void AccountsProducts(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,Accounts_Products,logger,"AccountsProducts");
    }//end of AccountProducts

    public void PersonalChoiceRetirement() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,Personal_Choice_Retirement,logger,"PersonalChoiceRetirement");
    }//end of  Personal_Choice_Retirement

    public void OpenYourPCRA(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Open_Your_PCRA,logger,"OpenYourAccount");
    }//end of  Open_Your_PCRA


}//end of class
