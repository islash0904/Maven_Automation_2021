package Hulu;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Your_Account_2 extends Reusable_Annotations {


    ExtentTest logger;
    public Create_Your_Account_2(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method


//define all webelement on this page
    @FindBy(xpath = "//*[@id='email']")
    WebElement Emails;

    @FindBy(xpath = "//*[@id='password']")
    WebElement PassWords;
    @FindBy(xpath = "//*[@id='firstName']")
    WebElement Names;
    @FindBy(xpath = "//*[@class = 'selector-selected input__text placeholder']")
    WebElement Month;
    @FindBy(xpath = "//*[@id='birthdayMonth-menu']")
    WebElement birthMonth;
    @FindBy(xpath = "//*[@class = 'selector-selected input__text placeholder']")
    WebElement birthDay;
    @FindBy(xpath = "//*[@id='birthdayDay-menu']")
    WebElement BirthDay;
    @FindBy(xpath = "//*[@class = 'selector-selected input__text placeholder']")
    WebElement birthYear;
   @FindBy(xpath = "//*[@id = 'birthdayYear-menu']")
    WebElement BirthYears;
    @FindBy(xpath = "//*[@class='selector-selected input__text placeholder']")
    WebElement Gender;
    @FindBy(xpath = "//*[@id='gender-menu']")
    WebElement genders;
    @FindBy(xpath = "//*[@class='button button--continue ']")
    WebElement ContinueButton;

    public void Emails(String userData) {

        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Emails,userData,logger,"Email");
    }
    public void PassWords(String userData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, PassWords,userData,logger,"Password");
    }

    public void Names(String userData) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, Names, userData,logger, "Names");
    }

    public void ClickMonth() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,Month,logger,"birthMonth");

    }

    public void SelectMonth(String userData){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,birthMonth,logger,userData,"birthmonth");
    }

    public void ClickBirthDay() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, birthDay, logger, "birthDay");
    }

    public void SelectBirthDay(String userdata){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,BirthDay,logger,userdata,"birthday");
    }



    public void ClickbirthYear(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,birthYear,logger,"birthYear");
    }//

    public void SelectBirthYear(String userData){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,BirthYears,logger,userData,"birthyear");
   }//



    public void ClickGender(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Gender,logger,"Gender");
    }//

    public void Selectgender(String userData){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,genders,logger,userData,"gender ");

    }//

public void ContinueButton(){

        Reusable_Actions_Loggers_POM.clickMethod(driver,ContinueButton,logger,"Continue");
}//




}
