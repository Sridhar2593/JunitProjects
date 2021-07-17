package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
	}
	
	@Test
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrome("sridhar"));
	}

}
