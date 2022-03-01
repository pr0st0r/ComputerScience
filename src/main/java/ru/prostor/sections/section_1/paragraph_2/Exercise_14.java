package ru.prostor.sections.section_1.paragraph_2;

/**
 * Напишите программу, которая получает два положительных числа в аргументах
 * командной строки и выводит true, если одно из этих чисел нацело делиться на другое.
 * */
public class Exercise_14 {
    public static boolean getResult(String a, String b){
        return Integer.parseInt(a) % Integer.parseInt(b) == 0
                || Integer.parseInt(b) % Integer.parseInt(a) == 0;
    }
}
