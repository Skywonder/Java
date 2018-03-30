/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 3, 2015
 *
 *  Chapter#:       01
 *  ProjectName:    A170_32865_Hw01_ChangKuan-Ping
 *  File?Class name:    Snowman.java
 *  
 *  Concepts used: canvas.drawOval, canvas.fillOval, canvas.drawArc, paint method, method invocation 
 *
 *  Program Statement: Draw a snowman in Applet using paint(Graphic canvas).
 *  
 *  Assumptions:    N/A
 */

import java.awt.*;    //needed for Graphic canvas
import javax.swing.*; //needed for Graphic canvas

public class Snowman extends JApplet
{
    //Global constant -> none
    public void paint(Graphics canvas)
    {
        //Display program purpose and result
        canvas.drawOval(100,50,200,200);   //Draw an Oval starting at x,y position with height and width sizes
        canvas.fillOval(155,100,10,20);    //Draw an filled Oval at x, y position with height and width sizes 
        canvas.fillOval(230,100,10,20);   
        canvas.drawArc(150,160,100,50,180,180); //Draw an Arc at x, y position with designated height and width and degrees
        canvas.drawOval(80,250,250,250); 
        canvas.drawOval(40,500,350,350);
        //End of program



    }//end of paint() method
}//End of class Snowman 

   