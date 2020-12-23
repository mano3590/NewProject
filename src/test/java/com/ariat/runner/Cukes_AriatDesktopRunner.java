package com.ariat.runner;

import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.io.File;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 0, //To rerun the scenario , if the scenario fails
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        //coverageReport = true,
        screenShotLocation="ScreenShots/",
        screenShotSize="300px",
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },
        outputFolder = "target/")

@CucumberOptions
        (
                plugin = {"html:target/cucumber-html-report","json:target/cucumber.json", "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml", "com.cucumber.listener.ExtentCucumberFormatter:target/CucumberExtentReport.html"},
                features = { "./src/test/resources/" },
                glue = { "com.ariat.steps","com.ariat.runner"},
                tags = {"@TC_ReviewYourOrder_01"},
                monochrome = false,
                dryRun = false //To generate the steps that are not implemented
        )


public class Cukes_AriatDesktopRunner {

    @AfterClass
    public static void setup() {

        Reporter.loadXMLConfig(new File("./src/main/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
