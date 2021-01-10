/**
 * 
 * Java program that displays the number of characters, lines and words in a text
 * @Author SASI
 */


package com.cg.Lab3tdd;

public class Exercise5 {
	public static void main(String[] args) {
	    //Scanner scanner = new Scanner(System.in);
	    String str="dgcdcjncnfeci //';chjfkdcjxc ";
	    String []words=str.split("[ ,.]+");
	    String []lines=str.split("[\r\n]");
	    System.out.println("No of characters = "+str.length());
	    System.out.println("No of lines = "+lines.length);
	    System.out.println("No of words = "+words.length);
		}

}
