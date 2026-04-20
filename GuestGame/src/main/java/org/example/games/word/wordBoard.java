package org.example.games.word;

import java.util.Scanner;

public class wordBoard {

    private final String[] wordArray = {
            "Apple", "Sandwich", "Library", "Java", "Game",
            "Computer", "Computer Science", "Computer Engineering",
            "Computer Network", "Computer Networking", "Science",
            "Math", "Physics", "Chemistry", "Biology", "English",
            "Equinodermo", "Aquatic", "Marine", "Aquatic Life", "Aquatic Life Science",
    };

    private String getRandomString() {
        double number = Math.random()*wordArray.length;
        int wordIndex = (int) number;
        return wordArray[wordIndex];
    }

    public void startGame(int difficulty) {
        Word word = new Word();
        int lives = 0;
        long timer = System.currentTimeMillis();
        word.setWord(getRandomString());


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

        StringBuilder guess = new StringBuilder();
        guess.append(" _ ".repeat(Math.max(0, word.length())));

        while (lives > 0) {

            System.out.println("Lives: " + lives);
            System.out.println("Guess Word: " + guess );

            System.out.println("Ingresa una palabra:");
            Scanner input = new Scanner(System.in);
            String value = input.nextLine();

            if (!value.equalsIgnoreCase(word.getWord())) {
                for (int i = 0; i < word.length(); i++) {
                    if (i < value.length() && value.charAt(i) == word.getWord().charAt(i)) {
                        guess.setCharAt(i * 3 + 1, word.getWord().charAt(i));
                    }
                }
                lives--;

            } else {
                System.out.println("Has acertado la palabra");
                System.out.println("El tiempo fue de: " + (System.currentTimeMillis() - timer) + " milisegundos");
                break;
            }

        }

        if (lives <= 0) {
            System.out.println("Te quedaste sin vidas. La palabra era: " + word.getWord());
            System.out.println("El tiempo fue de: " + (System.currentTimeMillis() - timer) + " milisegundos");
        }

    }
}
