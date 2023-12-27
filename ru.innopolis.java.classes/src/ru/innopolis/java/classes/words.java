package ru.innopolis.java.classes;

import java.util.Arrays;
import java.util.Scanner;

public class words {

    public static void main(String[] args) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите два слова:  ");
        // пишем слова через пробел, затем Enter
        String words = scan.nextLine();

        String[] wordsArray = words.split("");
        Arrays.sort(wordsArray);
        // результат получился не совсем тот, что по заданию. В дальнейшем буду исправлять.

        for (String values : wordsArray) {
            System.out.print(values + " ,");
        }
    }
}
