package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhiteboxQA {

    public void login(){

        System.setProperty("webdriver.chrome.driver","/Users/easwarimuthu/IdeaProjects/CucumberWBQA/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://whiteboxqa.com/index.php");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("username")).sendKeys("easwari.theetha@gmail.com");
        driver.findElement(By.id("password")).sendKeys("blahblah");
        driver.findElement(By.id("login")).click();
        System.out.println("you have not registered");

    }
}
