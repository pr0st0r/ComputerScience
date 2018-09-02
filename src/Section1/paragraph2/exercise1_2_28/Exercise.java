package Section1.paragraph2.exercise1_2_28;

/**
 * Проверка упорядочнности. Напишите программу, которая получает три числа типа double
 * x, y, z в аргументах командной строки и выводит true, если значения расположены строго
 * по возрастани. или убыванию, или false в противном случае.
 * */
public class Exercise {
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean logic = x < y && y < z || x > y && y > z;
        System.out.println(logic);
    }
}
