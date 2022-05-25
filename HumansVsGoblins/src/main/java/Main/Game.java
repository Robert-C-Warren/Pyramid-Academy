package Main;

import org.w3c.dom.ls.LSOutput;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Game extends JFrame implements Runnable {
    private GameScreen gameScreen;
    private BufferedImage img;
    private Thread gameThread;
    private final double FPS_SET = 60.0;
    private final double UPS_SET = 60.0;

    public Game() {
        // Import Sprites
        importImg();
        // Set Size Of Game Screen
        setSize(640,640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen = new GameScreen(img);
        add(gameScreen);
        setVisible(true);
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
    // Main Game Thread
    void start(){
        gameThread = new Thread(this) {};

        gameThread.start();
    }


    @Override
    // Game
    public void run() {
        // Doubles to calculate FPS & UPS
        double timePerFrame = 1000000000.0 / FPS_SET;
        double timePerUpdate = 1000000000.0 / UPS_SET;
        // To record and display FPS & UPS
        int frames = 0;
        int updates = 0;

        long lastFrame = System.nanoTime();
        long lastTimeCheck = System.currentTimeMillis();
        long lastUpdate = System.nanoTime();
        // Game Loop
        while (true) {
        // Render
            if (System.nanoTime() - lastFrame >= timePerFrame) {
                repaint();
                lastFrame = System.nanoTime();
                frames++;
            }

        // Update
            if (System.nanoTime() - lastUpdate >= timePerUpdate) {
                lastUpdate = System.nanoTime();
                updates++;
            }

            if (System.currentTimeMillis() - lastTimeCheck >= 1000) {
                System.out.println("FPS: " + frames + " | UPS: " + updates);
                frames = 0;
                updates = 0;
                lastTimeCheck = System.currentTimeMillis();
            }
        }
    }
}
