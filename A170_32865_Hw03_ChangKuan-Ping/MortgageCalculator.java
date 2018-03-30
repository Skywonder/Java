/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 13, 2015
 *
 *  Chapter#:       02
 *  ProjectName:    A170_32865_Hw03_ChangKuan-Ping
 *  File?Class name: MortgageCalculator.java
 *  
 *  Concepts used: println(), print(), addition, subtraction, division, variable assignment, Scanner import, nextInt() 
 *
 *  Program Statement: Request user input to calculate mortgage using Arithmetic calculation and equations
 *  
 *  Assumptions:   Input are valid Integers
 */
import java.util.Scanner;

 public class MortgageCalculator
{
    private static final double ANNUAL_RATE = 7.49/100;  //Annual Rate given was in percent so have to convert to decimal
    
    public static void main(String[] args)
    {
     int wholeDollar, principleOwed;   //2 predefine variable
        
     Scanner kb = new Scanner(System.in);   //Allow keyboard input to be stored at kb
        
     //Display program purpose: Show mortgageCalculation
     System.out.println ("===================MortgageCalculator=================");
     System.out.println("This program asks the user to enter the amount of a mortgage, and ");
     System.out.println("the outstanding balance ( the amount still owed),");
     System.out.println("then use an annual interest rate of 7.49% to calculate and display");
     System.out.println("the amount of the payment that goes to interest, ");
     System.out.println("the amount of the payment that goes to principal, ");
     System.out.println("and the new principle (the new balance). \n");
     
     //Asks for user input: Integers for monthly pay and principle owed
     System.out.println("Enter this month's payment (in whole dollars): ");
     wholeDollar = kb.nextInt(); //get next integer value
     
     System.out.println("Enter the principle owed (in whole dollars): ");
     principleOwed = kb.nextInt();
     
     //Arithmetic calculation for interest Amount, value to principle, and new Principle
     int interestAmount = (int)(principleOwed * (ANNUAL_RATE/12));
     int valueToPrinciple = wholeDollar - interestAmount;
     int newPrinciple = principleOwed - valueToPrinciple;
     
     //Show results: 
     System.out.println("Previous Balance: " + principleOwed);  //money owe
     System.out.println("Payment: " + wholeDollar);             //month earn to use for payment
     System.out.println("Interest Paid: " + interestAmount);    //interest that have to be paid per month
     System.out.println("Amount applied to principle: " + valueToPrinciple); //the actual value w/o interest can be paid
     System.out.println("New Balance: " + newPrinciple + "\n"); //The remaining owe money
        
     //End program greeting
     System.out.println("Good Bye! Thank you for using the Mortgage Calculator"); 
        
        
    } // End of main() method
} // End of class