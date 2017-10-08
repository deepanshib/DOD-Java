/* You are given an array of size n and a target sum.
  You've to print all the possible pairs of numbers in the array that sum to the given target sum.
  The time complexity of the code is O(n^2). Optimize the code to lower the time complexity.  
 */

public class Main{
	
    public static void main(String args[]){
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;
        TargetSumPairs(arr, sum);
    }
    
    public static void TargetSumPairs(int[] arr, int sum){
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.println("Count of pairs is "+count);
    }
}
