package Scenes;

import Main.Game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

public class Menu extends GameScene implements SceneMethods{

    private BufferedImage img;
    private ArrayList<BufferedImage> sprites = new ArrayList<>(); // Add Sprites To Array List For Easier Access
    private Random random;
    public Menu(Game game) {
        super(game);
        random = new Random();
        importImg();
        loadSprites();
    }

    @Override
    public void render(Graphics g) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                g.drawImage(sprites.get(getRndInt()), j * 32, i * 32, null);
            }
        }
    }

    private void loadSprites() { // Nested Loops To Fill The Entire Game Screen

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sprites.add(img.getSubimage(j * 32, i * 32, 32, 32));
            }
        }
    }
    private int getRndInt() { // Generates Random Index For Array List
        return random.nextInt(100);
    }

    // Import Images For Game
    private void importImg() {
        InputStream is = getClass().getResourceAsStream("/spriteatlas.png");

        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
