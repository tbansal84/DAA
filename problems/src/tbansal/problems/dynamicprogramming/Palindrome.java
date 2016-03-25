package tbansal.problems.dynamicprogramming;

public class Palindrome {

	// Transform S into T.
	// For example, S = "abba", T = "^#a#b#b#a#$".
	// ^ and $ signs are sentinels appended to each end to avoid bounds checking
	static String preProcess(String s) {
		int n = s.length();
		if (n == 0)
			return "^$";
		String ret = "^";
		for (int i = 0; i < n; i++)
			ret += "#" + s.substring(i, i+1);
		ret += "#$";
		return ret;
	}

	static String longestPalindrome(String s) {
		String processedString = preProcess(s);
		String processedStringarr[] = processedString.split("");
		int n = processedString.length();
		int P[] = new int[n];
		int C = 0, R = 0;
		for (int i = 1; i < n - 1; i++) {
			int i_mirror = 2 * C - i; // equals to i' = C - (i-C)

			P[i] = (R > i) ? Math.min(R - i, P[i_mirror]) : 0;

			// Attempt to expand palindrome centered at i
			while (processedStringarr[i + 1 + P[i]].equals(processedStringarr[i - 1 - P[i]]))
				P[i]++;

			// If palindrome centered at i expand past R,
			// adjust center based on expanded palindrome.
			if (i + P[i] > R) {
				C = i;
				R = i + P[i];
			}
		}

		// Find the maximum element in P.
		int maxLen = 0;
		int centerIndex = 0;
		for (int i = 1; i < n - 1; i++) {
			if (P[i] > maxLen) {
				maxLen = P[i];
				centerIndex = i;
			}
		}

		return s.substring((centerIndex - 1 - maxLen) / 2, maxLen);
	}
	
	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("gggaabaaa"));
		
	}

}
