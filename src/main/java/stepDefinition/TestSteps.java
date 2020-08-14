package stepDefinition;

import Utils.ConfigReader;
import Utils.ScreenshotUtil;
import Utils.WebdriverUtil;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;

import java.util.List;

public class TestSteps {

    WebDriver driver;


    @Before

    public void setUp(){
        ConfigReader configReader = new ConfigReader();
        driver = configReader.getWebdriver();


    }

    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {

        ConfigReader configReader = new ConfigReader();
        driver.get(configReader.getApplicationUrl());
    }

    @When("^user navigate to login page$")
    public void user_navigate_to_login_page() throws Throwable {
        driver.findElement(By.linkText("Login")).click();

    }

    @When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and(String arg1, String arg2) throws Throwable {
        driver.findElement(By.id("username")).sendKeys(arg1);
        driver.findElement(By.id("password")).sendKeys(arg2);


    }

    @Then("^message displayed wrong$")
    public void message_displayed_wrong() throws Throwable {
        driver.findElement(By.id("login")).click();
        System.out.println("you have not registered");

    }


    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            ScreenshotUtil.takescreenshot(scenario.getName(),driver);
        }


        driver.quit();
    }

}
