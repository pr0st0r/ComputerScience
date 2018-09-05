package Section1.paragraph2.exercise1_2_34;

/**
 * Сортировка троек. Напишите программу, которая получает в аргументах командной строки
 * три целочисленных значения и выводит их по возрастанию. Используйте методы Math.min()
 * и Math,max().
 * */
public class Exercise {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b,c));
        int mid = (a  + b + c) - (min + max);

        System.out.println(min + ", " + mid + ", " + max);
    }
}
