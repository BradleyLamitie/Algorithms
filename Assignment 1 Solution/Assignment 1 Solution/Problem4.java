
public class Problem4 {

	public static void partition(int[] A)
	{
		
		int[] B = new int[A.length];
		int x = A[0];
		int count = 0;
		// Insert elements that are smaller than x into B
		for(int i = 0; i < A.length; i++)
		{
			if(A[i]<x)
			{
				B[count] = A[i];
				count++;
			}
		}
		// Insert elements that are = x into B
			for(int i = 0; i < A.length; i++)
		{
			if(A[i]==x)
			{
				B[count] = A[i];
				count++;
			}
		}
		// Insert elements that are larger than x into B
		for(int i = 0; i < A.length; i++)
		{
			if(A[i]>x)
			{
				B[count] = A[i];
				count++;
			}
		}
		// Put elements back into A
			for(int i = 0; i < A.length; i++)
		{
			A[i] = B[i];
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
		
		System.out.println("After partition:");
		
		System.out.println("Before partition:");
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i] + " ");
			
		}
		
		
		
	}

}
