package ru.prostor.sections.section_1.paragraph_2;

/**
 * Напишите программу, которая получает два целых числа m и d в аргументах
 * командной строки и выводит true, если день d месяца m лежит в диапазоне
 * от 20/03 до 20/06, или false в противном случае
 * */
public class Exercise_23 {
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean res = m > 3 && m < 6
                || m == 3 && d >= 20
                || m == 6 && d <= 20;
        System.out.println(res);
    }
}
