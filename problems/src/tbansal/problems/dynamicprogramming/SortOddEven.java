package tbansal.problems.dynamicprogramming;

public class SortOddEven {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 21, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19 };

		int odd = 0;
		int even = arr.length - 1;
		try {
			while (even -odd> 0) {
				if (isEven(arr[odd]) && isOdd(arr[even])) {
					swap(arr, odd, even);
					odd++;
					even--;
				} else if (isOdd(arr[odd]) && isEven(arr[even])) {
					odd++;
					even--;
				} else if (isEven(arr[even])) {
					even--;

				} else if (isOdd(arr[odd])) {
					odd++;

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int a:arr){
			System.out.print(a+" ");
		}
	}

	private static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static boolean isOdd(int number) {
		return number % 2 == 1;
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
