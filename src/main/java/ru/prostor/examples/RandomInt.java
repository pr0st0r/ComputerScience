package ru.prostor.examples;

/**
 * Программа генерирует случайное число r в диапозоне от 0.0 до 1.0.
 * Затем к умножается на аргумент командной строки n
 * для получения случайного числа, большего или равного 0 и меньшего n;
 * далее преобразование типа усекается до целого значения.
 * */
public class RandomInt {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double r = Math.random(); // Равномерное распределение от 0.0 до 1.0
        int value = (int)(r * n); // Равномерное распределение от 0 до n - 1
        System.out.println(value);
    }
}
