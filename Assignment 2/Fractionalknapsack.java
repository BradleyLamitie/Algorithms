import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Fractionalknapsack {
	
	
	
	public static void sortitems(ArrayList<item> svd)
	{
		
		// Sort items by value to size ratio in descending order
		Collections.sort(svd, new Comparator<item>(){
		     public int compare(item o1, item o2){
		         if(o1.density == o2.density)
		             return 0;
		         return o1.density > o2.density ? -1 : 1;
		     }
		});
		
		
	}
	
	public static double greedyfractionalknapsack(ArrayList<item> svd, int S){
		
		
		// Complete code here to maximize the value of items in the knapsack
		// Input: Note that items in list svd are SORTED by density ALREADY
		// For 'item', check out the item java class in the folder
		// Output: the value of the knapsack
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max_qty,n;  
      
        ArrayList<item> items=new ArrayList();
		// item 1, value 6, size 1
        items.add(new item(6,1,1));
		// item 2, value 10, size 2
		items.add(new item(10,2,2));
		// item 3, value 12, size 3
		items.add(new item(12,3,3));
		// the size of your knapsack
        max_qty=5;  
		// sort items by value to size ratio
		sortitems(items);
 
        System.out.println("The maximum value we can place into the knapsack is "+ greedyfractionalknapsack(items, max_qty));



}
	
	
}
