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

class BevShopTestStudent {

	

	@Before
	void setUp() throws Exception {
		
	}

	@After
	void tearDown() throws Exception {
	}

	@Test
	public void testIsValidTime() {
		BevShop bevshop = new BevShop();
		
		bevshop.startNewOrder(12, Day.MONDAY, "Charles", 4);
		
		assertTrue(bevshop.isValidTime(12));
	}
	
	@Test
	public void testIsValidAge() {
		BevShop bevshop = new BevShop();
		
		bevshop.startNewOrder(12, Day.MONDAY, "Charles", 22);
		
		assertTrue(bevshop.isValidAge(22));
	}
	
	@Test
	public void testIsEligible() {
		BevShop bevshop = new BevShop();
		
		bevshop.startNewOrder(12, Day.MONDAY, "Charles", 22);
		
		bevshop.processAlcoholOrder("Coors", Size.SMALL);
		
		assertTrue(bevshop.isEligibleForMore());
	}
	
	public void testIsMaxFruit() {
		BevShop bevshop = new BevShop();
		
		bevshop.startNewOrder(12, Day.MONDAY, "Charles", 22);
		
		bevshop.processSmoothieOrder("Pina", Size.SMALL, 5, false);
		
	
		
		assertTrue(bevshop.isMaxFruit(5));
		
	}

}
