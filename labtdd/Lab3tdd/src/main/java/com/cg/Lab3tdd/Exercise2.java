/**
 * 
 * Create a class containing a method to create the mirror image of a String. 
 * @Author SASI
 */



package com.cg.Lab3tdd;
import java.util.*;
public class Exercise2 {
	
		public static String getString(String s1) {
			StringBuffer str1 = new StringBuffer(s1);
			str1.append('|');
			StringBuffer str2 = new StringBuffer(s1);
			str2.reverse();
			str1.append(str2);
			return str1.toString();
			}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String string1 = sc.next();
			String result = getString(string1);
			System.out.println(result);
			sc.close();

		}

	}


