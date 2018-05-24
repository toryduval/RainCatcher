import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements ActionListener{

	private Timer timer;
	private Catcher catcher;
	private final int DELAY = 10;

	// public Board() {
	// 	initBoard();
	// }

	public Board() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);

		catcher = new Catcher(100, 100);

		timer = new Timer(DELAY, this);
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
		Toolkit.getDefaultToolkit().sync();
	}

	 private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(catcher.getImage(), catcher.getX(), catcher.getY(), this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        catcher.move();
        repaint();  
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            catcher.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            catcher.keyPressed(e);
        }
    }
}

//TD

