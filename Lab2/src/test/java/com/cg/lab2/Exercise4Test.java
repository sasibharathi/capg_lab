/**
 * 
 * Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
 * @Author SASI
 */


package com.cg.lab2;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Exercise4Test {
		private Exercise4 exercise4;
		//private static int SINGLE_NUMBER=100;
		
		@Before
		public void setup() {
			exercise4=new Exercise4();
		}
		
		@Test
		public void test_ModifyArray_NullEmptyArray_ShouldReturn0AsInteger() {
			Exercise4 e1=new Exercise4();
			int res[]=e1.ModifyArray(new int[]{});
			assertArrayEquals(new int[]{0},res);
		}
		@Test
		public void test_ModifyArray_SingleIntegerArray_ShouldReturnThatAsInteger() {
			Exercise4 e1=new Exercise4();
			int res[]=e1.ModifyArray(new int[]{1});
			assertArrayEquals(e1.ModifyArray(new int[]{1}),res);
		}
		@Test
		public void test_ModifyArray_IntegerArray_ShouldReturn20AsInteger() {
			Exercise4 e1=new Exercise4();
			int res[]=e1.ModifyArray(new int[]{1,2,3,4,5});
			assertArrayEquals(new int[]{5,4,3,2,1},res);
		}
	}
