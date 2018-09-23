package com.github.savkk.stepdefs;

import com.github.savkk.pojo.User;
import cucumber.api.java.ru.Допустим;

import java.util.List;

public class CustomDataTableParameterTypeStepDefinitions {

    @Допустим("у нас есть пользователи")
    public void у_нас_есть_пользователи(List<User> users) {
        System.out.println(users);
    }
}
