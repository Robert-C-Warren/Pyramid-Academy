package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class GameScreen extends JPanel {
    private Random random;
    private BufferedImage img;

    private ArrayList<BufferedImage> sprites = new ArrayList<>(); // Add Sprites To Array List For Easier Access

    public GameScreen(BufferedImage img) { // Loads Random Sprites
        this.img = img;

        loadSprites();

        random = new Random();

    }

    private void loadSprites() { // Nested Loops To Fill The Entire Game Screen

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sprites.add(img.getSubimage(j * 32, i * 32, 32, 32));
            }
        }
    }

    public void paintComponent(Graphics g) { // Paints The Screen With Random Sprites
        super.paintComponent(g);

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                g.drawImage(sprites.get(getRndInt()), j * 32, i * 32, null);
            }
        }
    }

    private int getRndInt() { // Generates Random Index For Array List
        return random.nextInt(100);
    }
}
