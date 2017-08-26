package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Form1 {

    //Input fields form #1
    @FindBy(how= How.ID,using="email")
    public WebElement emailField;

    @FindBy(how= How.ID,using="password1")
    public WebElement passwordField;

    //Buttons form #1
    @FindBy(how= How.CSS,using=".regForm-continue.btn.btn-primary")
    public WebElement continueBtn;

    //Links form #1
    @FindBy(how= How.CSS,using=".loginModal.hidden-xs")
    public WebElement signIn;

    //Tooltips form #1
    @FindBy(how= How.XPATH,using=".//*[@id='tooltip705014']/div[2]")
    public WebElement emailTooltip;

    @FindBy(how= How.XPATH,using=".//*[@id='tooltip721574']/div[2]")
    public WebElement passwordTooltip;

    //Actions
    public void registration1stStep (String email, String password) {
    emailField.clear();
    emailField.sendKeys(email);
    passwordField.clear();
    passwordField.sendKeys(password);
    continueBtn.click();
    }


}
