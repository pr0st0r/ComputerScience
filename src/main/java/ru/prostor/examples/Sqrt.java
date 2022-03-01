package ru.prostor.examples;

/**
 * Программа получает положительное число с плавающей точкой c
 * в командной строке и вычисляет квадратный корень из c с точнойстью
 * до 15 знаков пом етожу Ньютона.
 * */
public class Sqrt {
    public static void main(String[] args){
        double c = Double.parseDouble(args[0]);
        double EPSILON = 1e-15;
        double t = c;
        while(Math.abs(t - c/t) > EPSILON * t){
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }
}
