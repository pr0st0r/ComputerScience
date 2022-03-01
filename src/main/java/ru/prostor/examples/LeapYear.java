package ru.prostor.examples;

/**
 * программа проверяет, что целое число представляет високосный год
 * по григорианскому календарю.Год является високосным, если он
 * нацело делиться на 4, но при этом не делится нацело на 100;
 * впрочем, если при этом год делиться нацело на 400, он всё же является
 * високосным.
 * */
public class LeapYear {
    public static void main(String[] args){
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);
    }
}
