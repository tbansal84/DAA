package tbansal.algos.datastructures;

import java.math.BigDecimal;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	static int tail;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=5;
		int head=0;
//		 if ( (tail++ & (max - 1)) == head){
//			 System.out.println("hello");
//		 }
		 
		 System.out.println((tail&4));
		 System.out.println(new Integer(tail).toBinaryString(tail));
		 System.out.println((tail++&4));
		 System.out.println(new Integer(tail).toBinaryString(tail));
		 System.out.println((tail++&4));
		 System.out.println(new Integer(tail).toBinaryString(tail));
		 System.out.println((tail++&4));
		 System.out.println(new Integer(tail).toBinaryString(tail));
		 System.out.println((tail++&4));
		 System.out.println(new Integer(tail).toBinaryString(tail));
		 System.out.println((tail++&4));
		 System.out.println(new Integer(tail).toBinaryString(tail));
		 System.out.println((tail++&4));
		 System.out.println(new Integer(tail).toBinaryString(tail));
		 System.out.println((tail++&4));
		 System.out.println(new Integer(tail).toBinaryString(tail));
		 System.out.println(new Integer(4).toBinaryString(4));
		 
	}

}
