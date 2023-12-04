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

class SmoothieTestStudent {

	@Before
	void setUp() throws Exception {
		
		Smoothie smoothie1 = new Smoothie("Pina", Size.LARGE, 4, false);
	}

	@After
	void tearDown() throws Exception {
	}

	@Test
	public void testCalcPrice() {
		Smoothie smoothie1 = new Smoothie("Pina", Size.LARGE, 4, false);
		assertEquals(6.0,smoothie1.calcPrice());
	}
	
	@Test
	public void testEquals() {
		Smoothie smoothie1 = new Smoothie("Pina", Size.LARGE, 4, false);
		assertTrue(smoothie1.equals(smoothie1));
	}

}
