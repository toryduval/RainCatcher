import javax.swing.*;
import java.awt.*;

public class Rain1R extends JFrame{
		public int x;
    	public int y;
        //private int yspeed;
        //private int xpos;
        //private int ypos;
    	private Image image;
    	//public Rectangle rect2 = new Rectangle(x, y, 54, 54);

    	public Rain1R(int x, int y) {
        	ImageIcon i = new ImageIcon("raindrop.png");
        	image = i.getImage();
        	this.x = x;
        	this.y = y;
            System.out.println("rain" + y);
    	}

    	public int getX() {
    	    return x;
   		}

    	public int getY() {
       		return y;
    	}

        // public int move() {
        //     rain.y++;
        //     //y+= ypos;
        //     System.out.println("move" + rain.y);
        //     if(y > 800){
        //         y=0;
        //     }
        //     //return y;
        // }

    	public Image getImage() {
       		return image;
    	}

    	// public Rectangle getBounds(){
        	//return rect1;
}



