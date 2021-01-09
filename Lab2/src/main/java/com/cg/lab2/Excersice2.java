/**
 * 
 * Sorting the array elements in alphabetical order
 * @Author SASI
 */
package com.cg.lab2;
import java.util.Arrays;

public class Excersice2 {
	public String[] getString(String[] array) {
		String result[] = new String[array.length];
		
		if(array.length==0)
			return null;
		
		Arrays.sort(array);
		if(array.length%2==0){
			for(int i=0;i<array.length/2;i++) {
				result[i] = array[i].toUpperCase();
			}
			for(int i=array.length/2;i<array.length;i++) {
				result[i] = array[i].toLowerCase();
			}
		}
		
		else{
			for(int i=0;i<array.length/2+1;i++) {
				result[i] = array[i].toUpperCase();
			}
			for(int i=array.length/2+1;i<array.length;i++) {
				result[i] = array[i].toLowerCase();
			}
		}
		return result;
	}
}