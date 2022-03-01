package ru.prostor.sections.section_1.paragraph_2;

/**
 * Предположим, a и b - переменные типа boolean. Покажите, что результат выражения
 * (!(a&&b)&&(a||b))||((a&&b)||!(a||b)) равен true.
 * */
public class Exercise_3 {
    public static void main(String[] args){
        System.out.println(getResult(false,false));
        System.out.println(getResult(true,false));
        System.out.println(getResult(true,true));
    }

    public static boolean getResult(boolean a, boolean b){
        return (!(a && b) && (a || b))||((a && b)||!(a || b));
    }
}
