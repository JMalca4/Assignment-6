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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

	@Before
	void setUp() throws Exception {
		Coffee coffee1 = new Coffee("Black", Size.MEDIUM, false, false);
	}

	@After
	void tearDown() throws Exception {
	}

	@Test
	void testCalcPrice() {
		Coffee coffee1 = new Coffee("Black", Size.MEDIUM, false, false);
		
		assertEquals(3.0,coffee1.calcPrice());
	}
	@Test
	public void testEquals() {
		Coffee coffee1 = new Coffee("Black", Size.MEDIUM, false, false);
		assertTrue(coffee1.equals(coffee1));
	}

}
