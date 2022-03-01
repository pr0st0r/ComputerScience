package ru.prostor.sections.section_1.paragraph_2;

/**
 * Случайные числа с гауссовским (нормальным) распределением. Напишите программу RandomGaussian
 * Для вывода случайного числа r из гауссовского распределения. Для этого можно воспользоваться
 * формулой Бокса - Мюллера r = sin(2*pi*v)(-2lnu)^1/2, где u и v - вещественные числа в диапазоне
 * от 0 до 1, сгенерированные методом Math.random().
 * */
public class Exercise_27 {
    public static void main(String[] args){
        double v = Math.random();
        double u = Math.random();

        double r = Math.sin(2 * Math.PI * v) * Math.pow(-2 * Math.log10(u),0.5);
        System.out.println(r);
    }
}
