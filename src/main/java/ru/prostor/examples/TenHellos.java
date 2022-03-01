package ru.prostor.examples;

/**
 * Первый цикл while
 * */
public class TenHellos {
    public static void main(String[] args){
        System.out.println("1st Hello");
        System.out.println("2st Hello");
        System.out.println("3st Hello");
        int i = 4;
        while(i <= 10){
            System.out.println(i + "st Hello");
            i = i + 1;
        }
    }
}
