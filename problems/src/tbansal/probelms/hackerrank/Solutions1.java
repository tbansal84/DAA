package tbansal.probelms.hackerrank;

import java.util.Scanner;

public class Solutions1 {

	public static void main(String[] args) {
		System.out.println(find("BRBRB".split("")));
	}

	private static int find(String arr[]) {
		int strokes = 0;
		String prev = null;
		for (String a : arr) {
			if (prev == null) {
				prev = a;
			}
			if (!prev.equals(a)) {
				strokes++;
			}
			prev = a;

		}
		return strokes+1;

	}

}
