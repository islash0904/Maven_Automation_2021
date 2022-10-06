package Brokerage_Trading_2nd_TestCase;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage3_Brokerage_Trading  extends Reusable_Annotations {

     ExtentTest logger;
     public Homepage3_Brokerage_Trading(WebDriver driver){
         PageFactory.initElements(driver,this );
         this.logger=Reusable_Annotations.logger;
     }// end of constructor method

    @FindBy(xpath = "//*[@class= 'appendquerystring tile-deck-outline__link']")
    WebElement IndividualBrokerage;

     public  void Individual_Brokerage(){
         Reusable_Actions_Loggers_POM.clickMethod(driver, IndividualBrokerage, logger,"IndividualBrokerage");
     }//end of IndividualBrokerage

}//end of class
