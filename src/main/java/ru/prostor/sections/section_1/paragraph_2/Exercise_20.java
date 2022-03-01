package ru.prostor.sections.section_1.paragraph_2;

/**
 * Напишите программу, которая выводит сумму двух случайных чисел от 1 до 6.
 * */
public class Exercise_20 {
    public static void main(String[] args){
        int a = 1 + (int)(Math.random() * 5);
        int b = 1 + (int)(Math.random() * 5);
        System.out.println(a + b);
    }
}
