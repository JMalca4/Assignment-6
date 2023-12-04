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

import java.util.ArrayList;

public class BevShop implements BevShopInterface{
	private int numOfAlcoholInOrder;
	private int currentOrderIndex;
	private ArrayList<Order> orders;
	
	public BevShop() {
		orders = new ArrayList<>();
	}
	
	public String toString() {
		String s = "Monthly Orders\n";
		
		for (Order o : orders) {
			s += o.toString();
		}
		
		s += "Total Sale: " + totalMonthlySale();
		
		return s;
	}
	
	public boolean isValidTime(int time) {
		if (time >= MIN_TIME && time <= MAX_TIME)
			return true;
		
		else
			return false;
	}
	
	public boolean isValidAge(int age) {
		if (age >= MIN_AGE_FOR_ALCOHOL) 
			return true;
		
		else 
			return false;
		
	}
	
	public boolean isEligibleForMore() {
		if (numOfAlcoholInOrder < 3)
			return true;
		
		else 
			return false;
		
	}
	
	public boolean isMaxFruit(int numOfFruit) {
		if(numOfFruit > MAX_FRUIT) 
			return true;
		
		else 
			return false;
		
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Customer customer = new Customer(customerName, customerAge);
		Order order = new Order(time, day, customer);
		orders.add(order);
		currentOrderIndex = orders.indexOf(order);
		numOfAlcoholInOrder = 0;
	}
	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	public void processAlcoholOrder(String bevName, Size size) {
		orders.get(currentOrderIndex).addNewBeverage(bevName, size);
		numOfAlcoholInOrder++;
	}
	
	public int findOrder(int orderNo) {
		for (int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderNum() == orderNo) {
				return i;
			}
		}
		
		return -1;
	}
	
	public double totalOrderPrice(int orderNo) {
		double orderSale = 0;
		
		for(Order o : orders) {
			if(o.getOrderNum() == orderNo) {
				for (Beverage b : o.getBeverages()) {
					orderSale += b.calcPrice();
				}
			}
		}
		
		return orderSale;
	}
	
	public double totalMonthlySale() {
		double totalSale = 0;
		for(Order o : orders) {
			for (Beverage b : o.getBeverages()) {
				totalSale += b.calcPrice();
			}
		}
		
		return totalSale;
	}
	
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}
	
	public void sortOrders() {
		for (int i = 0; i < orders.size() - 1; i++) {
			int minOrderNumIndex = i;
			for(int j = i + 1; j < orders.size(); j++) {
				if (orders.get(j).getOrderNum() < orders.get(minOrderNumIndex).getOrderNum()) {
					minOrderNumIndex = j;
				}
			}
			
			Order temp = orders.get(minOrderNumIndex);
			orders.set(minOrderNumIndex, orders.get(i));
			orders.set(i, temp);
		}
		
	}
	
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	public Order getCurrentOrder() {
		return orders.get(currentOrderIndex);
	}
	
	public int getNumOfAlcoholDrink() {
		return numOfAlcoholInOrder;
	}
	
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}

	
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}

	

	

	

	

	

}
