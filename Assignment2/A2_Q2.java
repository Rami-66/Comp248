//-----------------------------------------------------------------
// Assignment 2
//Written by: Rami Al Najem 40242034
// For COMP 248 section EC - Fall 2022
//-----------------------------------------------------------------
// This program has an object to compute the price index I for the distribution center for both domestic and international market
// depending on the month of the year, where the user will enter the month and the type of market respectively.
import java.util.Scanner;// import java.util package.
public class A2_Q2 {
	public static void main(String[] args) 
	{
		// Display a welcome message for the user
		System.out.println("Welcome to Farms Distribution Cnter Price Index Program:");
		System.out.println("========================================================");
		System.out.print("\nPlease enter a Month and Market, respectively:");
		// Create a scanner object
		Scanner keyboard= new Scanner(System.in);
		// Make the inputs case-insensitive by using .toUpperCase
		String month_insensitive = keyboard.next().toUpperCase();
		String market_insensitive = keyboard.next().toUpperCase();
		// Declare the initial production constant W
		final double W = 1.4672;
		// Declare the variables p and i
		double p, i;
		// Create a switch statement for the market_insensitive 
		switch(market_insensitive)
		{
		// Create a case for domestic market 
		case"DOMESTIC":
		{
			// Create a switch statement for the month_insensitive
		switch(month_insensitive)
		{
		// Create cases for each month and compute the price index for each value of p
		// Display the price index confirmation message for the user.
		case"JANUARY":
		{
			p = 75.25;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"FEBRUARY":
		{
			p = 62.86;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"MARCH":
		{
			p = 54.78;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"APRIL":
		{
			p = 68.46;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"MAY":
		{
			p = 35.89;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"JUNE":
		{
			p = 28.94;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"JULY":
		{
			p = 42.50;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"AUGUST":
		{
			p = 86.10;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"SEPTEMBER":
		{
			p = 69.7;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"OCTOBER":
		{
			p = 85.4;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"NOVEMBER":
		{
			p = 75.9;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		case"DECEMBER":
		{
			p = 76.8;
			i = (1/20.0) *(p*W);	
			System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
			System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
			break;
		}
		// Display an error message to the user if they mispronounced the month and ask them to retry again.
		// Display a value of 0.00 for the price index
		// Display a thank message for the user
		default:
		{
			System.out.println("Error: An invalid value has been entered for the 'Month' variable. Please retry again!");
			System.out.println("\nThe value of the Price Index, 'I' is: 0.00");
		System.out.println("Thank you for using Farms Distribution Center Price Index Program!");
		}
		}
		break;
		}
		case"INTERNATIONAL": // Create a case for international market
		{
			// Create a switch statement for the month_insensitive
			switch(month_insensitive)
			{
			// Create cases for each month and compute the price index for each value of p
			// Display the price index confirmation message for the user.
			case"JANUARY":
			{
				p = 24.75;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"FEBRUARY":
			{
				p = 37.14;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"MARCH":
			{
				p = 45.22;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"APRIL":
			{
				p = 31.54;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"MAY":
			{
				p = 64.11;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"JUNE":
			{
				p = 71.06;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"JULY":
			{
				p = 57.5;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"AUGUST":
			{
				p = 13.9;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"SEPTEMBER":
			{
				p = 30.3;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"OCTOBER":
			{
				p = 14.6;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"NOVEMBER":
			{
				p = 24.1;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			case"DECEMBER":
			{
				p = 23.2;
				i = (1/20.0) *(p*W);	
				System.out.printf("\nThe value of the Price Index, 'I', is: %.2f ",i);
				System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
				break;
			}
			default:
			{
				System.out.println("Error: An invalid value has been entered for the 'Month' variable. Please retry again!");
				System.out.println("\nThe value of the Price Index, 'I' is: 0.00");
			System.out.println("Thank you for using Farms Distribution Center Price Index Program!");
			}
			}
			break;
		}
		default:
			// Display an error message if the user put the market first instead of the month and ask him/her to try again.
			// Display the value 0.00 for the price index.
			// Display a thank message for the user.
		{
			System.out.println("Error: An invalid value has been entered for the 'Market' variable. Please retry again!");
			System.out.println("\nThe value of the price index, 'I', is: 0.00");
			System.out.println("Thank you for using Farms Distribution Center Price Index Program!");
		}
		}
		// close scanner object.
		keyboard.close();
	}
}
