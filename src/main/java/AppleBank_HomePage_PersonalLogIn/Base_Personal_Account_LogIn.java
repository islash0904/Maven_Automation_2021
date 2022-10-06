package AppleBank_HomePage_PersonalLogIn;

import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Personal_Account_LogIn extends Reusable_Annotations {

    public Base_Personal_Account_LogIn(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public static Apple_Account_LogIn apple_account_logIn(){
        Apple_Account_LogIn apple_account_logIn = new Apple_Account_LogIn(driver);
        return apple_account_logIn;
    }

    public static Personal_LogIn personal_logIn() {
        Personal_LogIn personal_logIn = new Personal_LogIn(driver);
        return personal_logIn;
    }

    public static Apple_UserID apple_userID(){
        Apple_UserID apple_userID = new Apple_UserID(driver);
        return apple_userID;
    }



}//end of base class
