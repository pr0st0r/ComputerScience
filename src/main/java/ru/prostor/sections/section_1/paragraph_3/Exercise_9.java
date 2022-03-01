package ru.prostor.sections.section_1.paragraph_3;

/**
 * Напишите программу с одним циклом for и одной командой if, которая
 * выводит целые числа от 1000 до 2000, по 5 чисел на строку. Подсказка:
 * используйте оператор %.
 * */
public class Exercise_9 {
    public static void main(String[] args){
        for(int i = 1000; i <= 2000; i++){
            if(i != 1000 && i % 5 == 0){
                System.out.println("");
                System.out.print(i + " ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
