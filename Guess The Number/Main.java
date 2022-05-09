import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int random() //Generates random number
    {
        Random rand = new Random();
        int upperbound = 21;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }

    private static int guess() //Accepts user input guess
    {
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        return guess;
    }

    public static void main(String[] args) {
        System.out.println("Hello! What is your name?");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine(); //Stores player name

        String cont = new String(); //For continuing game after completion

        do {
            int counter = 1; //Counts guesses
            int random = random(); //Calls random generator
            boolean correct = false; //Bool to exit while loop

            System.out.println("Well, " + userName + ", I am thinking of a number between 1 and 20.\n" +
                    "Take a guess");

            while (!correct) { //Game loop

                int userGuess = guess(); //Prompts player for guess

                if (userGuess > random) { //If above #
                    System.out.println("Your guess is too high.\nTake a guess.");
                    counter++;
                } else if (userGuess < random) { //If below #
                    System.out.println("Your guess is too low.\nTake a guess.");
                    counter++;
                } else { //Correct guess
                    System.out.println("Good job, " + userName + "! You guessed my number in " + counter + " guesses");

                    correct = true;
                }
            }
            System.out.println("Would you like to play again? (y or n)");
            cont = input.nextLine(); //Clear for continuing
        } while (cont.equals("y"));
    }
}


