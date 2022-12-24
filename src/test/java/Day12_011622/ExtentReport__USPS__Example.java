package Day12_011622;

import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class ExtentReport__USPS__Example extends Reusable_Annotations {


    @Test()
    public void uspsTest(){

        //navigate to usps
        logger.log(LogStatus.INFO,"Navigate to USPS home page");
        driver.navigate().to("https://www.usps.com");
        //hover to the quick tool tab
        Reusable_Actions_Loggers.mouseHover(driver,"//*[text()='Quick Tools']",logger,"Quck tools");
        //click on track a package
        Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Track a Package']",logger,"Track a Packgage");
        //enter your tracking number
        Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@id='tracking-input']","1111111111",logger,"Track Field");
        //click on track button
        Reusable_Actions_Loggers.clickMethod(driver,"//*[class='button tracking-btn']",logger,"Track Button");


    }//end of test





}
