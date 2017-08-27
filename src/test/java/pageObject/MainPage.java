package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class MainPage {

    //Buttons
    @FindBy(how= How.CSS,using="#survey-begin-link")
    public WebElement joinNowBtn;

    //Actions
    public void joinNowClick()
    {
        joinNowBtn.click();
    }


}

