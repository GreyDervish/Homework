package ru.innopolis.java.homework01;

import java.util.Random;
import java.util.Scanner;

public class Pockpapperscissors {
        public static void main (String[] args) {
            while (true) {
                Random rand = new Random();
                int R = 0;
                int P = 1;
                int S = 2;
                Scanner scan = new Scanner(System.in);
                String player1Move;
                String player2Move;
                System.out.println("Пожалуйста, выберите: 0, 1, 2 ");
                player1Move = scan.nextLine();
                player2Move = scan.nextLine();

                if (player1Move.equals(player2Move)) {
                    System.out.println("Ничья");
                } else if (player1Move.equals(0)) {
                    if (player1Move.equals(1)) {
                        System.out.println("Победа");
                    } else if (player2Move.equals(2)) {
                        System.out.println("Проигрыш");
                    }
                }
                else if (player1Move.equals(1)) {
                    if (player2Move.equals(2)) {
                        System.out.println("Победа");
                    }
                }
                else if (player1Move.equals(2)) {
                    if (player2Move.equals(0)) {
                        System.out.println("Проигрыш");
                    }
                }

            }
        }
}
