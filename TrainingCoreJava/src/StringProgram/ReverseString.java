package StringProgram;

public class ReverseString {

	public static void main(String[] args) {
		String str = "ABCD";
		String rev = "";

		int len = str.length();
		// System.out.println(len);

		// str.charAt(0);
		// System.out.println(str.charAt(0));
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);//D//DC//DCB//DCBA
			System.out.println(rev);
		}
		System.out.println(rev);
	}

}
