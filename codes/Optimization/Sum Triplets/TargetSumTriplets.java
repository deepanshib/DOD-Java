/* You are given an array of size n and a target sum.
  You've to print all the possible triplets of numbers in the array that sum to the given target sum.
  The time complexity of the code is O(n^3). Optimize the code to lower the time complexity.  
 */
public class Main {
	public static void targetTriplet(int A[], int arr_size, int sum) {
		int l, r;
		for (int i = 0; i < arr_size - 2; i++) {
			for (int j = i + 1; j < arr_size - 1; j++) {
				for (int k = j + 1; k < arr_size; k++) {
					if (A[i] + A[j] + A[k] == sum) {
						System.out.println("A Triplet is " + A[i] + " ," + A[j] + " ," + A[k]);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 22;
		int arr_size = A.length;
		targetTriplet(A, arr_size, sum);
	}
}