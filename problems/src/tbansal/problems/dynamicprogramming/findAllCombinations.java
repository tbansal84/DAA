package tbansal.problems.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class findAllCombinations {

	public static void main(String[] args) {
		Character[] arr = convertToArray(123);
		List<String> ls = new ArrayList<String>();
		List<String> all = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			ls = createCombinations(arr, ls, all);
		}
		System.out.println(all.size());
	}

	private static List<String> createCombinations(Character arr[], List<String> prevArr, List<String> combinations) {
		List<String> newList = new ArrayList<String>();

		for (Character c : arr) {
			for (String s : prevArr) {
				combinations.add(s + c);
				newList.add(s + c);
				System.out.println(s+c);

			}
			if (prevArr.isEmpty()) {
				combinations.add(c.toString());
				newList.add(c.toString());
				System.out.println(c);

			}
		}

		return newList;
	}

	private static Character[] convertToArray(int number) {
		List<Character> ls = new ArrayList<Character>();

		while (number != 0) {
			ls.add(Integer.toString((number % 10)).toCharArray()[0]);
			number /= 10;
		}

		return ls.toArray(new Character[ls.size()]);

	}

}
