package Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  HomePage2 extends Reusable_Annotations {

    ExtentTest logger;
    public HomePage2(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

//define all the webelement for this page
    @FindBy(xpath = "//*[@aria-label='Get Hulu plan']")
    WebElement SelectButton;


     public void SelectButton() {

         Reusable_Actions_Loggers_POM.clickMethod(driver,SelectButton,logger,"SelectButton");
     }


}
