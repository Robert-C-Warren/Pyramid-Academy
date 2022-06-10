import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUI {
    public void hangmanGUI() {
        JFrame hangmanFrame = new JFrame("Hangman");
        hangmanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hangmanFrame.setSize(500, 500);
        hangmanFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Guess");
        JTextField tf = new JTextField(10);
        JButton guess = new JButton("guess");
        panel.add(label);
        panel.add(tf);
        panel.add(guess);

        hangmanFrame.setVisible(true);
        hangmanFrame.getContentPane().add(BorderLayout.SOUTH, panel);

    }
}
