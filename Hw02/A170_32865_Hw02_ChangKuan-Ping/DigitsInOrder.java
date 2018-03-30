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
 *  File?Class name:    DigitsInOrder.java
 *  
 *  Concepts used: println() method, nextInt() method, Scanner library, arithematic calculation, variable assignment
 *
 *  Program Statement: Simple math division, modulation
 *  
 *  Assumptions:    Enter valid integer value. float result maybe rounded down to integer
 */
 
 // Import libraries
 import java.util.Scanner;          // Used to accept input from the keyboard

 public class DigitsInOrder
{
    public static void main(String[] args)
    {
        // Declare local variables
        int n1, n2, n3, n4, n5;
        Scanner kb = new Scanner(System.in); //store input at kb 
        
        // Display program purpose
        System.out.println("This program will ask you to enter four digits, with no spaces in between.");
        System.out.println("The program will split the digits and display each on a separate line. \n");
        
        // Get user to input a 4 digit integer
        System.out.print("Enter a four -digit integer: ");
        n1 = kb.nextInt(); //store input at n1
        
        //Calculation
        n2 = n1 / 1000; // show 1st number in the digit 
        n3 = n1 / 100; //this generate first 2 number of the digit
        n3 = n3 % 10; //show 2nd number in the new n3 digit
        n4 = n1 % 100; //this generate the later 2 number of the digit
        n4 = n4 / 10; //show 1st number in the new n4 digit
        n5 = n1 % 10; //show 4th number in the digit
       
      
        //Display digit result on seperated line 
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        
        // End of program greeting
        System.out.println("Thank you for using the digit ordering application. Good bye!");
    } // End of main() method
} // End of class