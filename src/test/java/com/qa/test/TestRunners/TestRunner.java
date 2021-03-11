package com.qa.test.TestRunners;
import com.qa.web.driverclass.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
         //   plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
            features = {"src/test/java/com/qa/test/featurefile"},
           // publish = true,
           // format = { "json:target/cucumber-json-report.json",	"html:target/cucumber-report-html" },
            glue = {"com.qa.test.stepdefs"},
           // stepNotifications = true,
            dryRun = false,
            tags = "@system"
            )

    public class TestRunner {

        static final Logger logger = Logger.getLogger(TestRunner.class);

        @BeforeClass
        public static void setUp() {
            BaseClass.initializeBrowser();

        }


        @AfterClass
        public static void tearDown(){
            BaseClass.tearDown();
        }

    }



