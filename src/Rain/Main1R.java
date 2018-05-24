import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main1R extends JFrame{
	public Main1R(){
		initUI();
	}

	private void initUI() {
		add(new Board2R());
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

				Main1R m = new Main1R();
				m.setVisible(true);
			}
		});
	}
}	

//TD

