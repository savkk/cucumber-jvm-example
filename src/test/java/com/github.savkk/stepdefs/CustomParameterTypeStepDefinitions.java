package com.github.savkk.stepdefs;

import cucumber.api.java.ru.��������;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomParameterTypeStepDefinitions {

    @��������("��������� � ����� ���� {localdate}")
    public void ���������_�_�����_����(LocalDate localdate) {
        System.out.println(localdate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
