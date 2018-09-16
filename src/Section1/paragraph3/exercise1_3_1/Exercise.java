package Section1.paragraph3.exercise1_3_1;

/**
 * Напишите программу, которая получает три целых числа как аргументы
 * командной строки и выводит сообщение "equal", если все три числа равны, или
 * "not equal" в противном случае.
 * */
public class Exercise {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if(a == b && b == c){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
