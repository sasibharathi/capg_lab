/**
 * 
 * 
 * program to find second smallest element in a given array
 * @author SASI
 *
 */
package com.cg.lab2;
public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,3,5};
		int res=getSecondSmallest(arr);
		System.out.println("The second Smallest element is:"+res);
	}
	static int getSecondSmallest(int[] array) {
		int temp,size;
		if(array.length==0) {
			return 0;
		}
		if(array.length==1) {
			return array[0];
		}
		size=array.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array[1];
	}

}
