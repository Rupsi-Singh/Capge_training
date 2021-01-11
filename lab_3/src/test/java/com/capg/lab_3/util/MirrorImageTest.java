/**
 * Create a class containing a method to create the mirror image of a String
 * @author Rupsi
 */
package com.capg.lab_3.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MirrorImageTest {
	
	private MirrorImage mirrorimage;
	
	@Before
	public void setup()
	{
		mirrorimage=new MirrorImage();
	}
	@Test
	public void test_generateMirrorimage_GivenEmptyString_ShouldReturnEmptyStringMsg() {
		String s= "";
		String result=mirrorimage.getImage(s);
		assertEquals("Empty String",result);
		}
	
	@Test
	public void test_generateMirrorimage_Given1CharacterAsInput_ShouldReturnSameChar() {
		String s="R";
		String result=mirrorimage.getImage(s);
		assertEquals("R",result);
		
	}
	@Test
	public void test_generateMirrorimage_GivenAWordAsInput_ShouldReturnMirrorImage() {
		String s="EARTH";
		String result=mirrorimage.getImage(s);
		assertEquals("EARTH|HTRAE",result);
	
	}

}
