package Brokerage_Trading_2nd_TestCase;

import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage5_Brokerage_Trading_Create_Account  extends Reusable_Annotations {

    ExtentTest logger;
    public HomePage5_Brokerage_Trading_Create_Account(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//

    //define all the webelemnt on this page
    @FindBy( xpath = "//*[@class= 'sdps-input']")
    WebElement FirstName;
    @FindBy(xpath = "//*[class='sdps-input']")
    WebElement MiddleName;
    @FindBy(xpath = "//*[@id='lastname-input']")
    WebElement LastName;
    @FindBy(xpath = "//*[@class='sdps-dropdown__select']")
    WebElement Suffix;
    @FindBy(xpath = "//*[@aria-label='PHD']")
    WebElement PHD;
    @FindBy(xpath = "//*[@id='isdomesticyes-radio-id']")
    WebElement Current_Home_Address;
    @FindBy(xpath = "//*[@class='sdps-datepicker__backdrop']")
    WebElement Date_Of_Birth;
    @FindBy(xpath = "//*[@class='sdps-dropdown__select']")
    WebElement Month;
    @FindBy(xpath = "//*[@id='datepicker-day-button-6-3']")
    WebElement Day;
    @FindBy(xpath = "//*[@aria-labelledby='datepicker-year-select']")
    WebElement Year;
    @FindBy(xpath = "//*[@class='sdps-input']")
    WebElement Social_Security_Number;
    @FindBy(xpath = "//*[@id='email-input']")
    WebElement Email;
    @FindBy(xpath = "//*[@id='phonenumber-input']")
    WebElement Phone_Number;
    @FindBy(xpath = "//*[@class='sdps-button sdps-button--fluid sdps-button--primary']")
    WebElement Continue_Button;




}
