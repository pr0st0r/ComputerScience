package ru.prostor.sections.section_1.paragraph_2;

/**
 * Проекция Меркатора. Проекция Меркатора представляет собой равноугольную
 * (сохраняющую углы между направлениями) картографическую проекцию, отображающею широту f
 * и долготу l в прямоугольные координаты (x, y). Проекция Меркатора широко применяется - например, в
 * навигационных картах и тех картах, которые вы распечатываете из Интернета. Проекция определяется формулами
 * x = l - l0 И y = 1/2ln((1 + sinf)/(1 - sinf)), где l0 - долгота точки в центре карты. напишите
 * программу, которая получает в командной строке l0, а также широту и долготу точки и выводит проекцию точки.
 * */
public class Exercise_31 {
    public static void main(String[] args){
        double latitude = Double.parseDouble(args[0]); //Широта
        double longitude = Double.parseDouble(args[1]); //Долгота
        double longitudeCenterMap = Double.parseDouble(args[2]); //Долгота точки в центре карты

        double x = longitude - longitudeCenterMap;
        double y = 0.5*Math.log10((1 + Math.sin(latitude))/(1 -Math.sin(latitude)));

        System.out.println(x + ", " + y);
    }
}
