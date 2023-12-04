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

class DayTestStudent {


	@Before
	void setUp() throws Exception {
	}

	@After
	void tearDown() throws Exception {
	}

	@Test
	void testDay() {
		assertEquals(Day.MONDAY, Day.MONDAY);
		assertEquals(Day.TUESDAY, Day.TUESDAY);
		assertEquals(Day.WEDNESDAY, Day.WEDNESDAY);
		assertEquals(Day.THURSDAY, Day.THURSDAY);
		assertEquals(Day.FRIDAY, Day.FRIDAY);
		assertEquals(Day.SATURDAY, Day.SATURDAY);
		assertEquals(Day.SUNDAY, Day.SUNDAY);
		
		
	}

}
