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

class AlcoholTestStudent {
	Alcohol alcohol1, alcohol2;
	@Before
	void setUp() throws Exception {
		
		alcohol1 = new Alcohol("Pilsen", Size.SMALL, false);
		alcohol2 = new Alcohol("bud light", Size.MEDIUM, false);
	}

	@After
	void tearDown() throws Exception {
		alcohol1 = alcohol2 = null;
	}

	
	@Test
	public void testCalcPrice() {
		alcohol2 = new Alcohol("bud light", Size.MEDIUM, false);
		assertEquals(3.0,alcohol2.calcPrice());
	}
	
	@Test
	public void testEquals() {
		Alcohol alcohol3 = new Alcohol("Stella", Size.MEDIUM, true);
		assertTrue(alcohol3.equals(alcohol3));
	}

}
