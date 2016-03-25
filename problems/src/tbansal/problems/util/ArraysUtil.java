package tbansal.problems.util;

public class ArraysUtil {

	/**
	 * print comma spearated values supplied in array
	 * 
	 * @param array
	 */
	public static void printArrays(Object[] array) {
		for (Object element : array) {
			System.out.println(element + ",");
		}
	}
	
	
	public static void printBinaryForm(Integer i){
		System.out.println(i.toBinaryString(i));
	}
	
	

}
