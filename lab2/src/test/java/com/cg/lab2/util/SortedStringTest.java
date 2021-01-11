/**
 * Create a method that can accept an array of String objects and 
 * sort in alphabetical order. The elements in the left half should be
 *  completely in uppercase and 
 * the elements in the right half should be completely in lower case.
 * @author Rupsi
*/
package com.cg.lab2.util;
import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;
public class SortedStringTest {
	private SortedString sortedstring;
	
	@Before
	public void setup()
	{
		sortedstring=new SortedString();
	}
	
	@Test
	public void test_sortStrings_GivenEmptyStringArray_ShouldReturnEmptyStringMsg() {
		String s[]= {};
		String result=sortedstring.sortStrings(s);
		assertEquals("Empty String",result);
		
	}
	
	@Test
	public void test_sortStrings_GivenOnly1ElementInStringArray_ShouldReturnSameString() {
		String s[]= {"ram"};
		String result=sortedstring.sortStrings(s);
		assertEquals(s[0],result);
		
	}
	@Test
	public void test_sortStrings_Given2ElementsInStringArray_ShouldReturnSortedString() {
		String s[]= {"ram","shyam"};
		String result=sortedstring.sortStrings(s);
		assertEquals("RAM shyam ",result);
		
	}
	

}
