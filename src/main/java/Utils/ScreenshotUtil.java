package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static void takescreenshot(String filename, WebDriver driver) {

        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileHandler.copy(f, new File("/Users/easwarimuthu/IdeaProjects/CucumberWBQA/logs/Screenshots/" + filename + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}