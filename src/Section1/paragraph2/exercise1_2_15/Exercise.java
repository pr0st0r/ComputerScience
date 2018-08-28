package Section1.paragraph2.exercise1_2_15;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Напшите программу, которая получает три положительных числа в
 * аргументах командной строки и выводит false, если одно из них больше или равно сумме
 * других, или true в противном случае.
 * */
public class Exercise {
    public static void main(String[] args){
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(ExerciseTest.class);
        System.out.println("Тестов запущено: " + result.getRunCount());
        System.out.println("Проваленных тестов: " + result.getFailureCount());
        System.out.println("Тест успешен: " + result.wasSuccessful());

        System.out.println(getResult(args[0],args[1],args[2]));
    }

    public static boolean getResult(String a, String b, String c){
       return !(Integer.parseInt(a) >= Integer.parseInt(b) + Integer.parseInt(c)
               || Integer.parseInt(b) >= Integer.parseInt(a) + Integer.parseInt(c)
               || Integer.parseInt(c) >= Integer.parseInt(a) + Integer.parseInt(b));
    }
}
