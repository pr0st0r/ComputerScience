package Section1.paragraph2.exercise1_2_3;

/**
 * Предположим, a и b - переменные типа boolean. Покажите, что результат выражения
 * (!(a&&b)&&(a||b))||((a&&b)||!(a||b)) равен true.
 * */
public class Exercise {
    public static void main(String[] args){
        System.out.println(getResult(false,false));
        System.out.println(getResult(true,false));
        System.out.println(getResult(true,true));
    }

    public static boolean getResult(boolean a, boolean b){
        return (!(a&&b)&&(a||b))||((a&&b)||!(a||b));
    }
}
