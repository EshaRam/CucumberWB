package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverUtil {



    public static WebDriver getDriver(String browserName){

        WebDriver driver;

        switch (browserName){

            case "chrome":

                System.setProperty("webdriver.chrome.driver","/Users/easwarimuthu/IdeaProjects/CucumberWBQA/src/main/resources/chromedriver");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver","/Users/easwarimuthu/IdeaProjects/CucumberWBQA/src/main/resources/geckodriver");
                driver = new FirefoxDriver();

            default:
                System.setProperty("webdriver.chrome.driver","/Users/easwarimuthu/IdeaProjects/CucumberWBQA/src/main/resources/chromedriver");
                driver = new ChromeDriver();
                break;

        }
        return driver;



    }
}
