package ru.prostor.sections.section_1.paragraph_2;

/**
 * Напшите программу, которая получает три положительных числа в
 * аргументах командной строки и выводит false, если одно из них больше или равно сумме
 * других, или true в противном случае.
 * */
public class Exercise_15 {
    public static boolean getResult(String a, String b, String c){
        return !(Integer.parseInt(a) >= Integer.parseInt(b) + Integer.parseInt(c)
                || Integer.parseInt(b) >= Integer.parseInt(a) + Integer.parseInt(c)
                || Integer.parseInt(c) >= Integer.parseInt(a) + Integer.parseInt(b));
    }
}
