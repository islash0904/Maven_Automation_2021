package Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotation;
import com.relevantcodes.extentreports.ExtentTest;
import jdk.jshell.JShell;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.Flow;

public class Amount_page3 extends Reusable_Annotation {

    ExtentTest logger;
    public Amount_page3(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation.logger;
    }//end of the constructor method

   @FindBy(xpath = "//*[text()='$6.99/mo']")
    WebElement Subscription;
    @FindBy(xpath = "//*[@class='panel large'][2]")
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
