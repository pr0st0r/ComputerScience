package ru.prostor.sections.section_1.paragraph_2;

/**
 *День недели. напишите программу, которая получает дату и выводит день недели
 *на которуы приходится эта дата. Ваша программа должна получать три значения типа int
 *в артгументах командной строки: m(месяц), d(день) и y(год). Значение m равно 1 для января
 *2 - для февраля и т.д. Программа выводит 0 для воскресенья, 1 для понедельники, 2 для вторника и т.д.
 *Вычисление выполняется по следующим формулам из григорианского календаря:
 * y0 = y - (14 - m)/12
 * x = y0 + y0/4 - y0/100 + y0/400
 * m0 = m + 12((14 - m)/12)-2
 * d0 = (d + x + (31 * m0)/12)%7
 * */
public class Exercise_29 {
    public static void main(String[] args){
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        int y = year - (14 - month)/12;
        int x = y + y/4 - y/100  + y/400;
        int m = month + 12*((14 - month)/12) - 2;
        int d = (day + x + (31*m)/12) % 7;

        switch (d){
            case 0:
                System.out.println("Воскресеьне");
                break;
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
        }
    }
}
