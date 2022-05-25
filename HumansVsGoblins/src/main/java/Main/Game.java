package Main;

import Main.Inputs.Keyboard;
import Main.Inputs.Mouse;
import javax.swing.*;

public class Game extends JFrame implements Runnable {
    private GameScreen gameScreen;
    private Thread gameThread;
    private final double FPS_SET = 60.0;
    private final double UPS_SET = 60.0;
    private Mouse mouse;
    private Keyboard keyboard;

    public Game() {
        // Import Sprites
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen = new GameScreen(this);
        add(gameScreen);
        pack(); // Adjusts Frame Size Through Layout Manager
        setVisible(true);
    }
    void initInputs() {
        mouse = new Mouse();
        keyboard = new Keyboard();

        addMouseListener(mouse);
        addMouseMotionListener(mouse);
        addKeyListener(keyboard);

        requestFocus();
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
        long now;
        // Game Loop
        while (true) {
            now = System.nanoTime();
        // Render
            if (now - lastFrame >= timePerFrame) {
                repaint(); // Changes Sprites
                lastFrame = now;
                frames++;
            }

        // Update
            if (now - lastUpdate >= timePerUpdate) {
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
