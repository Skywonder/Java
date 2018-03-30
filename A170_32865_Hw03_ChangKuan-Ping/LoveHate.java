/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 13, 2015
 *
 *  Chapter#:       02
 *  ProjectName:    A170_32865_Hw03_ChangKuan-Ping
 *  File?Class name: LoveHate.java
 *  
 *  Concepts used: println(), print(), nextLine(), and replace() methods 
 *
 *  Program Statement: Enter a line of text with word hate, the program replace the 'hate' word to love. 
 *  
 *  Assumptions:   Input has to be a valid string containing the specific word 'hate' with same formatting
 */
import java.util.Scanner; //import from library to enable keyboard input recongnition

 public class LoveHate
{   
    public static void main(String[] args)
    {
     //set variable
     Scanner input = new Scanner(System.in);  //store User input at input
        
     //Program purpose. 
     System.out.println("This program reads in a line of text");
     System.out.println("then output the line with the 'first' occurrence of the word 'hate' changed to the word 'love'. \n");
     
     //Ask for user input a string
     System.out.println("Enter a line of text with the word 'hate'.") ;
     String hateSentence = input.nextLine(); // execute the line
 
     //Assign the replaced string to new string using replace method
     String loveSentence = hateSentence.replace("hate", "love"); //  .replace(to be replaced, is replaced by)
     
     //Display result
     System.out.println("");
     System.out.println("I have rephrased that line to read: \n" + loveSentence + "\n");
     
     //End program greeting
     System.out.println("Good Bye! Thank you for using the LoveHate string replacement"); 
        
        
    } // End of main() method
} // End of class