package myrunner;

import Utils.ConfigReader;
import com.google.common.collect.ClassToInstanceMap;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import stepDefinition.TestSteps;


import java.io.File;
import java.io.FileReader;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/easwarimuthu/IdeaProjects/CucumberWBQA/src/main/java/Features/login.feature"
        ,glue = {"stepDefinition"}
        ,dryRun = true
       // ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
        ,plugin = {"pretty","html:target/cucumber"}
        ,monochrome = true
)

public class TestRunner {
 /* @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("/Users/easwarimuthu/IdeaProjects/CucumberWBQA/Configs/extent-config.xml");

    }*/



}