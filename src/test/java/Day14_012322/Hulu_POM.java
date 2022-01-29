package Day14_012322;

import Hulu.BaseClass_2;
import Reusable_Library.Reusable_Annotation;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu_POM extends Reusable_Annotation {


    @Test
            public void Verify_Huu_Tabs(){


        ArrayList<String> emails = new ArrayList<>();

        emails.add("sandths987678765874487@gmail.com");
        emails.add("giveugf998787556075678 9687@gmail.com");


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

        for (int i = 0; i < emails.size(); i++) {


            logger.log(LogStatus.INFO, "Navigating to Hulu home page");
            driver.navigate().to("https://www.hulu.com");

            BaseClass_2.homePage_2().SelectButton();

            BaseClass_2.create_your_account_2().Emails("andths987678765874487@gmail.com");

            BaseClass_2.create_your_account_2().PassWords("123456");

            BaseClass_2.create_your_account_2().Names("Tim");

            BaseClass_2.create_your_account_2().ClickMonth();

            BaseClass_2.create_your_account_2().SelectMonmth();

            BaseClass_2.create_your_account_2().ClickBirthDay();

           // BaseClass_2.create_your_account_2().SelectBirthDay();

            BaseClass_2.create_your_account_2().ClickbirthYear();

            BaseClass_2.create_your_account_2().SelectBirthYear();

            BaseClass_2.create_your_account_2().ClickGender();

            BaseClass_2.create_your_account_2().Selectgender();

            BaseClass_2.create_your_account_2().ContinueButton();

            BaseClass_2.amount_page3().SubsriptionAmount();

            BaseClass_2.amount_page3().Totalaount();

            BaseClass_2.log_in().login();

            BaseClass_2.log_in().EmailId();

            BaseClass_2.log_in().code();

            BaseClass_2.log_in().loginAccount();

            BaseClass_2.userName().userName();


        }


    }//end ofn test




}//end of class
