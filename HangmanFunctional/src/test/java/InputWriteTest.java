import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputWriteTest {

    @Test
    public void nameTest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        try {
            FileWriter writer = new FileWriter("C:\\Pyramid-Academy\\HangmanFunctional\\src\\main\\resources\\NameScore");
            String playerName = scan.nextLine();
            writer.write(playerName);
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}