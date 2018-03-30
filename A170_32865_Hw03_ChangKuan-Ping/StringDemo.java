/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 13, 2015
 *
 *  Chapter#:       02
 *  ProjectName:    A170_32865_Hw03_ChangKuan-Ping
 *  File?Class name: StringDemo.java
 *  
 *  Concepts used: println(), print(), length() methods
 *
 *  Program Statement: Request user input for a string and count the total length of the string. 
 *  
 *  Assumptions:   Input are valid strings/characters, and the user is following the requested format
 */
import java.util.Scanner; //get scanner class from library

 public class StringDemo
{

    public static void main(String[] args)
    {    
     //Set variable
     Scanner kb = new Scanner(System.in); //enable user input from keyboard
     
     //Request for user input - without space
     System.out.print("Enter a string containing no spaces: ");
     String userInput = kb.nextLine(); //read the line input from kb
     
     //Display program purpose -without space
     System.out.print("You entered: " + userInput + "\n");
     System.out.println("The string length is: " + userInput.length() + "\n");//.length() method count the characters in the string variable
     
     //Request for user input - with space
     System.out.print("Now, enter a string containing spaces: ");
     String userInput2 = kb.nextLine(); //read the line input from kb
      
     //Display program purpose - with space
     System.out.print("You entered: " + userInput2 + "\n");
     System.out.println("The string length is: " + userInput2.length() + "\n"); //.length() method count the characters in the string variable
     
     //End program greeting
     System.out.println("Good Bye! Thank you for using the String Demo"); 
        
        
    } // End of main() method
} // End of class