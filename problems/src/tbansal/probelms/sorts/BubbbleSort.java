package tbansal.probelms.sorts;

public class BubbbleSort {

	public static void main(String[] args) {

		sort(new int[] { 7,2, 4, 6,3, 1, 5 });

	}

	private static void sort(int[] arr) {

		boolean swap=true;
		while (swap) {
			swap = false;
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					swap(arr, j , j+1);
					swap = true;
				}
				print(arr);

			}
		}
		System.out.println(arr);
		
		print(arr);
	}
	
	private static void print(int[] arr){
		for(int a:arr){
			System.out.print(a+",");
		}
		System.out.println("");
	}

	private static void swap(int[] arr, int i, int j) {
		int swap = arr[j];
		arr[j] = arr[i];
		arr[i] = swap;

	}

}
