package Section1.paragraph2.exercise1_2_24;

/**
 * Капитализация процентов. Напишите программу, которая вычичляет и выводит сумму,
 * которую вы получите через t лет при размещении P долларов под ежегодный процент
 * r(непрерывно начисляемый). Искомое значение вычисляется по формуле Pe^rt.
 * */
public class Exercise {
    public static void main(String[] args){
        int P = 100; // доллары
        int t = 10; // лет
        int r = 15; // ежегодный процент

        System.out.println(P * Math.exp(r * t));
    }
}
