package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionExamples {
	
	@Test
	public void test1() {
		
		String expected = "Hi There";
		String actual = "Hi There";
		
		//Assertions.assertEquals(expected, actual);
		
		assertEquals(expected, actual);//Static Assertion
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		assertArrayEquals(expectedArray, resultArray);
		
		boolean flag = true;
		
		assertTrue(flag);
	}

}
