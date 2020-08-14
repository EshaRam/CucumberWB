package stepDefinition;

import Pages.SchedulePage;
import Utils.ConfigReader;
import Utils.ScreenshotUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SchedulePageSteps {

    WebDriver driver;
    @Before

    public void setUp(){
        ConfigReader configReader = new ConfigReader();
        driver = configReader.getWebdriver();


    }
    @Given("^going to homepage$")
    public void going_to_homepage() throws Throwable {
        ConfigReader configReader = new ConfigReader();
        driver.get(configReader.getApplicationUrl());
    }

    @When("^navigate to schedulePage$")
    public void navigate_to_schedulePage() throws Throwable {

        driver.findElement(By.linkText("SCHEDULE")).click();

    }

    @Then("^check the schedule title$")
    public String  check_the_schedule_title() throws Throwable {
        SchedulePage sp = new SchedulePage(driver);
       return sp.scheduleTitle();

    }

    @Then("^assert schedule title$")
    public void   assert_schedule_title() throws Throwable {
       Assert.assertEquals(check_the_schedule_title(),"Schedule");

    }

    @Then("^check the calendar and assert it$")
    public void check_the_calendar_and_assert_it() throws Throwable {
        SchedulePage sp = new SchedulePage(driver);
        String name = sp.calendar();
        Assert.assertEquals(name, "Calendar");

    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            ScreenshotUtil.takescreenshot(scenario.getName(),driver);
        }


        driver.quit();
    }



}
