package Section1.paragraph2.exercise1_2_14;

/**
 * Напишите программу, которая получает два положительных числа в аргументах
 * командной строки и выводит true, если одно из этих чисел нацело делиться на другое.
 * */
public class Exercise {
    public static void main(String[] args){
        System.out.println(getresult(args[0], args[1]));
    }

    public static boolean getresult(String a, String b){
        return Integer.parseInt(a) % Integer.parseInt(b) == 0 || Integer.parseInt(b) % Integer.parseInt(a) == 0;
    }
}
