package tbansal.algos.search;

public class BinarySearch {

	public static void main(String[] args) {

		System.out.println(search(new int[] {1,2,3,4,5,6,7,8 },6,0,6));

	}

	private static int search(int[] arr,int element,int first,int last) {
		

		int mid=(first+last)/2;
		System.out.println(first+","+mid+","+last);
		int temp=arr[mid];
		if(element!=temp){
			return search(arr, element,element<temp?first:mid,element<temp?mid:last);
		}
		else{
			return mid;
		}
		
		
	}
	
	

}
