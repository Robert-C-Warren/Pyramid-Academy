package Main;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {
    private Game game;
    private Dimension size;

    public GameScreen(Game game) { // Loads Random Sprites
        this.game = game;

        setPanelSize(); // Calls New Method To Set Size

    }

    private void setPanelSize() {// Sets Panel Size So Sprites Don't Appear Off Screen On Start
        size = new Dimension(640, 640);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }



    public void paintComponent(Graphics g) { // Paints The Screen With Random Sprites
        super.paintComponent(g);

        game.getRender().render(g);
    }
}
