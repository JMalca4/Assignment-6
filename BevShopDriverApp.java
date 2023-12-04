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


import java.util.Scanner;

public class BevShopDriverApp {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("The current order in process can have at most " + BevShopInterface.MAX_ORDER_FOR_ALCOHOL + " alcoholic beverages.");
		
		System.out.println("The minimum age to order alcohol is " + BevShopInterface.MIN_AGE_FOR_ALCOHOL);
		
		System.out.println("Start please a new order");
		
		System.out.println("Your Total Order is 0.0");
		
		System.out.print("Would you please enter your name: ");
		
		String name = input.nextLine();
		
		System.out.print("Would you please enter your age: ");
		
		int age = input.nextInt();
		
		
		BevShop bevshop = new BevShop();
		
		bevshop.startNewOrder(12, Day.MONDAY, name, age);
		
		if(bevshop.isValidAge(age))
			System.out.println("Your age is above 20 and you are eligible to order alcohol");
		else
			System.out.println("Your age is below 21 and you are not eligible to order alcohol");
		
		System.out.println("Would you please add an alcohol drink ");
		
		
		bevshop.processAlcoholOrder(name, Size.MEDIUM);
		
		System.out.println("The current order of drinks is " +  bevshop.getCurrentOrder().getTotalItems());
		
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		
		if(bevshop.isEligibleForMore())
			System.out.println("Your current alcohol drink order is less than 4");
		else
			System.out.println("You have a maximum alcohol drinks for this order");
		
		System.out.println("Would you please add another alcohol drink");
		
		
		bevshop.processAlcoholOrder(name, Size.MEDIUM);
		
		System.out.println("The current order of drinks is " +  bevshop.getCurrentOrder().getTotalItems());
		
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		
		if(bevshop.isEligibleForMore())
			System.out.println("Your current alcohol drink order is less than 4");
		else
			System.out.println("You have a maximum alcohol drinks for this order");
		
		
		bevshop.processAlcoholOrder(name, Size.MEDIUM);
		
		System.out.println("The current order of drinks is " +  bevshop.getCurrentOrder().getTotalItems());
		
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		
		if(bevshop.isEligibleForMore())
			System.out.println("Your current alcohol drink order is less than 4");
		else
			System.out.println("You have a maximum alcohol drinks for this order");
		
		System.out.println("Would you please add a COFFEE to your order");
		
		bevshop.processCoffeeOrder("Jason",Size.MEDIUM,false, false);
		
		System.out.println("The current order of drinks is " +  bevshop.getCurrentOrder().getTotalItems());
		
		System.out.println("The Total price on the Order is " + bevshop.getCurrentOrder().calcOrderTotal());
		
		System.out.println(bevshop.getCurrentOrder());
		
		
		
		
		
	}

}
