import javax.swing.*;
import java.awt.*;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class Catcher extends JFrame{

	int x;
	int y;
	int dx;
	int dy;
	Image image;

	// public Catcher() {
 //        initCatcher();
 //    }

    public Catcher(int x, int y) {
        ImageIcon ii = new ImageIcon("circle.png");
        image = ii.getImage();
        this.x = x;
        this.y = y;

    }

	public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}

//TD

