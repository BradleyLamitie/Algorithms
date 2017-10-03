package Assignment3;


public class Problem3 {

	// Create a mergeklists() to merge 3 sorted arrays into one sorted array
	// Input: 3 sorted arrays a1[], a2[], a3[]
	// Output: one sorted array a[] that contains all the elements from input arrays
	// Complete the code here.
	public static void merge3lists(int[] a1, int[] a2, int[] a3, int[] a)
	{
		int i = 0;
		int j = i;
		int k = j;
		for(int index = 0; index < a.length; index++){
			if(i< a1.length && (j>= a2.length || a1[i] < a2[j])){
				if(k >= a3.length || a1[i] < a3[k]){
					a[index]= a1[i];
					i++;
				}else{
					a[index] = a3[k];
					k++;
				}
			}else{ 
				if(j < a2.length && (k >= a3.length || a2[j]<a3[k])){
					a[index]= a2[j];
					j++;
				}else{
					a[index] = a3[k];
					k++;
				}
				
			}
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] l1 = {1,5,9,10,20};
		
		int[] l2 = {2,4,5,6,7,9,15};
		
		int[] l3 = {3,8,13,15,22};
		
		int[] newl = new int[l1.length+l2.length+l3.length];
		
		// Required: Test your mergeklists() over l1, l2, l3,
		// Complete the code here.
		
		merge3lists(l1,l2,l3,newl);
		for(int i = 0; i< newl.length; i++)
		{
			System.out.print(newl[i]+ " ");
		}
		
		
	}

}
