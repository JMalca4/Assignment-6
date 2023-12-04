/*
 * Class: CMSC203 
 * Instructor: Professer Kuijt
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: ____James Malca______
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;

class CustomerTestStudent {

	@Before
	void setUp() throws Exception {
		
	}

	@After
	void tearDown() throws Exception {
	}

	@Test
	public void testString() {
		Customer customer1 = new Customer("Piper", 23);
		assertEquals("Piper, 23y/o",customer1.toString());
	}
	@Test
	public void testGetName() {
		Customer customer2 = new Customer("Julie", 25);
		assertEquals("Julie",customer2.getName());
	}

	
	
	

}
