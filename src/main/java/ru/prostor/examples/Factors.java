package ru.prostor.examples;

/**
 * Разложение целых чисел на простые множители
 * Программа получает положительное целое число N  в аргументе командной строки
 * и выводит его разложение на простые множители. Код простой, но его правильность
 * не столь очевидна
 * */
public class Factors {
    public static void main(String[] args){
        long n = Long.parseLong(args[0]);
        for(long factor = 2; factor <= n/factor; factor++){
            while(n % factor == 0){
                n /= factor;
                System.out.print(factor + " ");
            }
        }
        if(n > 1) System.out.print(n);
        System.out.println();
    }
}
