package com.github.savkk.stepdefs;

import com.github.savkk.pojo.User;
import cucumber.api.java.ru.��������;

import java.util.List;

public class CustomDataTableParameterTypeStepDefinitions {

    @��������("� ��� ���� ������������")
    public void �_���_����_������������(List<User> users) {
        System.out.println(users);
    }
}
