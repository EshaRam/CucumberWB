package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SchedulePage {

    WebDriver driver;

    @FindBy(how = How.CSS, using = ".heading-title.pull-left")
    WebElement schedule;

    @FindBy(how =How.CSS, using = "[class] #Calendar .text-highlight")
    WebElement calendar;

    public SchedulePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String scheduleTitle() {
        driver.findElement(By.linkText("SCHEDULE")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return schedule.getText();

    }
    public String calendar(){
        driver.findElement(By.linkText("SCHEDULE")).click();
        return calendar.getText();
    }


}
