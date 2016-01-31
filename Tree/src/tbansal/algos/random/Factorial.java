package tbansal.algos.random;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(10));

	}

	private static int factorial(int n) {
		int result = n;
		while (n > 1) {
			result *= --n;
		}
		return result;
	}

}
