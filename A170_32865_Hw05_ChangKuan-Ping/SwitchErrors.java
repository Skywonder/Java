/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           March 6, 2015
 *
 *  Chapter#:       03
 *  ProjectName:    A170_32865_Hw05_ChangKuan-Ping
 *  File?Class name: SwitchErrors.java
 *  
 *  Concepts used: println(), print(), nextInt(), 'switch' statement, Scanner() method.
 *
 *  Program Statement: Show options for user to chose from and request a valid integer input for the result. 
 *  
 *  Assumptions: Input is an integer value in designated range. 
 */
import java.util.Scanner; //get scanner class from library

 public class SwitchErrors
{

    public static void main(String[] args)
    {    
     //Declare Scanner object and a variable integer - number
     int number;   
     Scanner keyboard = new Scanner(System.in);
     
     //Show program purpose - show key options 1,2,3 with cooresponding color and ask for user input.
     System.out.println("Key: 1 = red, 2 = blue, 3 = green");
     System.out.print("Enter a number and I'll return ");
     System.out.print(" the corresponding color. ");
     
     //request user for a type 'integer' input.
     number = keyboard.nextInt();
     
     //Use switch statement with case 1,2,3 with cooresponding color and a default class with no color
     switch(number)
     {
        case 1: 
            System.out.println("You choose red!");
            break;
        case 2:
            System.out.println("You choose blue!");
            break;
        case 3:
            System.out.println("You choose green!");
        default: 
            System.out.println("Color not available!");
            break;
        
     }
     
     //End of program message
     System.out.println("Good Bye! Thank you for using the Switch Errors program!"); 
        
        
    } // End of main() method
} // End of class