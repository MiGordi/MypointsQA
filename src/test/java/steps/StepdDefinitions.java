package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mypoints.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.Form1;
import pageObject.MainPage;

import java.util.concurrent.TimeUnit;

public class StepdDefinitions {

    /*public WebDriver driver;
    MainPage mainPage;
    Form1 form1;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        mainPage = PageFactory.initElements(driver, MainPage.class);
        form1 = PageFactory.initElements(driver, Form1.class);
    }*/

    private Driver driver = new Driver();
    private MainPage mainPage;
    private Form1 form1;

    public StepdDefinitions() {
        mainPage = PageFactory.initElements(driver, MainPage.class);
        form1 = PageFactory.initElements(driver, Form1.class);
    }






    @Given("^I navigate to main page$")
    public void iNavigateToMainPage() {


        driver.get("https://www.mypoints.com/");

    }

    @When("^I click 'join now' button$")
    public void iClickJoinNowButton() {
        mainPage.joinNowClick();
    }

    @Then("^I see 'Continue' button$")
    public void iSeeContinueButton() {
        boolean ololo = form1.continueBtn.isDisplayed();
        Assert.assertTrue(ololo);
    }
}
