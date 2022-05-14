import java.util.InputMismatchException;
import java.util.Scanner;

public class dragonCave {

    public static void main(String[] args) {
        LevelText levelText = new LevelText();
        int userChoice = 0;
        boolean validChoice = false;
        //boolean validChoice;
        //Game opener...Cave description
        System.out.println("""
                You are in a land full of dragons. In front of you,
                you see two caves. In one cave, the dragon is friendly
                and will share his treasure with you. The other dragon
                is greedy and hungry and will eat you on sight.""");

        //Get user input
        Scanner askChoice = new Scanner(System.in);

        while (!validChoice) {
            try {
                System.out.println("Which cave will you go into? (1 or 2)");
                userChoice = askChoice.nextInt();
                validChoice = true;
            } catch (InputMismatchException e) {
                System.err.println("Enter either 1 or 2");
                askChoice.next();
            }
        } //catch invalid selection

        levelText.levelOne(userChoice); //level one text

        //Continuation if 2 was selected
        System.out.println("""
                You Answer...
                1) 'I was just wandering around and came across this cave.'
                2) 'Why do you care?'""");

        validChoice = false;
        while (!validChoice) {
            try {
                System.out.println("(1 or 2)");
                userChoice = askChoice.nextInt();
                validChoice = true;
            } catch (InputMismatchException e) {
                System.err.println("Enter either 1 or 2");
                askChoice.next();
            }
        } //catch invalid selection

        levelText.levelTwo(userChoice); // level two text

        validChoice = false;
        while (!validChoice) {
                try {
                    System.out.println("(1, 2 or 3)");
                    userChoice = askChoice.nextInt();
                    validChoice = true;
                } catch (InputMismatchException e) {
                    System.err.println("Enter either 1, 2 or 3");
                    askChoice.next();
                }
            } //catch invalid selection

        //User selection round 2

        levelText.levelThree(userChoice); //level three text

        validChoice = false;
        while (!validChoice) {
                    try {
                        System.out.println("(1 or 2)");
                        userChoice = askChoice.nextInt();
                        validChoice = true;
                    } catch (InputMismatchException e) {
                        System.err.println("Enter either 1 or 2");
                        askChoice.next();
                    }
                } //catch invalid selection

        levelText.finalLevel(userChoice); //end game text

    }

}


