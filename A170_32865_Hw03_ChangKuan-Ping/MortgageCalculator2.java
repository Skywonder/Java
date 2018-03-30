/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           Feb 13, 2015
 *
 *  Chapter#:       02
 *  ProjectName:    A170_32865_Hw03_ChangKuan-Ping
 *  File?Class name: MortgageCalculator2.java
 *  
 *  Concepts used: println(), print(), printf(), addition, subtraction, division, variable assignment, Scanner import, nextDouble() 
 *
 *  Program Statement: Request user input to calculate mortgage using Arithmetic calculation and equations. The outputs are formated. 
 *  
 *  Assumptions:   Input are valid float-point value or Integers
 */
import java.util.Scanner;

 public class MortgageCalculator2
{
    
    public static void main(String[] args)
    {
     double wholeDollar, principleOwed, annualRate;   //double variable wholeDollar, principleOwed, and AnnualRate 
        
     Scanner kb = new Scanner(System.in);   //Allow keyboard input to be stored at kb
        
     //Display program purpose: Show mortgageCalculation
     System.out.println ("===================MortgageCalculator 2=================");
     System.out.println("This program asks the user to enter the amount of a mortgage, ");
     System.out.println("the outstanding balance ( the amount still owed), and interest rate ");
     System.out.println("and calculate and displays");
     System.out.println("the amount of the payment that goes to interest, ");
     System.out.println("the amount of the payment that goes to principal, ");
     System.out.println("and the new principle (the new balance). \n");
     
     //Asks for user input: Double or Integer (wholeDollar, principleOwed, annualRate)
     System.out.print("Enter this month's payment (dollar.cents): ");
     wholeDollar = kb.nextDouble();
     
     System.out.print("Enter the principle owed (dollar.cents): ");
     principleOwed = kb.nextDouble();
     
     System.out.print("Enter the rate: ");
     annualRate = kb.nextDouble();
     
     //Arithmetic calculation
     double interestAmount = principleOwed * (annualRate/1200); //1200 is 12 * 100 to get decimal instead of percent
     double valueToPrinciple = wholeDollar - interestAmount;
     double newPrinciple = principleOwed - valueToPrinciple;
     
     //Show results: Using format %.2f = float value with 2 decimal, %n = move cursor to next line
     System.out.printf("Previous Balance: %.2f%n", principleOwed);  //money owe
     System.out.printf("Payment: %.2f%n", wholeDollar);             //month earn to use for payment
     System.out.printf("Interest Paid: %.2f%n", interestAmount);    //interest that have to be paid per month
     System.out.printf("Amount applied to principle: %.2f%n" , valueToPrinciple); //the actual value w/o interest can be paid
     System.out.printf("New Balance:  %.2f%n", newPrinciple); //The remaining owed money
        
     //End program greeting
     System.out.println("");
     System.out.println("Good Bye! Thank you for using the Mortgage Calculator"); 
        
        
    } // End of main() method
} // End of class