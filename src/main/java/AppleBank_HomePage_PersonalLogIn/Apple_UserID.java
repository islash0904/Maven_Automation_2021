package AppleBank_HomePage_PersonalLogIn;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apple_UserID extends Reusable_Annotations {


    ExtentTest logger;
    public Apple_UserID(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;

    }

    @FindBy (xpath = "//*[@name='user_id']")
    WebElement UserId;
    @FindBy (xpath = "//*[@name='password']")
    WebElement Password;
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    WebElement LogIn_Button;

    public void UserID3 (String Essential) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,UserId,Essential,logger,"UserID3");

    }

    public void Password$ (String Code) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Password,Code,logger,"Password$");
    }

    public void LogIn3 () {
        Reusable_Actions_Loggers_POM.clickMethod(driver,LogIn_Button,logger,"LogIN_BUtton3");
    }




}//end of java class
