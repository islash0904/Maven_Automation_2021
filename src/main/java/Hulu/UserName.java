package Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserName extends Reusable_Annotations {


    ExtentTest logger;
    public UserName(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

@FindBy(xpath = "//*[@data-automationid='navigation_login_button']")
    WebElement UserName;
//hj

    public void UserName (String userdata) {

        String userName = Reusable_Actions_Loggers_POM.getTextMethod(driver,UserName,logger,"UserName");

    }//




}
