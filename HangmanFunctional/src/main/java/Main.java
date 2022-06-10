import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.hangmanGUI();
//        InputWrite inputWrite = new InputWrite();
//        inputWrite.name();
        WordMap wordMap = new WordMap();
        String gameWord = wordMap.getWord();
        System.out.println(gameWord);
        guessLayout(gameWord);
    }

    public static void guessLayout(String gameWord) {
        Stream<String> s = Arrays.stream(gameWord.split(""));
        s.forEach(str -> System.out.print("-"));
    }

//    public static void gallows(int wrong) {
//        if (wrong == 0) {
//            try {
//                BufferedReader in = new BufferedReader(new FileReader("C:\\Pyramid-Academy\\HangmanFunctional\\src\\main\\resources\\Start.txt"));
//                String s = "", line = in.readLine();
//                Stream.of(line).forEach(ln -> System.out.print(ln));
//            } catch (IOException e) {
//                System.out.println("File Not Found");
//            }
//        } else if (wrong == 1) {
//            try {
//                BufferedReader in = new BufferedReader(new FileReader("C:\\Pyramid-Academy\\HangmanFunctional\\src\\main\\resources\\Head.txt"));
//            } catch (FileNotFoundException e) {
//                System.out.println("File Not Found");
//            }
//        } else if (wrong == 2) {
//            try {
//                BufferedReader in = new BufferedReader(new FileReader("C:\\Pyramid-Academy\\HangmanFunctional\\src\\main\\resources\\Head, Left Arm.txt"));
//            } catch (FileNotFoundException e) {
//                System.out.println("File Not Found");
//            }
//        } else if (wrong == 3) {
//            try {
//                BufferedReader in = new BufferedReader(new FileReader("C:\\Pyramid-Academy\\HangmanFunctional\\src\\main\\resources\\Head, Left Arm, Torso.txt"));
//            } catch (FileNotFoundException e) {
//                System.out.println("File Not Found");
//            }
//        } else if (wrong == 4) {
//            try {
//                BufferedReader in = new BufferedReader(new FileReader("C:\\Pyramid-Academy\\HangmanFunctional\\src\\main\\resources\\Head, Left Arm, Torso, Right Arm.txt"));
//            } catch (FileNotFoundException e) {
//                System.out.println("File Not Found");
//            }
//        } else if (wrong == 5) {
//            try {
//                BufferedReader in = new BufferedReader(new FileReader("C:\\Pyramid-Academy\\HangmanFunctional\\src\\main\\resources\\Head, Left Arm, Torso, Right Arm, Left Leg.txt"));
//            } catch (FileNotFoundException e) {
//                System.out.println("File Not Found");
//            }
//        } else if (wrong == 6) {
//            try {
//                BufferedReader in = new BufferedReader(new FileReader("C:\\Pyramid-Academy\\HangmanFunctional\\src\\main\\resources\\Game Over.txt"));
//            } catch (FileNotFoundException e) {
//                System.out.println("File Not Found");
//            }
//        }
//    }
}
