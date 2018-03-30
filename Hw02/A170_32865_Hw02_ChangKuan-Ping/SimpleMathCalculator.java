
/**
 * Write a description of class SimpleMathCalculator here.
 * 
/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 13, 2015
 *
 *  Chapter#:       02
 *  ProjectName:    A170_32865_Hw02_ChangKuan-Ping
 *  File?Class name:    SimpleMathCalculator.java
 *  
 *  Concepts used: println() method, nextInt() method, Scanner library, arithematic calculation, variable assignment, int and double variable
 *
 *  Program Statement: Simple math calculation, addition, subtraction, multiplication,  division and modulus
 *  
 *  Assumptions:    Enter valid integer/float-point-value/ character as requested.
 */
 
 // Import libraries
 import java.util.Scanner;          // Used to accept input from the keyboard
 
 // Main classes - Replace className with the actual class name
 public class SimpleMathCalculator
{
    // Declare global constants -> N/A
    public static void main(String[] args)
    {
        // Declare local variables
        int n1, n2;  
        double n3, n4;
        String name1;
        Scanner kb = new Scanner(System.in);  //enable input to store at kb from keyboard
        
        // Display program purpose
        
        System.out.println("The program performs some simple math calculations.\n");
        
        // Get user input for the name
        System.out.print("First tell me what is your name: ");
        name1 = kb.next(); //name input from user store as name1 variable
        
        //Display result
        System.out.println("Hello, " +name1+ "! Nice to meet you.\n");
        
        System.out.println("I will perform some integer calculation for you.");
        System.out.println("Let's start!\n");
        
        // Get 2 user input integer 
        System.out.print("Please enter two integer numbers separated by a space: ");
        n1 = kb.nextInt();  // 1st integer input to variable
        System.out.print("");
        n2 = kb.nextInt(); // 2nd integer input to variable
 
        //Calculation and assign integer result for each operator
        int aResult = n1 + n2; //addition
        int sResult = n1 - n2; //subtraction
        int mResult = n1 * n2; // multiplication
        int dResult = n1 / n2; // divide
        int moResult = n1 % n2; // modulus
        
        //Display result for each operator type
        System.out.println("The results for Integer arithmetic are:");
        System.out.println("Addition =>         ( " +n1+ " + " +n2+ " ) = " +aResult);
        System.out.println("Subtraction =>      ( " +n1+ " - " +n2+ " ) = " +sResult);
        System.out.println("Multiplication =>   ( " +n1+ " * " +n2+ " ) = " +mResult);
        System.out.println("Division =>         ( " +n1+ " / " +n2+ " ) = " +dResult);
        System.out.println("Modulus =>          ( " +n1+ " % " +n2+ " ) = " +moResult+ "\n");
  
        //Display purpose
        System.out.println("Now I will perform some floating-point calculations for you. ");
        System.out.print("Please enter two double numbers separated by a space: ");
        n3 = kb.nextDouble();  //ask for first double input
        System.out.println("");
        n4 = kb.nextDouble(); //ask for second double input
        
        //Calculation and assign float-point result to variable
        double afResult = n3 + n4;
        double sfResult = n3 - n4;
        double mfResult = n3 * n4;
        double dfResult = n3 / n4;
        double mofResult = n3 % n4;
        
        //Display float-point arithmetic result
        System.out.println("The results for float-point arithmetic are:");
        System.out.println("Addition =>         ( " +n3+ " + " +n4+ " ) = " +afResult);
        System.out.println("Subtraction =>      ( " +n3+ " - " +n4+ " ) = " +sfResult);
        System.out.println("Multiplication =>   ( " +n3+ " * " +n4+ " ) = " +mfResult);
        System.out.println("Division =>         ( " +n3+ " / " +n4+ " ) = " +dfResult);
        System.out.println("Modulus =>          ( " +n3+ " % " +n4+ " ) = " +mofResult+ "\n");
        
        //Display purpose
        System.out.println("Now if I cast the values to (int) the results will be: \n");
        
        //Convert double to int for all result
        int acResult = (int) afResult;
        int scResult = (int) sfResult;
        int mcResult = (int) mfResult;
        int dcResult = (int) dfResult;
        int mocResult = (int) mofResult;
        
        //Display converted float-point arithmetic result
        System.out.println("The results for float-point arithmetic are:");
        System.out.println("Addition =>         ( " +n3+ " + " +n4+ " ) = " +acResult);
        System.out.println("Subtraction =>      ( " +n3+ " - " +n4+ " ) = " +scResult);
        System.out.println("Multiplication =>   ( " +n3+ " * " +n4+ " ) = " +mcResult);
        System.out.println("Division =>         ( " +n3+ " / " +n4+ " ) = " +dcResult);
        System.out.println("Modulus =>          ( " +n3+ " % " +n4+ " ) = " +mocResult+ "\n");
        
        
        // End of program greeting
        System.out.println("Thank you for using the Simple Math application. Good bye!");
    } // End of main() method
} // End of class
