package Section1.paragraph2.exercise1_2_21;

/**
 * Напишите программу, которая получает число t в аргументе командной строки
 * и выводит значение sin(2t) + sin(3t);
 * */
public class Exercise {
    public static void main(String[] args){
        double t = Double.parseDouble(args[0]);

        System.out.println(Math.sin(2*t) + Math.sin(3 * t));
    }
}
