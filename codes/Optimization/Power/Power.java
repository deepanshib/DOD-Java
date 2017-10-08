/* Calculate the power n^x. Optimize the code.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		System.out.println(power(n, x));
	}

	public static long power(int n, int x) {
		long result = 1;
		for (; x != 0; x--) {
			result = result * n;
		}

		return result;
	}
}
