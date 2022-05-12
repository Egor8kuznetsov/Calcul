package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.util.Scanner;

public class StepDefinitions {

    int a;
    int b;
    int res;
    Scanner scanner = new Scanner(System.in);

    @Дано("^два числа")
    public void given() {
        a = 3;
        b = 2;
    }

    @Когда("^считаем сумму")
    public void when() {

        res = a + b;
    }

    @Тогда("^выводим результат")
    public void then(){
        System.out.println("res = " + res);
    }

}

