import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Coinchange {

	public static int greedycoinchange(int givenvalue, int[] givencoins)
	{
		
		// Complete code here to make change of givenvalue using coins in the array givencoins
		// Minimize the number of coins used
		// Input: Coin denominations in array givencoins are already sorted in descending order
		// Output: The number of coins used to make change of givenvalue		
		/*
		 * s = n; 
a = b = c = d = 0;
while(s>=25) s = s - 25; a++;
while(s>=10) s = s - 10; b++;
while(s>=5) s = s - 5; c++;
d = s;
return  (a+b+c+d);
		 */
		
		int currentvalue = givenvalue;
		
		int usedcointype = 0; 
		
		int usedcoinnumber = 0;
		
		while(usedcointype < givencoins.length)
		{
			while(currentvalue >= givencoins[usedcointype])
			{
				currentvalue = currentvalue - givencoins[usedcointype];
				usedcoinnumber ++;
				
			}
			usedcointype++;
			
		}
		
		return usedcoinnumber;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0; // n cents
		
		Scanner reader = new Scanner(System.in);  
		
		System.out.println("Please enter the value you want to make change: ");
		
		n = reader.nextInt();
		
		int[] coins = {25, 10, 5, 1};
		
		
		System.out.println("used "+ greedycoinchange(n, coins)+" coins for "+ n + " cents");
		
		
		
	}

}
