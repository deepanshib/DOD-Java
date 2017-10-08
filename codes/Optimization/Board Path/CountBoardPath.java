/* You are given a normal (faces marked from 1 to 6), unbiased dice, a starting point cur and an ending point
   end. You have to count all the possible ways to go from cur to end using the dice. The time complexity of
   the code is O(6^n). Optimize the code to lower the time complexity.
   Example-
   i)Number of paths from 0 to 3 are 4.
   		1) Getting a 3 on the first try.
   		2) 1,1,1
   		3) 1,2
   		4) 2,1
   ii)Number of paths from 0 to 10 are 492.
   
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBoardPath(3, 0));

	}

	public static int countBoardPath(int end, int cur) {
		int count = 0; 
		if (cur == end) {
			return 1;
		}
		if (cur > end) {
			return 0;
		}

		for (int i = 1; i <= 6; i++) {
			count=count+countBoardPath(end, cur+i);
		}
		return count;
	}
}