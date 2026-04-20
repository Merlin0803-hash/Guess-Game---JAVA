package org.example;

import org.example.games.number.numerBoard;
import org.example.games.word.wordBoard;

import java.util.Scanner;

public class Main {
    static void main() {

        boolean init = true;
        Scanner scanner = new Scanner(System.in);

        while (init) {
            System.out.println(
                    """
                            WELCOME TO THE GUEST GAME
                            """
            );
            System.out.println(
                    """
                            SELECT THE GAME
                            1. GUEST A WORLD
                            2. GUEST A NUMBER
                            3. EXIT
                            """
            );
            System.out.print("Enter your choice: ");
            int newGame = scanner.nextInt();

            switch (newGame) {
                case 1:
                    System.out.println("GUEST A WORD");
                    System.out.println(
                            """
                                    SELECT DIFFICULT
                                    1. 10 Attempts
                                    2. 5 Attempts
                                    3. 3 Attempt
                                    """
                    );
                    System.out.print("Enter your choice: ");
                    int difficulty = scanner.nextInt();
                    wordBoard wordBoard = new wordBoard();
                    wordBoard.startGame(difficulty);

                    break;
                case 2:
                    System.out.println("GUEST A NUMBER");
                    System.out.println(
                            """
                                    SELECT DIFFICULT
                                    1. 10 Attempts
                                    2. 5 Attempts
                                    3. 3 Attempt
                                    """
                    );
                    System.out.print("Enter your choice: ");
                    int difficultyNumber = scanner.nextInt();

                    numerBoard.startGame(difficultyNumber);
                    break;
                case 3:
                    System.out.println("EXIT THE GAME...");
                    init = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid game.");
            }

        }
    }
}
