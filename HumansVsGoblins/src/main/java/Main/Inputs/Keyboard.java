package Main.Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("A is pressed");
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            System.out.println("W is pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
