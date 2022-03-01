package ru.prostor.sections.section_1.paragraph_1;

/**
 * Модифицируйте прошрамму UseArgument.java - создайте на её основе программу UseThree.java.
 * Новая программа должна получать три имени в аргументах командной строки и выводить предложение,
 * в котором эти имена перечисляются в обратном порядке.
 * */
public class Exercise_6 {
    public static void main(String[] args){
        System.out.print("Hi ");
        System.out.print(args[2] + ", ");
        System.out.print(args[1]+ ", and ");
        System.out.print(args[0] + ".");
    }
}
