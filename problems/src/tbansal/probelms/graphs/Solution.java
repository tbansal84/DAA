package tbansal.probelms.graphs;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.err.println(factorialRemainder(100000));

	}

	static int factorialRemainder(int n) {
		BigInteger factorial = new BigInteger("1");
		int numbers = 0;
		for (int i = 1; i <= n; i++) {

			if (factorial.mod(new BigInteger(Integer.toString(i))).intValue() == i - 1) {
				numbers++;
//				System.out.println(i);
			}
			factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
		}

		return numbers;

	}
}
