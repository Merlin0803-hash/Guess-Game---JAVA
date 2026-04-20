package org.example.games.number;


import java.util.Scanner;

public class numerBoard {


    public static void startGame(int difficulty) {

        long number = Math.round(Math.random() * 100);
        int lives = 0;
        long timer = System.currentTimeMillis();

        if (difficulty == 1) {
            System.out.println("Starting game with difficulty level 1");
            lives = 10;
        } else if (difficulty == 2) {
            System.out.println("Starting game with difficulty level 2");
            lives = 5;
        } else if (difficulty == 3) {
            System.out.println("Starting game with difficulty level 3");
            lives = 3;
        }

        Scanner scanner = new Scanner(System.in);

        while (lives > 0) {

            System.out.println("Lives: " + lives);
            System.out.println("Guess Number from 0 to 100: ");

            System.out.println("Ingresa un numero:");
            int value = scanner.nextInt();

            if (value != number) {

                if (value > number) {
                    System.out.println("El numero es menor");
                } else {
                    System.out.println("El numero es mayor");
                }
                lives--;
            } else {
                System.out.println("Has acertado el numero");
                System.out.println("El tiempo fue de: " + (System.currentTimeMillis() - timer) + " milisegundos");
                break;
            }
        }

    }

}
