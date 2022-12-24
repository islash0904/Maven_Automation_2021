package Day14_012322;

import Day9_010822.Reusable_Action;
import Hulu.BaseClass_2;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu_POM extends Reusable_Annotations {


    @Test
            public void Verify_Huu_Tabs(){


        ArrayList<String> emails = new ArrayList<>();

        emails.add("sandths987675433874487@gmail.com");
        emails.add("giveugf998787565439687@gmail.com");


        ArrayList<String> passwords = new ArrayList<>();

        passwords.add("123456");
        passwords.add("678910");



        ArrayList<String> Names = new ArrayList<>();

        Names.add("Tim");
        Names.add("Horton");


        ArrayList<String> birthMonth = new ArrayList<>();

        birthMonth.add("December");
        birthMonth.add("October");


        ArrayList<String> birthDay = new ArrayList<>();

        birthDay.add("17");
        birthDay.add("16");


        ArrayList<Integer> birthYear = new ArrayList<>();

        birthYear.add(1985);
        birthYear.add(1975);


        ArrayList<String> gender = new ArrayList<>();

        gender.add("Male");
        gender.add("Female");



            //Navigate to hulu.com
            driver.navigate().to("https://www.hulu.com");

            //Verify title 'Streams TV and Movies'
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Stream TV and Movies")) {
                System.out.println("Title matches as 'Stream TV and Movies Live and Online | Hulu'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//

            //Scroll to the view by pixels
            Reusable_Action.scrollMethod(driver, "0", "3250", "scroll");



            logger.log(LogStatus.INFO, "Navigating to Hulu home page");
            driver.navigate().to("https://www.hulu.com");

            BaseClass_2.homePage_2().SelectButton();

            BaseClass_2.create_your_account_2().Emails("sandths9876655647654487@gmail.com");

            BaseClass_2.create_your_account_2().PassWords("876345");

            BaseClass_2.create_your_account_2().Names("JOhn");

            BaseClass_2.create_your_account_2().ClickMonth();

            BaseClass_2.create_your_account_2().SelectMonth("October");

            BaseClass_2.create_your_account_2().ClickBirthDay();

            BaseClass_2.create_your_account_2().SelectBirthDay("17");

            BaseClass_2.create_your_account_2().ClickbirthYear();

            BaseClass_2.create_your_account_2().SelectBirthYear("1998");

            BaseClass_2.create_your_account_2().ClickGender();

            BaseClass_2.create_your_account_2().Selectgender("Male");

            BaseClass_2.create_your_account_2().ContinueButton();

            BaseClass_2.amount_page3().SubsriptionAmount();

            BaseClass_2.amount_page3().Totalaount();

            BaseClass_2.log_in().login();

            BaseClass_2.log_in().EmailId();

            BaseClass_2.log_in().code();

            BaseClass_2.log_in().loginAccount();

            BaseClass_2.userName().UserName("Gladiator");



            //Billing Page
            String MonthlyResult = BaseClass_2.amount_page3().SubsriptionAmount();
            System.out.println("My subscription monthly is " + MonthlyResult);

            String DueResult = BaseClass_2.amount_page3().Totalaount();
            System.out.println("My result is " + DueResult);

            driver.manage().deleteAllCookies();



    }//end ofn test




}//end of class
