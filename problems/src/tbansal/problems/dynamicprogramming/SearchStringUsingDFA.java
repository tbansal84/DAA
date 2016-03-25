package tbansal.problems.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class SearchStringUsingDFA {
	public static final int NO_OF_CHARS = 4;

	public static int getNextState(char[] pat, int lengthofArray, int state,
			char alphabet) {
		/*
		 * If the character c is same as next character in pattern, then simply
		 * increment state
		 */
		if (state < lengthofArray && alphabet == pat[state]) {
//			System.out.println("found " + alphabet);
			return state + 1;

		}
		int ns, i;
		/*
		 * ns stores the result which is next state ns finally contains the
		 * longest prefix which is also suffix in "pat[0..state-1]c" Start from
		 * the largest possible value and stop when you find a prefix which is
		 * also suffix
		 */
		for (ns = state; ns > 0; ns--)// 6
		{
			if (pat[ns - 1] == alphabet)// alp[5]
			{
				for (i = 0; i < ns - 1; i++) {
					if (pat[i] != pat[state - ns + 1 + i]) {
//						System.out.println(state - ns + 1 + i);
//						System.out.println(i);
						// System.out.println(pat[i] + "--" + pat[state - ns + 1
						// + i]);
						break;
					}
				}
				if (i == ns - 1)
					return ns;
			}
		}
		return 0;
	}
	
	static char[] chars={'a','c','g','t'};

	/*
	 * This function builds the TF table which represents Finite Automata for a
	 * given pattern
	 */
	public static void computeTF(char[] pat, int M, int[][] TF) {
		int state, x;
		for (state = 0; state <= M; ++state) {
			for (x = 0; x < NO_OF_CHARS; ++x) {
				TF[state][x] = getNextState(pat, M, state, chars[x]);
				System.out.print(TF[state][x]);
			}
			System.out.println("\n");
		}
	}

	/*
	 * Prints all occurrences of pat in txt
	 */
	public static void search(char[] pat, char[] txt) {
		int M = pat.length;
		int N = txt.length;
		int[][] TF = new int[M + 1][NO_OF_CHARS];
		computeTF(pat, M, TF);
		// Process txt over FA.
		int i, state = 0;
		for (i = 0; i < N; i++) {
			state = TF[state][Arrays.binarySearch(chars, txt[i])];
			if (state == M) {
				System.out.print(pat);
				System.out.print(" found at " + (i - M + 1));
			}
		}
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the main string: ");
		String main = "aabcbabcbcabcbabcaabababca";
		// System.out.println("Enter the pattern string: ");
		String pattern = "acacacaga";
		search(pattern.toCharArray(), main.toCharArray());
		// sc.close();
	}
}