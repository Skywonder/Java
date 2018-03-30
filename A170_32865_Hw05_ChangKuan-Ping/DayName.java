/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           March 6, 2015
 *
 *  Chapter#:       03
 *  ProjectName:    A170_32865_Hw05_ChangKuan-Ping
 *  File?Class name: DayName.java
 *  
 *  Concepts used: println(), print(), nextInt(), 'switch' statement, Scanner() method.
 *
 *  Program Statement: Show options for user to chose from and request a valid integer input for the result. 
 *  
 *  Assumptions: Input is an integer value in designated range. 
 */
import java.util.Scanner; //get scanner class from library

 public class DayName
{

    public static void main(String[] args)
    {    
     //Declare Scanner object and a variable integer - number
     int number;   
     Scanner keyboard = new Scanner(System.in);
     
     //Show program purpose - show key options 1 to 7 with corresponding 'Day' of the week and ask for user input.
     System.out.println("Hello, this program will convert your input number into the following below: ");
     System.out.println("1 = Sunday 2 = Monday 3 = Tuesday 4 = Wednesday 5 = Thursday 6 = Friday 7 = Saturday");
    
     //Request user for a type 'integer' input.
     number = keyboard.nextInt();
     
     //Use switch statement with case 1 - 7 with corresponding Day Name and a default class with invalid input reply
     switch(number)
     {
        case 1:
            System.out.print("You chose Sunday!");
            break;
        case 2:
            System.out.print("You chose Monday!");
            break;
        case 3:
            System.out.print("You chose Tuesday!");
            break;
        case 4:
            System.out.print("You chose Wednesday!");
            break;
        case 5:
            System.out.print("You chose Thursday!");
            break;
        case 6:
            System.out.print("You chose Friday!");
            break;
        case 7:
            System.out.print("You chose Saturady!");
            break;
        default:
            System.out.print("The day number you entered is invalid");
            break;
        
     }
     
     //End of program message
     System.out.println("");
     System.out.println("Good Bye! Thank you for using the DayName program!"); 
     System.out.println("");
        
        
    } // End of main() method
} // End of class