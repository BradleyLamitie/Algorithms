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
				// Input: items in list svd are sorted by density already
				// Output: the value of the knapsack
				
		int currentS = 0;
		int i = 0;
		double valuesum = 0;
		while(currentS + svd.get(i).size < S)
		{
			currentS+=svd.get(i).size;
			valuesum+=svd.get(i).value;
			i++;
		}
		
		int leftsize = S - currentS;
		
		double addvalue = (double)leftsize/svd.get(i).size*svd.get(i).value;
		
		valuesum += addvalue;
		
		return valuesum;
		
		
		/*
		 * sort n items by the ratio v[i]/s[i] in decreasing order
i = 1
currentS = 0
while (currentS + si < S) {
take item of weight si and value vi
currentS += si
i++
 }
		 */
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int max_qty,n;  
         
        Scanner reader = new Scanner(System.in);
         
        System.out.println("Enter no of items");  
        n=reader.nextInt(); 
        ArrayList<item> items=new ArrayList();
 
        
        for(int i=0;i<n;i++)  
        {    
        	System.out.println("Enter the size of item "+ (i+1)); 
        	int s =reader.nextInt();    
        	System.out.println("Enter the value of item "+ (i+1));
            double v =reader.nextDouble();
            item newitem = new item(v,s,(i+1));
            items.add(newitem);
        }
        
 
        System.out.println("Enter maximum volume of knapsack :");  
        max_qty=reader.nextInt();  
 
        greedyfractionalknapsack(items, max_qty);

*/
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
