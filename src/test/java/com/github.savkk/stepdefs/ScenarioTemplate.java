package com.github.savkk.stepdefs;

import cucumber.api.java.ru.Допустим;
import org.junit.Assert;

public class ScenarioTemplate {
    @Допустим("{int} умножаем на {int} получаем {int}")
    public void множительУмножаемНаМножительПолучаемРезультат(int arg0, int arg1, int arg2) {
        Assert.assertEquals(arg2, arg0 * arg1);
    }

}
