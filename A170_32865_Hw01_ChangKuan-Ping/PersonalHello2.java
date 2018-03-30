/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 3, 2015
 *
 *  Chapter#:       01
 *  ProjectName:    A170_32865_hw01_ChangKuan-Ping
 *  File?Class name:    PersonalHello2.java
 *  
 *  Concepts used: println() method, next() method, Scanner(System.in)
 *
 *  Program Statement: The program will ask for user input and then display a greeting
 *  
 *  Assumptions:   N/A
 */ 
 // Main classes - Replace className with the actual class name
 //to read input from command line
 //to use Scanner object
 import java.util.Scanner; //used to accept input from keyboard
 
 public class PersonalHello2
{
    //Global constant -> none
    public static void main(String[] args)
    {
        //local variables
        String name;                                   //Declare string for user name
        Scanner kb = new Scanner(System.in);           //An object to get a value from keyboard
        // Display program purpose
        System.out.println("This is my second program");
        
        //get user input 
        System.out.print("What is your name? ");
        name = kb.next();
        
        //process -> no need
        
        //display result
        System.out.println("Welcome to Computer Programming " + name);
        
        // End of program greeting
        System.out.println("Good bye!!");
        
    } // End of main() method
} // End of class
