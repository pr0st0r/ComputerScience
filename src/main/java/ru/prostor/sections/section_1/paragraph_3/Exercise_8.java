package ru.prostor.sections.section_1.paragraph_3;

/**
 * Перепишите программу TenHellos и создайте программу, которая
 * получает в аргументе командной строки количество повторений. Можно предположить,
 * что аргумент меньше 1000. Подсказка: используйте выражения i % 10 и i % 100,
 * чтобы определить какой из суффиксов числительных - st, nd,rd или th - должен
 * использоваться при выводе i-го сообщения "Hello".
 * */
public class Exercise_8 {
    public static void main(String[] args){
        int i = Integer.parseInt(args[0]);

        int j = i % 10;
        int k = i % 100;

        if (j == 1 && k != 11) {
            System.out.println(i + "st Hello");
        }
        if (j == 2 && k != 12) {
            System.out.println(i + "nd Hello");
        }
        if (j == 3 && k != 13) {
            System.out.println(i + "rd Hello");
        }
        System.out.println(i + "th Hello");
    }
}
