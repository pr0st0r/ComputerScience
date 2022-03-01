package ru.prostor.sections.section_1.paragraph_2;

/**
 * Напишите программу, которая получает два числа с плавающей точкой  x и y
 * в аргументах командной строки и выводит евклидово расстояниеот точки
 * (x, y) до точки (0, 0)
 * */
public class Exercise_18 {
    public static void main(String[] args){
        System.out.println(getResult(args[0], args[1]));
    }

    //dist = ((x1 - x2)^2 + (y1 - y2)^2)^1/2
    public static double getResult(String a, String b){
        double dist = Math.pow((Double.parseDouble(a) - 0), 2) + Math.pow((Double.parseDouble(b) - 0), 2);
        return Math.round(Math.sqrt(dist)*100)/100D;
    }
}
