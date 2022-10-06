package AppleBank_HomePage_PersonalLogIn;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apple_Account_LogIn extends Reusable_Annotations {

    ExtentTest logger;
    public Apple_Account_LogIn(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger= Reusable_Annotations.logger;
    }

    @FindBy(xpath = "//*[@class='col-xs-11 col-sm-4 pull-right account-login-title account-login-toggle']")
    WebElement LogIn;

    public void Personal() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,LogIn,logger,"Personal1");
    }




}//end of java class
