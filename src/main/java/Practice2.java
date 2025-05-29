import java.util.Arrays;
import java.util.HashMap;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String z = "chetana is a girl";

		String[] words = z.split(" ");

		System.out.println(Arrays.toString(words));
		String revString = " ";
		for (String w : words) {
			 String revWords = " ";
			for (int i = w.length() - 1; i >= 0; i--) {
				revWords = revWords + w.charAt(i);
			}
			revString = revString + revWords + " ";
		}
		System.out.println(revString);

	}
}
