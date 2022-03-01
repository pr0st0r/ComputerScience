package ru.prostor.sections.section_1.paragraph_2;

/**
 * Предположим, a и b - переменные типа int.
 * Что делает следующая последовательность команд?
 * int t = a; b = t; a = b;
 * */
public class Exercise_1 {
    // Присваивается всем переменным значение a
    public static void main(String[] args){
        int a = 2;
        int b = 6;
        int t = a; //2
        b = t; // 2
        a = b; // 2

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("t = " + t);
    }
}
