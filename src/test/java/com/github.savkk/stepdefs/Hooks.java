package com.github.savkk.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.ru.Ктомуже;

public class Hooks {
    private static int count;

    @Ктомуже("Первый/Второй/Третий шаг")
    public void empty() {
        System.out.println(++Hooks.count);
    }

    @Before(value = "(@hooks or @only_scenario_hooks) and not @only_step_hooks")
    public void before() {
        System.out.println(count + " before scenario");
    }

    @AfterStep(value = "not(@hooks or @only_scenario_hooks) and @only_step_hooks")
    public void afterStep() {
        System.out.println(count + " after step");
    }

    @BeforeStep(value = "@only_step_hooks")
    public void beforeStep() {
        System.out.println(count + " before step");
    }

    @After(value = "@hooks or @only_scenario_hooks")
    public void after() {
        System.out.println(count + " after scenario");
    }
}
