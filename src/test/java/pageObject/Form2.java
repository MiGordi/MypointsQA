package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Form2 {


    //Gender buttons form #2
    @FindBy(how = How.CSS, using = ".male-icon")
    public WebElement maleBtn;

    @FindBy(how = How.CSS, using = ".female-icon")
    public WebElement femaleBtn;

    //Input fields form #2
    @FindBy(how = How.CSS, using = "#fullName")
    public WebElement fullNameField;

    @FindBy(how = How.CSS, using = "#birthDateMonth")
    public WebElement monthField;

    @FindBy(how = How.CSS, using = "#birthDateDay")
    public WebElement dayField;

    @FindBy(how = How.CSS, using = "#birthDateYear")
    public WebElement yearField;

    @FindBy(how = How.CSS, using = "#address.postalCoder")
    public WebElement zipCode;

    //Buttons form #2
    @FindBy(how = How.CSS, using = "#f_submit")
    public WebElement joinNowBtn;

    //Links form #2
    @FindBy(how = How.XPATH, using = ".//*[@id='regForm']/div[2]/p/a[1]")
    public WebElement termsOfService;

    @FindBy(how = How.XPATH, using = ".//*[@id='regForm']/div[2]/p/a[2]")
    public WebElement privacyPolicy;

    //Actions
    public void registsration2ndStep(String email, String password) {
        maleBtn.click();
        femaleBtn.click();
//        emailField.sendKeys(email);
//        passwordField.clear();
//        passwordField.sendKeys(password);
//        continueBtn.click();

    }

}


