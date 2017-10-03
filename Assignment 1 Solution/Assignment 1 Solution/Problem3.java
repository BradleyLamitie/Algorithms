
public class Problem3 {
	
	public static boolean checksum(int[] A, int t)
	{
		/*
Input: an array, A, of n integers (positive, negative, or 0), and an integer value t.
Output: “yes” if there exist three indices i, j and k, with 0 = i < j < k = n-1, such
that A[i] + A[j] + A[k] = t, and “no” otherwise.
		 */
		for (int i = 0; i < A.length-2; i++)
			for(int j = i+1; j < A.length-1; j++)
				for(int k = j+1; k < A.length; k++)
					if((A[i] + A[j] + A[k]) == t)
					{
						// We check every possible pair
						System.out.println("Yes");
						return true;
					}
		System.out.println("No");
		return false;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your checksum method
		
		int[] A = {28, -70, -23, 92, 56, -33, -77};
		int t = -47;
		System.out.println("There exist three indices i, j and k, such that A[i] + A[j] + A[k] =" + t + " : " + checksum(A,t));
		
		// Required: Please test your method with a different array and t, you can make up an array, and t
		int[] B = {1,2,3,4,5,6,7,8,9,10};
		int t2 = 10;
		System.out.println("There exist three indices i, j and k, such that A[i] + A[j] + A[k] =" + t2 + " : " + checksum(B,t2));
		// Complete the code here.
		
		
		
		
		
	}

}
