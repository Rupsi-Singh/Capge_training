package com.cg.lab2.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class RemoveDuplicateTest {
	private RemoveDuplicate remdup;
    private static int[] EMPTY_ARRAY= {};
	private static int[] SINGLE_ARRAY= {1};
	private static int[] DOUBLE_ARRAY= {10,10};
	private static int[] ANY_NUM_OF_ARRAY= {2,2,6,8,9,5,1,8};
	
	@Before
	public void setup() {
		remdup=new RemoveDuplicate();
	}

	@Test
	public void test_GiveEmptyArray_ShouldReturn0AsInt() {
		int res=remdup.removingDuplicate(EMPTY_ARRAY);
				assertEquals(0,res);
	}
	@Test
	public void test_GiveSingleArray_ShouldReturn1AsInt() {
		int result[]= {1};
		int res[]=remdup.sortSingleArray(SINGLE_ARRAY);
		assertArrayEquals(result,res);
	}

}
