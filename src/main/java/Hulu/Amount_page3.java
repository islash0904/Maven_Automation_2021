package Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amount_page3 extends Reusable_Annotations{

    ExtentTest logger;
    public Amount_page3(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

   @FindBy(xpath = "//*[@class='ledger__price']")
    WebElement Subscription;
    @FindBy(xpath = "//*[@class='ledger__summary")
    WebElement TotalAmount;

    public String SubsriptionAmount() {
        String SubsriptionAmount = Reusable_Actions_Loggers_POM.getTextMethod(driver, Subscription, logger, "Monthly Subscription");
        return SubsriptionAmount;
    }//End

    public String Totalaount(){
        String  Totalaount = Reusable_Actions_Loggers_POM.getTextMethod(driver,TotalAmount,logger,"Due today");
       return Totalaount;
    }//End



}
