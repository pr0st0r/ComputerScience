package ru.prostor.examples;

/**
 * Программа получает целое число в аргументах командной строки и выводит таблицу степеней
 * 2 впроть до 2^n. При каждом проходе цикла программа увеличивает значение i и удваивает значение power
 * */
public class PowersOfTwo {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int power = 1;
        int i = 0;
        while(i <= n){
            System.out.println(i + " " + power);
            power = 2 * power;
            i = i + 1;
        }
    }
}
