/**
 * To check whether a string is positive or not
 * @author SASI
 * 
 */
import java.util.*;
public class PositiveString {
	public static boolean positiveString(String string1) {

		for (int index = 0; index < string1.length()-1; index++) {
			if (((string1.charAt(index))) > ((string1.charAt(index + 1)))) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String....");
		String string1 = sc.next();
		System.out.println(positiveString(string1));
		sc.close();

	}

}
