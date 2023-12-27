package ru.innopolis.java.classes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrows {
    public static void main(String[] args) {
        char[] arrows = {'<', '>', '-'};

        String joinedString = Arrays.toString(arrows);
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество символов: ");
        int num = scan.nextInt();

        String arrowleft = "<--<<";
        String arrowright = ">>-->";
        int c=0;
        int b=0;

        // добавить цикл
        if(joinedString.contains(">>-->")){
            c++;
        }

        if(joinedString.contains("<--<<")){
            b++;
        }
        int result = c+b;
        System.out.print(result);




        if ((num) > 106)
            System.out.print("Предельное значение");

        for (int i = 0; i <= num; i++) {
            int sum = r.nextInt(arrows.length);
            System.out.print(arrows[sum]);
        }


    }
}
