package ru.innopolis.java.classes;
import java.util.Scanner;

public class alphabet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alph = "qwertyuiopasdfghjklzxcvbnm";
        //   int length = alph.length();


        System.out.println("Введите букву: ");
        String letter = scan.nextLine();

        int index = alph.indexOf(letter);
        int lastindex = index - 1;
        if (letter.equals("q"))
            System.out.println("Соседняя буква слева: " + letter.charAt(lastindex));

    }
}
