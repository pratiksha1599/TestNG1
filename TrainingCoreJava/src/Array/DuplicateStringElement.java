package Array;

public class DuplicateStringElement {
	public static void main(String[] args) {

		String arr[] = { "java", "Python", "C++", "C","java" };
       boolean flag= false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Fond Duplicate Element:" + arr[i]);
				}
			}
		}

		if(flag==false) {
			System.out.println("Duplicate element not found");
		}
	}
}
