package stepDefinition;

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
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageSteps {
    WebDriver driver;
    @Before

    public void setUp(){
        ConfigReader configReader = new ConfigReader();
        driver = configReader.getWebdriver();


    }

    @Given("^I'm on homepage$")
    public void i_m_on_homepage() throws Throwable {

            ConfigReader configReader = new ConfigReader();
            driver.get(configReader.getApplicationUrl());
    }



    @When("^counts the number of slider images$")
    public int counts_the_number_of_slider_images() throws Throwable {
        List<WebElement> images = driver.findElements(By.className(".flex-caption"));
        return images.size();
    }

    @Then("^assert if its correct$")
    public void assert_if_its_correct() throws Throwable {
        Assert.assertEquals(counts_the_number_of_slider_images(),6);
    }
    @When("^locate the logo$")
    public boolean locate_the_logo() throws Throwable {

        WebElement logo = driver.findElement(By.id("logo"));
        return logo.isDisplayed();
    }

    @Then("^assert if its present$")
    public void assert_if_its_present() throws Throwable {
        Assert.assertEquals(locate_the_logo(),true);

    }
    @When("^locate the link in footer$")
    public String  locate_the_link_in_footer() throws Throwable {
        WebElement footerlink =driver.findElement(By.linkText("www.whitebox-learning.com"));
        return footerlink.getText();
    }

    @Then("^assert footer link$")
    public void assert_footer_link() throws Throwable {

        Assert.assertEquals(locate_the_link_in_footer(),"www.whitebox-learning.com");

    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            ScreenshotUtil.takescreenshot(scenario.getName(),driver);
        }


        driver.quit();
    }


}
