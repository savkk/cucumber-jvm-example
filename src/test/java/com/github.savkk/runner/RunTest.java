package com.github.savkk.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        glue = "com.github.savkk.stepdefs",
        features = "src/test/resources/features"
//        tags = "@all"
)
//public class RunTest extends AbstractTestNGCucumberTests { // для запуска через TestNG
@RunWith(Cucumber.class) // для запуска через JUnit
public class RunTest {
}
