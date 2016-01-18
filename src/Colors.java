/**
 * 
 */
import javax.swing.JApplet; 
import java.awt.*;
/**
 * @author Deric
 *
 */
public class Colors extends JApplet{

    
    /**
     * 
     */
    private static final long serialVersionUID = -3949439620705562697L;
    
    public static final int PAGE_WIDTH = 600; 
    public static final int PAGE_HEIGHT = 400;

    
    public void init(){
        // Set the background color 
        getContentPane().setBackground(Color.white);
        getContentPane().setSize(PAGE_WIDTH,PAGE_HEIGHT);
    }

    public void paint (Graphics page) {
        // Declare size constants 
        
        // Declare variables 
        int x;
        int y;
        // x and y coordinates of upper left-corner of each shape 
        int width;
        int height; // width and height of each shape
        Color myColor = new Color (2486921);
        // Set the background color and paint the screen with a white rectangle 
   
        page.setColor(Color.white);
        page.fillRect(0, 0, PAGE_WIDTH, PAGE_HEIGHT);
        // Set the color for the rectangle 
        page.setColor (myColor);
        // Assign the corner point and width and height then draw 
        x = 200; 
        y = 125;
        width = 205; 
        height = 150;
        page.fillRect(x, y, width, height); 
        
        
        page.setColor(Color.black);
        Color redCode = new Color(myColor.getRed());
        Color blueCode = new Color(myColor.getBlue());
        Color greenCode = new Color(myColor.getGreen());
        
        x=200;
        y=150;
        page.drawString("Red: " + redCode, x ,y );
        
        x=200;
        y=175;
        page.drawString("Blue: " + blueCode,x ,y );
        x=200;
        y=200;
        page.drawString( "Green: " + greenCode,x,y );
                
        
    }
}
