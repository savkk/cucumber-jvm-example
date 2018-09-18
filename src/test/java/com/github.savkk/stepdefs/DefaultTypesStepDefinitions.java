package com.github.savkk.stepdefs;

import cucumber.api.java.ru.��������;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class DefaultTypesStepDefinitions {

    @��������("��������� � ����� ���� ����� ����� {int}")
    public void giveInt(Integer int1) {
        System.out.println(int1);
    }

    @��������("��������� � ����� ���� {string}")
    public void giveString(String string) {
        System.out.println(string);
    }

    @��������("��������� � ����� ���� {word}")
    public void giveWord(String string) {
        System.out.println(string);
    }

    @��������("��������� � ����� ���� BigInteger {biginteger}")
    public void giveWord(BigInteger integer) {
        System.out.println(integer);
    }

    @��������("Hello, world(s)!")
    public void getHello() {
        System.out.println("Hello world!");
    }

    @��������("��������/�������������� �����")
    public void getAlternative() {
        System.out.println("Hello world!");
    }

    @��������("��������� � ����� ��������� �����")
    public void ���������_�_�����_���������_�����(List<String> dataTable) {
        System.out.println(dataTable);
    }

    @��������("��������� � ����� ������������� ������")
    public void ���������_�_�����_�������������_������(Map<String, String> dataTable) {
        System.out.println(dataTable);
    }
}
