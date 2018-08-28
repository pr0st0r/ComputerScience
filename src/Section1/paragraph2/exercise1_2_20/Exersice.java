package Section1.paragraph2.exercise1_2_20;

/**
 * Напишите программу, которая выводит сумму двух случайных чисел от 1 до 6.
 * */
public class Exersice {
    public static void main(String[] args){
        int a = 1 + (int)(Math.random()*5);
        int b = 1 + (int)(Math.random()*5);
        System.out.println(a + b);
    }
}
