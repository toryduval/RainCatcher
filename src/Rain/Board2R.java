import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import java.util.*;

public class Board2R extends JPanel{

	//private Timer timer;
	//private final int DELAY = 10;
  //ArrayList<Rain> rain = new ArrayList<Rain>();
	private Rain1R rain;


	public Board2R() {
		setFocusable(true);
		setBackground(Color.BLACK);
		rain = new Rain1R(350,50);
		//timer = new Timer(DELAY, this);
		//timer.start();
		System.out.println("board " + rain.y);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
		Toolkit.getDefaultToolkit().sync();
	}

	 private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(rain.getImage(), rain.getX(), rain.getY(), this);
        System.out.println("draw " + rain.y);
        
            // while(rain.y < 800){
            //     rain.y++;
            // 	System.out.println("move " + rain.y);
            // 	repaint();
            // }
   }

   // //@Override
   // public void actionPerformed(ActionEvent e){
   // 		//rain.move();
   // 		// rain.y++;
   //   //        System.out.println("move" + rain.y);
   //   //        if(rain.y > 800){
   //   //            rain.y=0;
   //   //        }
   // 		repaint();
   // 		System.out.println("action" + rain.y);
   // }
  
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        System.out.println("paint " + rain.y);
    }
}

//TD


