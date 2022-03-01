package ru.prostor.sections.section_1.paragraph_3;

/**
 * Усовершенствуйте свое решение упражнения 1.2.25: добавьте код, который
 * проверяет, что значение аргументов командной строки лежат в диапазонах
 * допустимых значение формулы, а также код для вывода сообщения об ошибке при
 * нарушении ограничений.
 * */
public class Exercise_6 {
    public static void main(String[] args){
        double temperature = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);

        boolean tTrue = Math.abs(temperature) < 50;
        boolean vTrue = velocity > 3 && velocity < 120;

        if(tTrue && vTrue){
            double res = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75)*Math.pow(velocity, 0.16);
            System.out.print(Math.round(res*100)/100D);
        }else{
            System.out.print("Формула не действительна");
        }
    }
}
