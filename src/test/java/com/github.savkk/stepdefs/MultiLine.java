package com.github.savkk.stepdefs;

import cucumber.api.java.ru.Допустим;

public class MultiLine {
    @Допустим("выведется на консоль стихотворение Аркадия Кутилова - Ракета с именем Беда или когда мой сын станет диктатором")
    public void kutilovForever(String poem) {
        System.out.println(poem);
    }
}
