package Problems;


public class Problem3 {
	
	public static boolean checksum(int[] A, int t)
	{
		/*
	Input: an array, A, of n integers (positive, negative, or 0), and an integer value t.
	Output: “yes” if there exist three indices i, j and k, with 0 <= i < j < k <= n-1, such
	that A[i] + A[j] + A[k] = t, and “no” otherwise.
		 */
		
		//Check all combinations of values to get the value were looking for and return whether or not its possible. 
		for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				for(int k=j+1;k<A.length;k++){
					if(A[i]+A[j]+A[k] == t){
						return true;
					}
				}
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your checksum method
		
		// int[] A = {28, -70, -23, 92, 56, -33, -77};
		// int t = -47;
		// System.out.println("There exist three indices i, j and k, such that A[i] + A[j] + A[k] =" + t + " : " + checksum(A,t));
		
		// Required: Please test your method with a different array and t, you can make up an array, and t
		
		// Complete the code here.
		
		int[] A = {7, 8, 17, 25, 112, 153, 72, 1, 0, 5, 10, 15 };
		int t = 87;
		System.out.println("There exist three indices i, j and k, such that A[i] + A[j] + A[k] =" + t + " : " + checksum(A,t));
		
		
		
	}

}
