package Main.Inputs;

import Main.Game;
import Main.GameStates;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse implements MouseListener, MouseMotionListener {
    private Game game;
    public Mouse(Game game) {
        this.game = game;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            switch (GameStates.gameState) {

                case PLAYING -> {
                    game.getPlaying().mouseClicked(e.getX(), e.getY());
                    break;
                }
                case MENU -> {
                    game.getMenu().mouseClicked(e.getX(), e.getY());
                    break;
                }
                case SETTINGS -> {
                    game.getSettings().mouseClicked(e.getX(), e.getY());
                    break;
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        switch (GameStates.gameState) {

            case PLAYING -> {
                game.getPlaying().mousePressed(e.getX(), e.getY());
                break;
            }
            case MENU -> {
                game.getMenu().mousePressed(e.getX(), e.getY());
                break;
            }
            case SETTINGS -> {
                game.getSettings().mousePressed(e.getX(), e.getY());
                break;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        switch (GameStates.gameState) {

            case PLAYING -> {
                game.getPlaying().mouseReleased(e.getX(), e.getY());
                break;
            }
            case MENU -> {
                game.getMenu().mouseReleased(e.getX(), e.getY());
                break;
            }
            case SETTINGS -> {
                game.getSettings().mouseReleased(e.getX(), e.getY());
                break;
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        switch (GameStates.gameState) {

            case PLAYING -> {
                game.getPlaying().mouseMoved(e.getX(), e.getY());
                break;
            }
            case MENU -> {
                game.getMenu().mouseMoved(e.getX(), e.getY());
                break;
            }
            case SETTINGS -> {
                game.getSettings().mouseMoved(e.getX(), e.getY());
                break;
            }
        }
    }
}