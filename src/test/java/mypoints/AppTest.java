package mypoints;



import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.Form1;
import pageObject.MainPage;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    private WebDriver driver;
    MainPage mainPage;
    Form1 form1;



    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        mainPage = PageFactory.initElements(driver, MainPage.class);
        form1 = PageFactory.initElements(driver, Form1.class);
    }

    @Test
    public void MainSuite() throws Exception {
        driver.get("https://www.mypoints.com/");
        Assert.assertTrue(mainPage.joinNowBtn.isDisplayed());
        mainPage.joinNow();
        Assert.assertTrue(form1.continueBtn.isDisplayed());

    }

    @After
    public void tearDown() {
        driver.quit();
    }


}


