/**
 * Program to print the MirrorImage of a String
 * @author SASI
 * 
 */
import java.util.*;
public class MirrorImage {
	public static String getString(String s1) {
		StringBuffer string1 = new StringBuffer(s1);
		string1.append('|');
		StringBuffer string2 = new StringBuffer(s1);
		string2.reverse();
		string1.append(string2);
		return string1.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String string1=sc.next();
		String result=getString(string1);
		System.out.println(result);
		sc.close();
	}

}
