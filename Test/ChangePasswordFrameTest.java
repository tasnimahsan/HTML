package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controller.ChangePasswordFrame;

class ChangePasswordFrameTest {
	ChangePasswordFrame cp;
	@BeforeEach
	void setUp() throws Exception {
		cp = new ChangePasswordFrame("admin");
	}

	@Test
	void testIsStrongPassword() {
		boolean ans = false;
		boolean val;
		val = cp.isStrongPassword("123");
		assertEquals(ans,val);
	}
	
	@Test
	void testContainsUppercase() {
		boolean ans = true;
		boolean val;
		val = cp.containsUppercase("Abc");
		assertEquals(ans,val);
		
	}
	
	@Test 
	void testContainsLowercase() {
		boolean ans = true;
		boolean val;
		val = cp.containsLowercase("Abc");
		assertEquals(ans,val);
    }
	
	@Test
	void testContainsNumbers() {
		boolean ans = true;
		boolean val;
		val = cp.containsNumbers("Abc123");
		assertEquals(ans,val);
		
	}
	

}
