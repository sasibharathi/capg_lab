package com.cg.Lab3tdd;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Exercise1Test {
	private Exercise1 exercise1;
	@Before
	public void setup()
	{
		exercise1 = new Exercise1();
	}
	@Test
	public void getArrayof_integerElementAs1Array_AndreturnAsInteger() {
		String ar="1";
		int arr=exercise1.getMethod(ar);
		assertEquals(1,arr);
	}
	@Test
	public void getArrayof_integerElementAsEmptyArray_Andreturn0AsInteger() {
		String ar=" ";
		int arr=exercise1.getMethod(ar);
		assertEquals(0,arr);
	}
	@Test
	public void getArrayof_integerElementAs_morethan2Array_AndreturnSecondsmallestAsInteger() {
		String ar= "1 2 3";
		int arr=exercise1.getMethod(ar);
		String wrd[]=ar.split(" ");
		int len=wrd.length;
		int sum=0;
		for(int index=0;index<len;index++)
		sum+=Integer.parseInt(wrd[index]);
		assertEquals(sum,arr);
	}	

}
