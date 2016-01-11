/**
 * 
 */
import javax.swing.JApplet; 
import java.awt.*;
/**
 * @author Deric
 *
 */
public class Coords extends JApplet {

    // Declare size constants 
    public static final int MAX_SIZE = 300; 
    public static final int PAGE_WIDTH = 600; 
    public static final int PAGE_HEIGHT = 400;
    
    public void init(){
        // Set the background color 
        getContentPane().setBackground(Color.yellow);
        getContentPane().setSize(PAGE_WIDTH,PAGE_HEIGHT);
    }


    public void paint (Graphics page) {
        super.paint(page);// needed for the the background color to work
        
        // Declare variables 
        // x and y coordinates of upper left-corner of each shape 
        int x; 
        int y;
        // width and height of each shape
        int width; 
        int height; 


        

        // Set the color for the next shape to be drawn 
        page.setColor (Color.blue);
        // Assign the corner point and width and height 
        x = 225; 
        y = 150;
        width = 150; 
        height = 100;
        page.fillRect(x, y, width, height); 
        
        // Set the color for the next shape to be drawn 
        page.setColor (Color.red);
        // Assign the corner point and width and height 
        x = 0; 
        y = 0;
        width = 225; 
        height = 150;
        page.fillRect(x, y, width, height); 
        
        // Set the color for the next shape to be drawn 
        page.setColor (Color.green);
        // Assign the corner point and width and height 
        x = 0; 
        y = 250;
        width = 225; 
        height = 150;
        page.fillRect(x, y, width, height); 
        
        
        // Set the color for the next shape to be drawn 
        page.setColor (Color.orange);
        // Assign the corner point and width and height 
        x = 375; 
        y = 0;
        width = 225; 
        height = 150;
        page.fillRect(x, y, width, height); 
        
        // Set the color for the next shape to be drawn 
        page.setColor (Color.cyan);
        // Assign the corner point and width and height 
        x = 375; 
        y = 250;
        width = 225; 
        height = 150;
        page.fillRect(x, y, width, height); 
    }

}
