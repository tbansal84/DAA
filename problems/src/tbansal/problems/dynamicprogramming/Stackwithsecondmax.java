package tbansal.problems.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class Stackwithsecondmax {

	private static Stack<Integer> first = new Stack<Integer>();
	private static Stack<Integer> second = new Stack<Integer>();

	private static void push(Integer number) {
		while (!first.isEmpty() && number.compareTo(first.peek()) < 0) {
			second.push(first.pop());
		}
		first.push(number);
		while (!second.isEmpty()) {
			first.push(second.pop());
		}

	}

	private static int pop() {
		int element = first.pop();
		int result = first.pop();
		first.push(element);

		return result;

	}

//	public static void main(String[] args) {
//		int no=1000;
//		List<Integer> ls = new ArrayList<Integer>();
//		Random r=new Random();
//		while (ls.size() < no) {
//			ls.add(r.nextInt(no));
//		}
//
//		long time = System.currentTimeMillis();
//		int i = no-1;
//		while (i>1) {
//			System.out.println(i);
//			push(ls.remove(i));
//			i--;
//		}
//		System.out.println(System.currentTimeMillis() - time);
//		System.out.println(pop());
//
//		
//
//	}
	
	public static void main(String[] args) {
		List ls = new ArrayList();
		try {
			for (int i = 0; i < 105; i++) {

				ObjectControl oc = new ObjectControl();
				ls.add(oc);

			}

		} catch (Exception e) {

		}

		finally {
			System.out.println(ls.size());
		}
		// System.out.println(ObjectControl.count);
	}

}
