/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 3, 2015
 *
 *  Chapter#:       01
 *  ProjectName:    A170_32865_Hw01_ChangKuan-Ping
 *  File?Class name:    NumbersRange.java
 *  
 *  Concepts used: println() method, nextInt() method, Scanner library, arithematic calculation, variable assignment
 *
 *  Program Statement: Set minimum and maximum value and determine the total number of values in the range.
 *  
 *  Assumptions:    Entered value is an integer
 */
 
 // Import libraries
 // Add any necessary libraryies you import
 import java.util.Scanner;          // Used to accept input from the keyboard
 
 // Main classes - Replace className with the actual class name
 public class NumbersRange
{
    // Declare global constants -> none
    

    public static void main(String[] args)
    {
        // Declare local variables
        Scanner scan = new Scanner(System.in);                 //"scan" An object to get a value from keyboard
                               
        // Display program purpose
        System.out.println("Enter the minimum and maximum value");
        
        // Get user input
        int minimum = scan.nextInt();                          //Enter only interger value
        int maximum = scan.nextInt();                          //Enter only interger value
        int totalnumber = maximum - minimum + 1;               //Math for number of values, maximum and minimum has to be defined
        
        // Process -> none
        
        // Display results;
        System.out.println("The number of values in the range from " +minimum+ " to " +maximum+ " is " + totalnumber);
        // End of program greeting
        System.out.println("Number displayed, Good Bye!!");
        
    } // End of main() method
} // End of class
