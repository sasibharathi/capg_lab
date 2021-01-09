/**
 * 
 * 
 * program to find second smallest element in a given array
 * @author SASI
 *
 */
package com.cg.lab2;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class Excercise1Test {
	private Excercise1 excercise1;
	private static int SINGLE_NUMBER=100;
	
	@Before
	public void setup() {
		excercise1=new Excercise1();
	}
	
	@Test
	public void test_getSecondSmallest_GiveEmptyIntegerArray_ShouldReturn0AsInteger() {
		int newNumbers[]= {};
		int result=excercise1.getSecondSmallest(newNumbers);
		assertEquals(0,result);
	}
	@Test
	public void test_getSecondSmallest_SingleIntegerArray_ShouldReturn1AsInteger() {
		int newNumbers[]= {SINGLE_NUMBER};
		int result=excercise1.getSecondSmallest(newNumbers);
		assertEquals(1,result);
	}
	@Test
	public void test_getSecondSmallest_IntegerArray_ShouldReturn20AsInteger() {
		int newNumbers[]= {3,8};
		int result=excercise1.getSecondSmallest(newNumbers);
		assertEquals(8,result);
	}
}
