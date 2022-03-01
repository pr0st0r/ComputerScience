package ru.prostor.sections.section_1.paragraph_2;

/**
 * Полярные координаты. Напишите программу, которая преобразует декартовы координаты
 * в полярные. Ваша программа должна получать два числа типа double в аргументах
 * командной строки и выводить полярные координаты r и f. Используйте метод Math.atan2(x,y)
 * для вычисления арктангенса величины y/x в диапазоне от -π до π
 * */
public class Exercise_26 {
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        //f = arctg(y/x)
        double f = Math.atan2(y,x); //Полярный угол
        //r = sqrt(x^2 + y^2)
        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2)); //Полярный радиус

        System.out.println("Полярный угол: " + f);
        System.out.println("Полярный радиус: " + r);
    }
}
