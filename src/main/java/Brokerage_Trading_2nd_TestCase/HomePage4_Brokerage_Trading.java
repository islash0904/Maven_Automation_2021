package Brokerage_Trading_2nd_TestCase;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage4_Brokerage_Trading extends Reusable_Annotations {

       ExtentTest logger;
       public HomePage4_Brokerage_Trading(WebDriver driver){
              PageFactory.initElements(driver,this);
              this.logger=Reusable_Annotations.logger;
       }//end of constructorMethod

       @FindBy(xpath = "//*[@class= 'sdps-button sdps-button--fluid sdps-button--primary']")
       WebElement GetStarted;

       public void Get_Started(){
              Reusable_Actions_Loggers_POM.clickMethod(driver,GetStarted,logger,"GetStarted");
       }//end of GetStarted




}//end of Class
