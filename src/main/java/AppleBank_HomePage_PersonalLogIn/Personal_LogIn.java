package AppleBank_HomePage_PersonalLogIn;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_LogIn extends Reusable_Annotations {


    ExtentTest logger;
    public Personal_LogIn(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger= Reusable_Annotations.logger;
    }

    @FindBy(xpath = "//*[@class= 'account-login-submit btn']")
    WebElement Personal_LogIn2;

    public void PersonalLogIn2 () {
        Reusable_Actions_Loggers_POM.clickMethod(driver,Personal_LogIn2,logger,"PersonalLogIn");
    }


}//end of Java class
