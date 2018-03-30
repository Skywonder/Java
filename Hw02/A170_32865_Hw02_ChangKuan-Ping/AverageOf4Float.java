/**
 * Write a description of class AverageOf4Int here.
 * 
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 13, 2015
 *
 *  Chapter#:       02
 *  ProjectName:    A170_32865_Hw02_ChangKuan-Ping
 *  File?Class name:    AverageOF4Float.java
 *  
 *  Concepts used: println() method, nextDouble() method, Scanner library, arithematic calculation, variable assignment
 *
 *  Program Statement: Simple math calculation, addition, division
 *  
 *  Assumptions:    Enter valid floating-point value. 
 */
 
 // Import libraries
 import java.util.Scanner;          // Used to accept input from the keyboard
 
 // Main classes - Replace className with the actual class name
 public class AverageOf4Float
{
    public static void main(String[] args)
    {
        // Declare local variables
        double n1, n2, n3, n4;
        Scanner kb = new Scanner(System.in); //allow keyboard input to be stored as kb 
        
        // Display program purpose
        System.out.println("This program will display the sum and average of four floating-point numbers");
        
        // Get user input
        System.out.println("Please enter four floating-point number seperated by spaces: ");
        n1 = kb.nextDouble(); //this is the first user input 
        System.out.print(""); //this adds a blank space
        n2 = kb.nextDouble(); //second
        System.out.print("");
        n3 = kb.nextDouble(); //third
        System.out.print("");
        n4 = kb.nextDouble(); //fourth
 
        //Calculation assign variable integer
        double sum4Num = n1 + n2 + n3 + n4 ;
        double aver4Num = (n1 + n2 + n3 + n4)/4;
        
        //Display result of sum and average arithmetic calculation
        System.out.println("The sum of the four doubles is: " +sum4Num);
        System.out.println("The average of the four doubles is: " +aver4Num+ "\n");

        // End of program greeting
        System.out.println("Thank you for using the Average of 4 Double application. Good bye!");
    } // End of main() method
} // End of class