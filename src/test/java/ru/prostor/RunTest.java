package ru.prostor;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import ru.prostor.paragraph_2.Exercise_15_test;

/**
 * Класс для запусков тестов
 */
public class RunTest {

    public static void main(String[] args){
        RunTest.run(Exercise_15_test.class);
    }

    public static void run(Class<?>... classes) {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(classes);
        System.out.println("Тестов запущено: " + result.getRunCount());
        System.out.println("Проваленных тестов: " + result.getFailureCount());

        if ( result.getFailureCount() > 0)
            result.getFailures().forEach(elem -> System.out.println(elem.getMessage()));

        System.out.println("Общий статус: " + result.wasSuccessful());
    }
}
