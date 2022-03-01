package ru.prostor.sections.section_1.paragraph_2;

/**
 * Дуга большого круга. Напишите программу GreatCircle, которая получает
 * четыре значения типа double x1,y1,x2,y2 в аргументах команной строки (широта
 * и долгота в градусах двух точек земной поверхности) и выводит расстояние дуги большого круга между этими точками.
 * d = 60arccos(sin(x1)sin(x2) + cos(x1)cos(x2)cos(y1 - y2))
 * Обратите внимание: в формуле используются градусы, а тригометрические функции Java работают с радианами.
 * Используйте методы Math.toRadians() и Math.toDegrees() для преобразования между угловыми единицами.
 * */
public class Exercise_33 {
    public static void main(String[] args){
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
    }
}
