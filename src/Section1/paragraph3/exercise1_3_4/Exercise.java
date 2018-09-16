package Section1.paragraph3.exercise1_3_4;

/**
 * Напишите фрагмент кода, который выводит сообщение "true",
 * если переменные x и y типа double лежат строго в диапозоне
 * от 0 до 1, или "false" в противном случае
 * */
public class Exercise {
    public static void main(String[] args){
        double x = 0.4;
        double y = 0.7;

        boolean trueX = x >= 0 && x <= 1;
        boolean trueY = y >= 0 && y <= 1;

        if(trueX && trueY){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
