import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main2 extends JFrame{
	public Main2(){
		initUI();
	}

	private void initUI() {
		add(new Board());
		setSize(800,800);
		setResizable(false);
		setTitle("Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				Main2 m2 = new Main2();
				m2.setVisible(true);
			}
		});
	}
}

//TD