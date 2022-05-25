package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class GameScreen extends JPanel {
    private Random random;
    private BufferedImage img;
    private ArrayList<BufferedImage> sprites = new ArrayList<>();

    public GameScreen(BufferedImage img) {
        this.img = img;

        loadSprites();

        random = new Random();
    }

    private void loadSprites() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sprites.add(img.getSubimage(j * 32, i * 32, 32, 32));
            }
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

//        g.drawImage(sprites.get(8), 0, 0, null);


        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                g.drawImage(sprites.get(getRndInt()), j * 32, i * 32, null);
            }
        }

    }

    private int getRndInt() {
        return random.nextInt(100);
    }
}
