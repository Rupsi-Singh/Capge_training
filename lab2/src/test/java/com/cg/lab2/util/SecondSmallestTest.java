package com.cg.lab2.util;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class SecondSmallestTest {
	
	private SecondSmallest secondSmallest;
	private static int SINGLE_NUMBER=100;
	
	@Before
	public void setup()
	{
		secondSmallest=new SecondSmallest();
	}
     
	@Test
	public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReturn0AsInt() {
		int newNumbers[]= {};
		int result=secondSmallest.getSecondSmallest(newNumbers);
		assertEquals(0,result);
		
	}
	
	@Test
	public void test_getSecondSmallest_Given2IntergersInIntegerArray_ShouldReturn3AsInt() {
		int newNumbers[]= {2,3};
		int result=secondSmallest.getSecondSmallest(newNumbers);
		assertEquals(3,result);
		
	}
	@Test
	public void test_getSecondSmallest_Given3inputsInIntegerArray_ShouldReturn5AsInt() {
		int newNumbers[]= {2,5,6};
		int result=secondSmallest.getSecondSmallest(newNumbers);
		assertEquals(5,result);
		}

}
