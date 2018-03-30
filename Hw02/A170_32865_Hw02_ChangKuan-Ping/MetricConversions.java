/**
 * Write a description of class SimpleMathCalculator here.
 * 
/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 19, 2015
 *
 *  Chapter#:       02
 *  ProjectName:    A170_32865_Hw02_ChangKuan-Ping
 *  File?Class name:    MetricConversions.java
 *  
 *  Concepts used: println() method, nextInt() method, Scanner library, arithematic calculation, variable assignment, setting constant 
 *
 *  Program Statement: Simple math calculation, addition, subtraction, multiplication,  division and modulus
 *  
 *  Assumptions:    Enter valid integer/float value.
 */
 
 // Import libraries

 import java.util.Scanner;          // Used to accept input from the keyboard
        
 // Main classe
 public class MetricConversions
{
    //Constant
    private static final double INCH_PER_METER = 39.3701;
    private static final int INCH_PER_MILE = 63360;
    private static final int INCH_PER_YARD = 36;
    private static final int INCH_PER_FOOT = 12;
    // Declare global constants -> N/A
    public static void main(String[] args)
    {
        // Declare local variables
        Scanner kb = new Scanner(System.in);  //set kb to accept input form keyboard
        int numMeter;
       
        // 1 mile = 1609.344 meter, 1 yard = .9144 meter, 1 ft = .3048 meter, 1 inch = .0254 INCH
        
        //Display program purpose and ask for input
        System.out.println("Hello, This program converts INCH to miles, yards , feet, and inches");
        System.out.print("Please enter the number of INCH(ex. 2000): ");
        numMeter = kb.nextInt();  //set input to store in variable numMeter
        
        //Calculations. Converting by getting total Inches from meters.
        int oriInch = (int)(numMeter * INCH_PER_METER);
        int numMile = oriInch/INCH_PER_MILE; //int Miles
        int numYard = (oriInch % INCH_PER_MILE) / INCH_PER_YARD; //int Yard -> use remainder to calculate
        int numFoot = ((oriInch % INCH_PER_MILE) % INCH_PER_YARD) / INCH_PER_FOOT; //int Foot -> use remainder to calculate
        int numInch = (((oriInch % INCH_PER_MILE) % INCH_PER_YARD) % INCH_PER_FOOT); //int Inches -> use remainder to calculate
        
        //Show results. original meter = This many miles, yards, foot, and inches
        System.out.println(numMeter + " meters = " + numMile + " mile(s), \n" + numYard + " yard(s), \n" + numFoot + " feet, and \n" + numInch + " inch(es).");
        
        //End Greeting
        System.out.println("");
        System.out.println("Thanks for using the Metric Conversions application. Good bye!");
        System.out.println("------------------------------------------------");
        System.out.println("");
    } // End of main() method
} // End of class
