package ru.prostor.examples;

/**
 * Преобразование в двоичную форму
 * Программа получает положительное целое число n в аргументе
 * командной строки и выводит двоичное представление n методом проверки степеней 2
 * в порядке убывания
 * */
public class Binary {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int power = 1;
        while (power <= n/2) power = 2 * power;
        // Теперь power содержит наибольшую степень 2 <= n.
        while (power > 0){
            //Вывод степеней 2 по убыванию
            if (n < power) {
                System.out.print(0);
            }else{
                System.out.print(1);
            }
            power /= 2;
        }
        System.out.println();
    }
}
