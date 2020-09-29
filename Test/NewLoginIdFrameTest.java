package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controller.NewLoginIdFrame;

class NewLoginIdFrameTest {
	NewLoginIdFrame n;

	@BeforeEach
	void setUp() throws Exception {
		n = new NewLoginIdFrame();
	}
	
	
	//@Test
	//void testIsUsernameValid() {
		//String s = "adm";
		//Boolean ans = false;
		//Boolean val = n.isUsernameValid();
		//assertEquals(ans,val);
		
	//}

	//@Test
	//void testIsStrongPassword() {
		//String p = "pass";
		//Boolean ans = false;
		//Boolean val = n.isUsernameValid();
		//assertEquals(ans,val);
		
	//}
	
	@Test
	void testContainsUppercase() {
		boolean ans = true;
		boolean val;
		val = n.containsUppercase("Abc");
		assertEquals(ans,val);
		
	}
	
	@Test 
	void testContainsLowercase() {
		boolean ans = true;
		boolean val;
		val = n.containsLowercase("Abc");
		assertEquals(ans,val);
    }
	
	@Test
	void testContainsNumbers() {
		boolean ans = true;
		boolean val;
		val = n.containsNumbers("Abc123");
		assertEquals(ans,val);
		
	}
}
