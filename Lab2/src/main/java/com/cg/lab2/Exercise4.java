/**
 * 
 * Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
 * @Author SASI
 */
package com.cg.lab2;
import java.util.Arrays;

	public class Exercise4 {
		 static int[] ModifyArray(int arr[]) {
			 if(arr.length==0) {
				 return new int[]{0};
			 }
			 if(arr.length==1) {
				 return arr;
			 }
				int size= arr.length;
				int index=0;
				for (int i=0; i<size-1;i++) 
					if (arr[i]!=arr[i+1]) 
						arr[index++] = arr[i];
					arr[index++]=arr[size-1];
					int[] ans=new int[index];
					int k=0;
					while(index-->0) {
						ans[k++]=arr[index];
					}
					return ans;
		}
		
		 	public static void main(String[] args) {
		 		int arr[]={1,2,3,3,4,4,4,5,5};
		 		int size=arr.length;
		 		int[] n=ModifyArray(arr);
		 		for(int i=0;i<n.length;i++) 
		 			System.out.print(n[i]+" ");
		 	}

	}



