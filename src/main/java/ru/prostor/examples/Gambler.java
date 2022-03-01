package ru.prostor.examples;

/**
 * Моделирование задачи о разорении игрока
 * Программа получает в аргументах командной строки три целых числа:
 * исходную сумму, цель и количество испытаний. Внутренний цикл while моделирует
 * игрока с исходной суммой $stake, который совершает серию ставок $1 и продолжате
 * игру, пока не разорится или не достигнет $goal. Время выплнения этой программы пропорционально
 * произведению количества испытаний и среднего количества ставок. Например,
 * при третьем из приведённый ниже запусков программы генерируется около 100 миллионов случайных чисел.
 * */
public class Gambler {
    public static void main(String[] args){
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
        for(int t = 0;t < trials; t++){
            int cash = stake;
            while (cash > 0 && cash < goal){
                bets ++;
                if(Math.random() < 0.5) cash++;
                else cash--;
            }
            if(cash == goal) wins++;
        }
        System.out.println(100*wins/trials + "% wins");
        System.out.println("Avg # bets: " + bets/trials);
    }
}
