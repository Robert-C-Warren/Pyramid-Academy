package Main;

import Main.Inputs.Keyboard;
import Main.Inputs.Mouse;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {
    private Game game;
    private Dimension size;
    private Mouse mouse;
    private Keyboard keyboard;

    public GameScreen(Game game) { // Loads Random Sprites
        this.game = game;

        setPanelSize(); // Calls New Method To Set Size

    }

    public void initInputs() {
        mouse = new Mouse(game);
        keyboard = new Keyboard();

        addMouseListener(mouse);
        addMouseMotionListener(mouse);
        addKeyListener(keyboard);

        requestFocus();
    }

    private void setPanelSize() {// Sets Panel Size So Sprites Don't Appear Off Screen On Start
        size = new Dimension(640, 740);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }



    public void paintComponent(Graphics g) { // Paints The Screen With Random Sprites
        super.paintComponent(g);

        game.getRender().render(g);
    }
}
