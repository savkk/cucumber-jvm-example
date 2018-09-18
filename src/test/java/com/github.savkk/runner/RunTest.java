package com.github.savkk.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        glue = "com.github.savkk.stepdefs",
        features = "src/test/resources/features"
//        tags = "@all"
)
//public class RunTest extends AbstractTestNGCucumberTests { // ��� ������� ����� TestNG
@RunWith(Cucumber.class) // ��� ������� ����� JUnit
public class RunTest {
}
