import java.io.File;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        guess();
    }


    public static void guess() {
        HangmanVisual hangman = new HangmanVisual();
        System.out.print(hangman.hangmanVisual(hangman.getFail()));
        Scanner guess = new Scanner(System.in);
        ComputerWordMap word = new ComputerWordMap();
        String anotherRound = "";
        boolean playAgain = false;
        do {
            String gameWord = word.getWord(); //Saves word from random hashmap
            String guessLetter = ""; //Saves guessed letter from user
            StringBuilder missedCollection = new StringBuilder(); //Saves wrong guesses
            StringBuilder wordPrint = new StringBuilder(); //Stores underscores and correct guesses
            //TO SEE CORRECT WORD
            //System.out.println(gameWord + "\n");
            //Print underscores length of the word
            for (int i = 0; i < gameWord.length(); i++) {
                wordPrint.insert(i, "_");
                System.out.print("_");
            }

            //Loops guess a letter and catches user input
            for (int i = 0, j = 0; i < gameWord.length() && j < 7; i++) {
                System.out.println("\n\nGuess a letter.\n\n");
                //Exception catching and to lower for capital entry
                try {
                    guessLetter = guess.next().toLowerCase();
                    multipleEntry(guessLetter);
                } catch (TooManyLetters ex) {
                    System.out.println(ex.getMessage());
                }
                //Checks if guessed letter has already been guessed
                if (missedCollection.indexOf(guessLetter) != -1 || wordPrint.indexOf(guessLetter) != -1) {
                    if (String.valueOf(missedCollection).contains(gameWord)) {
                        missedCollection.delete(0, missedCollection.length() - 1);
                    }
                    System.out.println("You have already guessed that letter. Choose again.");
                    i--;
                }
                //If letter is new
                else {
                    //Replaces underscore in wordPrint with the letter guessed if correct.
                    if (gameWord.contains(guessLetter)) {
                        wordPrint.replace(gameWord.indexOf(guessLetter), gameWord.indexOf(guessLetter) + 1, guessLetter);
                        //Prints hangman
                        System.out.println(hangman.hangmanVisual(hangman.getFail()));
                        guessLetter = "";
                    }
                    //If guess is wrong
                    else {
                        //J sets switch case to print hangman
                        hangman.setFail(++j);
                        //Adds the wrong letter to the missed letters
                        hangman.setMissed(String.valueOf(missedCollection.append(guessLetter)));
                        //Prints hangman
                        System.out.println(hangman.hangmanVisual(hangman.getFail()));
                        //Decrement i to keep loop going
                        i--;
                    }
                    //Prints correct letters and underscores
                    System.out.println(wordPrint);
                }
            }


            //Asks for a new game
            do {
                // If won
                if (wordPrint.equals(gameWord)) {
                    System.out.println("Yes! The secret word is '" + gameWord + "'! You have won!");
                }
                // If lost
                else {
                    System.out.println("Oh no! the secret word was '" + gameWord + "' You have lost.");
                }
                System.out.println("Would you like to play another game? (yes or no)");
                //Catches any answer not: yes, y, no, n
                try {
                    anotherRound = guess.next().toLowerCase();
                    continueGame(anotherRound);
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
                if (anotherRound.equals("no") || anotherRound.equals("n")) {
                    playAgain = false;
                    break;
                }
                else {
                    playAgain = true;
                    break;
                }
            } while (true);
        } while (playAgain == true);
    }

    public static void continueGame(String anotherRound) {
        if (anotherRound != "yes" || anotherRound != "y" || anotherRound != "no" || anotherRound != "n") {
            throw new IllegalArgumentException("Must answer yes, y, no, n");
        }
    }

    public static void multipleEntry(String guessLetter) throws TooManyLetters {
        if (guessLetter.length() > 1) {
            throw new TooManyLetters("Only one letter is allowed at a time");
        }
    }
}
