
//Bradley Lamitie     2/28/2017     CMPT435 
package Assignment2;
import java.util.Scanner;

public class Coinchange {

	private static Scanner reader;


	public static int greedycoinchange(int givenvalue, int[] givencoins)
	{
		// Complete code here to make change of givenvalue using coins in the array givencoins
		// Minimize the number of coins used
		// Input: Coin denominations in array givencoins are already sorted in descending order
		// Output: The number of coins used to make change of givenvalue
		int coins = 0;
		// check each coin to see how many times it can fit in the value leftover. 
		for(int i = 0; i<givencoins.length; i++){
			coins += givenvalue / givencoins[i];
			givenvalue = givenvalue % givencoins[i] ;
		}
		
		return coins;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0; // n cents
		
		reader = new Scanner(System.in);  
		
		System.out.println("Please enter the value you want to make change: ");
		
		n = reader.nextInt();
		
		// infinite supply of quarters, dimes, nickles, and pennies
		int[] coins = {25, 10, 5, 1};
		
		System.out.println("used "+ greedycoinchange(n, coins)+" coins for "+ n + " cents");
		
		
		
	}

}
