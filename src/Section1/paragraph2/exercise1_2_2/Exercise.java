package Section1.paragraph2.exercise1_2_2;

/**
 * Напишите программу, которая использует Math.sin() и Math.cos() и
 * проверяет, что значение cos^2O + sin^2O равно приблезительно 1 для
 * любого значения O, переданного в аргументе командной строки.
 * */
public class Exercise {
    public static void main(String[] args){

        System.out.println(getResult(args[0]));
    }

    public static double getResult(String x){
        double O = Double.parseDouble(x);
        double sin = Math.sin(O);
        double cos = Math.cos(O);
        double result = sin*sin + cos*cos;
        return result;
    }
}
