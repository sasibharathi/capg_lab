/**
 * String Tokenizer Demo 
 * @author SASI
 */
import java.util.Scanner;
import java.util.*;
//import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String digit=sc.nextLine();
		StringTokenizer token=new StringTokenizer(digit);
		int d=0,sum=0;
		System.out.println("Entered digits are"+" ");
		while(token.hasMoreTokens()) {
			String s=token.nextToken();
			d=Integer.parseInt(s);
			System.out.print(d+" ");
			sum=sum+d;
		}
		System.out.println();
		System.out.println("Sum:"+sum);
	}

}
