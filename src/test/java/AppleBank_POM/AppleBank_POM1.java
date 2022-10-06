package AppleBank_POM;

import Day9_010822.Reusable_Action;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class AppleBank_POM1 extends Reusable_Annotations {


    @Test
    public void Log_into_Personal_Account () {
        logger.log(LogStatus.INFO,"Logging into Personal Account ");
        driver.navigate().to("https://www.applebank.com");

        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Apple Bank|New York Bank|Personal & Business Banking"))

        Reusable_Action.scrollMethod(driver,"450", "0", "Scroll");





    }








}
