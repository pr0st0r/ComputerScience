package ru.prostor.examples;

/**
 * Программа получает целочисленный аргумент n в командной строке и
 * использует вложенные циклы for для вывода таблицы n x n, в которой
 * на пересечении строки i и столбца j стоит звездочка, если i делиться
 * на j или j делиться на i.
 * */
public class DivisorPattern {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if((i % j == 0) || (j % i == 0)){
                    System.out.println("* ");
                }else{
                    System.out.println("  ");
                }
            }
            System.out.println(i);
        }
    }
}
