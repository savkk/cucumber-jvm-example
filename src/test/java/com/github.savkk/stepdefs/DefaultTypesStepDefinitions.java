package com.github.savkk.stepdefs;

import cucumber.api.java.ru.Допустим;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class DefaultTypesStepDefinitions {

    @Допустим("передадим в метод шага целое число {int}")
    public void giveInt(Integer int1) {
        System.out.println(int1);
    }

    @Допустим("передадим в метод шага {string}")
    public void giveString(String string) {
        System.out.println(string);
    }

    @Допустим("передадим в метод шага {word}")
    public void giveWord(String string) {
        System.out.println(string);
    }

    @Допустим("передадим в метод шага BigInteger {biginteger}")
    public void giveWord(BigInteger integer) {
        System.out.println(integer);
    }

    @Допустим("Hello, world(s)!")
    public void getHello() {
        System.out.println("Hello world!");
    }

    @Допустим("основной/альтернативный текст")
    public void getAlternative() {
        System.out.println("Hello world!");
    }

    @Допустим("передадим в метод коллекцию строк")
    public void передадим_в_метод_коллекцию_строк(List<String> dataTable) {
        System.out.println(dataTable);
    }

    @Допустим("передадим в метод ассоциативный массив")
    public void передадим_в_метод_ассоциативный_массив(Map<String, String> dataTable) {
        System.out.println(dataTable);
    }
}
