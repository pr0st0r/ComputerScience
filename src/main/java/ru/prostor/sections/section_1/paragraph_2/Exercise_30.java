package ru.prostor.sections.section_1.paragraph_2;

/**
 * Случайные числа с равномерным распределением. Напишите программу, которая выводит
 * пять слуяайных чисел с равномерным распределением в диапозоне
 * от 0 до 1, их среднее арифметическое, минимальное и максимальное значение.
 * Используйте методы Math.random(), Math.min(), Math.max().
 * */
public class Exercise_30 {
    public static void main(String[] args){
        double a1 = Math.random();
        double a2 = Math.random();
        double a3 = Math.random();
        double a4 = Math.random();
        double a5 = Math.random();

        double averageValue = (a1 + a2 + a3 + a4 + a5) / 5;
        double max = Math.max(a1, Math.max(a2, Math.max(a3, Math.max(a4, a5))));
        double min = Math.min(a1, Math.min(a2, Math.min(a3, Math.min(a4, a5))));

        System.out.println("a1 = " + a1 + ", "
                + "a2 = " + a2 + ", "
                + "a3 = " + a3 + ", "
                + "a4 = " + a4 + ", "
                + "a5 = " + a5 + ".");
        System.out.println("Среднее = " + averageValue);
        System.out.println("Максимальное = " + max);
        System.out.println("Минимальное = " + min);
    }
}
