
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
 *  File?Class name:    AverageOF4Int.java
 *  
 *  Concepts used: println() method, nextInt() method, Scanner library, arithematic calculation, variable assignment
 *
 *  Program Statement: Simple math calculation, addition, division
 *  
 *  Assumptions:    Enter valid integer value. float result maybe rounded down to integer
 */
 
 // Import libraries
 import java.util.Scanner;          // Used to accept input from the keyboard
 
 // Main classes - Replace className with the actual class name
 public class AverageOf4Int
{
    // Declare global constants -> N/A
    public static void main(String[] args)
    {
        // Declare local variables
        int n1, n2, n3, n4;
        Scanner kb = new Scanner(System.in); //allow keyboard input to be saved at kb
        // Display program purpose
        
        System.out.println("This program will display the sum and average of four integers");
        
        // Get user input
        System.out.println("Please enter four integers seperated by spaces: ");
        n1 = kb.nextInt(); //store 1st integer input
        System.out.print(""); //add a space
        n2 = kb.nextInt(); //2nd integer input
        System.out.print("");
        n3 = kb.nextInt(); //3rd integer input
        System.out.print("");
        n4 = kb.nextInt(); //4th integer input
 
        //Calculation assign variable integer
        int sum4Num = n1 + n2 + n3 + n4 ;
        float aver4Num = (n1 + n2 + n3 + n4)/4;
        
        //Display result sum and average in integer 
        System.out.println("The sum of the four integers is: " +sum4Num);
        System.out.println("The average of the four integer is: " +aver4Num+ "\n");

        // End of program greeting
        System.out.println("Thank you for using the Average of 4 Integers application. Good bye!");
    } // End of main() method
} // End of class