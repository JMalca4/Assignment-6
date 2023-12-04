
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

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderTestStudent {
	Order orderOne, orderTwo, orderThree, orderFour;

	@Before
	public void setUp() throws Exception {
		orderOne = new Order(8, Day.MONDAY, new Customer("James", 22));
		orderTwo = new Order(12, Day.SATURDAY, new Customer("Jerry", 45));
		orderThree = new Order(10, Day.SUNDAY, new Customer("Bob", 21));
	}

	@After
	public void tearDown() throws Exception {
		orderOne = orderTwo = orderThree = null;
	}

	@Test
	public void testGetBeverage() {
		Coffee cf = new Coffee("black Coffee", Size.MEDIUM, false, false);
		Alcohol al = new Alcohol("Mahito", Size.SMALL, false);
		Smoothie sm1 = new Smoothie("Change", Size.MEDIUM, 1, false);
		Smoothie sm2 = new Smoothie("Cloud", Size.LARGE, 1, false);

		orderOne.addNewBeverage("black Coffee", Size.MEDIUM, false, false);
		orderOne.addNewBeverage("Mahito", Size.SMALL);
		orderOne.addNewBeverage("Change", Size.MEDIUM, 1, false);
		assertTrue(orderOne.getBeverage(0).equals(cf));
		assertTrue(orderOne.getBeverage(1).equals(al));
		assertTrue(orderOne.getBeverage(2).equals(sm1));
		assertFalse(orderOne.getBeverage(2).equals(sm2));
	}

	@Test
	public void testAddNewBeverage() throws NullPointerException {

		assertTrue(orderOne.getTotalItems() == 0);
		orderOne.addNewBeverage("black coffee", Size.MEDIUM, false, false);
		assertTrue(orderOne.getBeverage(0).getType().equals(Type.COFFEE));
		orderOne.addNewBeverage("Mahito", Size.LARGE);
		assertTrue(orderOne.getBeverage(1).getType().equals(Type.ALCOHOL));
		orderOne.addNewBeverage("Change", Size.SMALL, 1, false);
		assertTrue(orderOne.getBeverage(2).getType().equals(Type.SMOOTHIE));
		assertTrue(orderOne.getTotalItems() == 3);

		orderTwo.addNewBeverage("Change", Size.MEDIUM, 4, true);
		assertTrue(orderTwo.getBeverage(0).getType().equals(Type.SMOOTHIE));
		orderTwo.addNewBeverage("Mahito", Size.SMALL);
		assertTrue(orderTwo.getBeverage(1).getType().equals(Type.ALCOHOL));
		orderTwo.addNewBeverage("black Coffee", Size.MEDIUM, true, false);
		assertTrue(orderTwo.getBeverage(2).getType().equals(Type.COFFEE));
		assertTrue(orderTwo.getTotalItems() == 3);

	}

	@Test
	public void testCalcOrderTotal() {
		orderOne.addNewBeverage("black Coffee", Size.SMALL, false, false);
		orderOne.addNewBeverage("Mahito", Size.SMALL);
		orderOne.addNewBeverage("Change", Size.MEDIUM, 1, false);

		assertEquals(7.5, orderOne.calcOrderTotal(), .01);

		orderTwo.addNewBeverage("black Coffee", Size.MEDIUM, true, false);
		orderTwo.addNewBeverage("Mahito", Size.SMALL);
		orderTwo.addNewBeverage("Change", Size.MEDIUM, 4, true);

		assertEquals(12.6, orderTwo.calcOrderTotal(), .01);

	}

}
