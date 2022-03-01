package ru.prostor.sections.section_1.paragraph_3;

/**
 * Напишите более универсальную и надежную версию программы Quadratic
 * которая выводит корни многочлена ax^2 + bx + c, либо соответсвующиее
 * сообщение, если дискриминант отрицателен, при этом избегая деления на нуль,
 * если значение a равно нулю.
 * */
public class Exercise_2 {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if(a != 0){
            double discriminant = b * b - 4.0 * a * c;
            if(discriminant > 0){
                double d = Math.sqrt(discriminant);
                System.out.println((-b + d) / 2.0);
                System.out.println((-b - d) / 2.0);
            }else{
                System.out.println("Дискриминант отрицателен");
            }
        }else{
            System.out.println("Деление на 0");
        }
    }
}
