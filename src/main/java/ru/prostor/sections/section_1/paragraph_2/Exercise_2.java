package ru.prostor.sections.section_1.paragraph_2;

/**
 * Напишите программу, которая использует Math.sin() и Math.cos() и
 * проверяет, что значение cos^2Q + sin^2Q равно приблезительно 1 для
 * любого значения Q, переданного в аргументе командной строки.
 * */
public class Exercise_2 {
    /**
     * Доказательство основного тригонометрическое тождество
     * sin^2 α + cos^2 α = 1
     * @param x - любое число
     * @return - 1
     */
    public static double getResult(String x){
        double Q = Double.parseDouble(x);
        double sin = Math.pow(Math.sin(Q), 2);
        double cos = Math.pow(Math.cos(Q), 2);
        return sin + cos;
    }
}
