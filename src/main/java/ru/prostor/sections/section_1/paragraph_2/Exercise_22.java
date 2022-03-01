package ru.prostor.sections.section_1.paragraph_2;

/**
 * Напишите программу, которая получает числа типа double x, v, и t
 * в аргументах командной строки и выводит значение x + vt - gt^2/2,
 * где g - костанта 9,80665.
 * P.S. значение определяет путь в метрах, пройденный за t секунд
 * брошенным вертикально вверх объектом, из исходной позиции x
 * со скоростью v метров в секунду.
 * */
public class Exercise_22 {
    public static void main(String[] args){
        final double G = 9.80665;
        double x = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        double result = x + v * t - (G * Math.pow(t,2)) / 2;

        System.out.println(result);
    }
}
