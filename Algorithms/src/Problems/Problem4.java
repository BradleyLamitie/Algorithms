package Problems;

public class Problem4 {

	public static void partition(int[] A)
	{
		//instantiate variables
		int partition = A[0];
		int[] B = new int[A.length];
		int start = 0;
		int end = B.length-1;
		//print the value of the partition
	    System.out.println("partition = " + partition);
	    //go through all the elements and either put them at the front or end of the new array B
	    for(int i=1;i<A.length;i++){
	    	if(A[i]<=partition){
	    		B[start] = A[i];
	    		start++;
	    	}
	    	else
	    	{
	    		B[end]=A[i];
	    		end--;
	    	}
	    }
	    //if start and end are equal we must be at where the partition belongs in array B
		if(end == start){
			B[start] = partition;
			//Clone B[] and overwrite it onto A[]
			A = B.clone();
		}
		
		//print all the values in the Array
		System.out.println("After partition:");
		
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i] + " ");
		}
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] A = {4,3,9,2,7,6,5};
		
		System.out.println("Before partition:");
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i] + " ");
			
		}
		
		partition(A);
		
		
		
		
	}

}
