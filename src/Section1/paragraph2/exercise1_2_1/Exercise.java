package Section1.paragraph2.exercise1_2_1;

/**
 * Предположим, a и b - переменные типа int.
 * Что делает следующая последовательность команд?
 * int t = a; b = t; a = b;
 * */
public class Exercise {

    // Присваивается всем переменным значение a
    public static void main(String[] args){
        int a = 2;
        int b = 6;
        int t = a; //2
        b = t; // 2
        a = b; // 2
    }
}
