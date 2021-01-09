/**
 * 
 * Sorting the array elements in alphabetical order
 * @Author SASI
 */

package com.cg.lab2;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class Excersice2Test {
	private Excersice2 excersice2;
	
	
	@Before
	public void setup() {
		excersice2 = new Excersice2();
	}
	
	@Test
	public void test_sortAndConversion_givenEmptyArrayString_shouldReturnNullAsString() {
		String input[] = {};
		String result[] = excersice2.getString(input);
		assertEquals(null,result);
	}
	
	@Test
	public void test_sortAndConversion_given1ElementArrayString_shouldReturnStringArrayAsOutput() {
		String input[] = {"a"};
		String result[] = excersice2.getString(input);
		assertEquals("A",result[0]);
	}
	
	@Test
	public void test_sortAndConversion_given2ElementArrayString_shouldReturnStringArrayAsOutput() {
		String input[] = {"ab","bc"};
		String result[] = excersice2.getString(input);
		assertEquals("bc",result[1]);
	}
	
	
}
