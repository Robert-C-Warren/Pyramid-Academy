import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputWrite {
    public void name() {
        System.out.println("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        int playerScore = 0;
        try {
            fWriter = new FileWriter("C:\\Pyramid-Academy\\HangmanFunctional\\src\\main\\resources\\NameScore.txt");
            writer = new BufferedWriter(fWriter);
            writer.write( "Name: " + playerName + "     Score: " + playerScore);
            writer.newLine();
            writer.close();
            System.err.println("Your score: " + playerScore + " was saved.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
