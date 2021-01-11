package com.cg.lab2.util;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ReverseArrayTest {
    
	
	private ReverseArray revarray;
	 private static int[] EMPTY_ARRAY= {};
		private static int[] SINGLE_ARRAY= {1};
		private static int[] DOUBLE_ARRAY= {10,10};
						
		@Before
		public void setup() {
			revarray=new ReverseArray();
		}
	
		@Test
		public void testsorting_GiveEmptyArray_ShouldReturn0AsInteger() {
			int res=revarray.arraySorting(EMPTY_ARRAY);
					assertEquals(0,res);
		}
		
		@Test
		public void testsorting_GiveSingleArray_ShouldReturn1AsInteger() {
			int res=revarray.arraySorting(SINGLE_ARRAY);
			assertEquals(1,res);
		}
		@Test
		public void testduplicateArraySorting_GivenDuplicateArray_ShouldReturnOneElementAsArray() {
		int result_array[]={10};
		int res[]=revarray.duplicateArraySorting(DOUBLE_ARRAY);
		assertArrayEquals(result_array, res);
		}
      
		

}
