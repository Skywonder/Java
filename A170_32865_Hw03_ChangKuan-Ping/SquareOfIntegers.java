/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 13, 2015
 *
 *  Chapter#:       02
 *  ProjectName:    A170_32865_Hw03_ChangKuan-Ping
 *  File?Class name: SquareOfIntegers.java
 *  
 *  Concepts used: println(), print(), algorithms, arithmetic calculation. 
 *
 *  Program Statement: Request user input to calculate a squared value. 
 *  
 *  Assumptions:   Input are valid Integers
 */
import java.util.Scanner; //get scanner class from library

 public class SquareOfIntegers
{

    public static void main(String[] args)
    {    
     //Set variable
     Scanner kb = new Scanner(System.in); //enable user input from keyboard
     
     //Display program purpose
     System.out.println(""); //formating 
     System.out.println("**********Square of Integers*************"); //formating
     System.out.println("This program will square an integer for you.\n");
    
     //ask for user input (whole integer)
     System.out.print("Please enter the integer value you wish to square: ");
    int userInput = kb.nextInt(); //read one whole number from keyboard
        
    //simple alogrithmic calculation
    int squaredNum = userInput * userInput;  // X^2 = X * X 
    
    //Display result
     System.out.print("");
     System.out.print("The square of " +userInput+ " is " +squaredNum+ ". \n");
     
     //End program greeting
     System.out.println("Good Bye! Thank you for using the Square of Integer calculator"); 
        
        
    } // End of main() method
} // End of class