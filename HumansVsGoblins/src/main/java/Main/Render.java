package Main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

public class Render {

    private GameScreen gameScreen;
    private BufferedImage img;
    private ArrayList<BufferedImage> sprites = new ArrayList<>(); // Add Sprites To Array List For Easier Access
    private Random random;

    public Render(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
        random = new Random();
        importImg();
        loadSprites();
    }

    public void render(Graphics g) {
        switch (GameStates.gameState) {
            case MENU:
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        g.drawImage(sprites.get(getRndInt()), j * 32, i * 32, null);
                    }
                }
                break;
            case PLAYING:
                break;
            case SETTINGS:
                break;
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
