package ru.prostor.sections.section_1.paragraph_2;

/**
 * Напишите программу, которая получает два целых числа a и b
 * в аргументах командной строки и выводит случайное целое число из деапазона от a до b включительно
 * */
public class Exercise_19 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int randomNum = a + (int)(Math.random()*(b - a));
        System.out.println(randomNum);
    }
}
