package Array;

public class DuplicateeElementsfromArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 2, 4, 6, 7, 8, 8 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Duplicate element in given array:");
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}

//1==2
//1==3
//1==4
//1==4
//1==2
//1==
