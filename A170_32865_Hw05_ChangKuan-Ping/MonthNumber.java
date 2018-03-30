/**
 * Student name:    Chang, Kuan-Ping 
 * CRN # :          32865
 *  Course:         CS 170
 *  Semester:       Spring 2015
 *  Date:           March 6, 2015
 *
 *  Chapter#:       03
 *  ProjectName:    A170_32865_Hw05_ChangKuan-Ping
 *  File?Class name: MonthNumber.java
 *  
 *  Concepts used: println(), print(), nextInt(), next(), 'switch' statement, if-else statement, Scanner() method.
 *
 *  Program Statement: Allow user to input a year, and a month and the program will 
 *                      show the corresponding days in the month of that year. 
 *  
 *  Assumptions: Input integer and string at corresponding position according to direction. 
 */
import java.util.Scanner; //get scanner class from library

 public class MonthNumber
{

    public static void main(String[] args)
    {    
     //Declare Scanner object and two integer variable - year, leapYear, and a String variable - month 
     int number, year, leapYear;   
     String month;
     Scanner keyboard = new Scanner(System.in);
     
     //Show program purpose - Calculate the month number and days of that month in the given year.
     System.out.println("This program calculate the month number and the days of that month: ");
     System.out.println("Given the name of the month 3 letters either in lower or upper case");
     
     //Prompt for user input and read the next integer value for variable year.
     System.out.print("Which year are you talking about?");
     year = keyboard.nextInt();
     
     //Calculate if the year is a leap year - leap year is divisible by 4. 
     leapYear = year % 4;
     
     //Prompt for another user input and read the next string value for variable month.
     System.out.print("Please enter a string representing the first three letters of the month name: ");
     month = keyboard.next();
     month = month.toUpperCase();
     

     //Use switch statement with 12 case with corresponding month and a default class with invalid input reply
     switch (month)
     {
        case "JAN": 
            System.out.println("January is month number 1. It has 31 days");
            break;
        case "FEB":
            if (leapYear == 0)
            {
                System.out.println("February is month number 2. It has 29 days");
            break;}
            else
           { 
               System.out.println("February is month number 2. It has 28 days");
            break;}
        case "MAR":
            System.out.println("March is month number 3. It has 31 days");
            break;
        case "APR":
            System.out.println("April is month number 4. It has 30 days");
            break;
        case "MAY":
            System.out.println("May is month number 5. It has 31 days");
            break;
        case "JUN":
            System.out.println("June is month number 6. It has 30 days");
            break;
        case "JUL":
            System.out.println("July is month number 7. It has 31 days");
            break;
        case "AUG":
            System.out.println("August is month number 8. It has 31 days");
            break;
       case "SEP":
            System.out.println("September is month number 9. It has 30 days");
            break;
       case "OCT":
            System.out.println("October is month number 10. It has 31 days");
            break;
       case "NOV":
            System.out.println("November is month number 11. It has 30 days");
            break;
       case "DEC":
            System.out.println("December is month number 12. It has 31 days");
            break;

       default: 
            System.out.println("The year or month you entered is invalid");
            break;
        
     }
     
     //End of program message
     System.out.println("");
     System.out.println("Good Bye! Thank you for using the MonthNumber program!"); 
     System.out.println("");
        
        
    } // End of main() method
} // End of class