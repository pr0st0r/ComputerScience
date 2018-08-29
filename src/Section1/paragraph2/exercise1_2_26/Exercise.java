package Section1.paragraph2.exercise1_2_26;

/**
 * Полярные координаты. Напишите программу, которая преобразует декартовы координаты
 * в полярные. Ваша программа должна получать два числа типа double в аргументах
 * командной строки и выводить полярные координаты r и f. Используйте метод Math.atan2(x,y)
 * для вычисления арктангенса величины y/x в диапазоне от -π до π
 * */
public class Exercise {
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        //f = arctg(y/x)
        //r = sqrt(x^2 + y^2)
        double f = Math.atan2(y,x); //Полярный угол
        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2)); //Полярный радиус

        System.out.println("Полярный угол: " + f);
        System.out.println("Полярный радиус: " + r);
    }
}
