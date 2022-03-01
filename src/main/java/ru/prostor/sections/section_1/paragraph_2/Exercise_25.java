package ru.prostor.sections.section_1.paragraph_2;

/**
 * Охлаждение под действием ветра. Для заданной температуры T(по шкале
 * Фаренгейта) и скорости ветра v(в милях в час). Национальная метеорологическая
 * служба вычисляет фактическую температуру по формуле
 * w = 35.74 + 0.6215T + (0.4275T - 35.75)v^0.16.
 * Напишите программу, которая получает два числа типа double temperature
 * и velocity в аргументах командной строки и выводит величину охлаждения.
 * Для вычисления a^b используйте Math.pow(a, b).
 * P.S. Формула недействительна, если обсолютное значение T больше 50 или
 * если v больше 120 или меньше 3.
 * */
public class Exercise_25 {
    public static void main(String[] args){
        double temperature = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);

        boolean tTrue = Math.abs(temperature) < 50;
        boolean vTrue = velocity > 3 && velocity < 120;

        if( tTrue && vTrue ){
            double res = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75)*Math.pow(velocity, 0.16);
            System.out.print(Math.round(res*100)/100D);
        }else{
            System.out.print("Формула не действительна");
        }
    }
}
