package ru.prostor.examples;

/**
 * Получаем значение из командной строки
 * и выводим текст
 * */
public class UserArgument {
    public static void main(String[] args){
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.print(". How are you?");
    }
}
