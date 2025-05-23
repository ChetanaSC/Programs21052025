import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Silent";
		String s2 = "listen";

		if (s1.length() == s2.length()) {
			char[] c1 = s1.toLowerCase().toCharArray();
			char[] c2 = s2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));

			if (Arrays.equals(c1, c2)) {
				System.out.println("Anagram");
			} else

			{
				System.out.println("Not an Angram");
			}
		} else {
			System.out.println("Strings length not equal");
		}

	}

}
