/**
 * 
 */
import java.util.Scanner;
//import java.lang.Math;
/**
 * @author Deric
 *
 */
public class Distance {

    /**
     * @param args
     */
    public static void main(String[] args) {
        double x1;// coordinates of two points double distance;
        double y1;
        double x2;
        double y2;         
        double distance;
        
        Scanner scan = new Scanner(System.in); // Read in the two points
        System.out.print ("Enter the coordinates of the first point " 
                + "(put a space between them): ");
        x1 = scan.nextDouble(); 
        y1 = scan.nextDouble();
        System.out.print ("Enter the coordinates of the second point: "); 
        x2 = scan.nextDouble(); 
        y2 = scan.nextDouble();
        scan.close();
        
        // Compute the distance // Print out the answer
        distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        System.out.println(distance);

    }

}
