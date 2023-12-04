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
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
	
	private int orderNum;
	private int orderTime;
	private Day orderDay;
	private Customer customer;
	private ArrayList<Beverage> beverages;
	
	public Order(int ordTim, Day ordDay, Customer cus) {
		orderNum = genOrderNum();
		orderTime = ordTim;
		orderDay = ordDay;
		customer = cus;
		beverages = new ArrayList<>();
	}
	
	public int genOrderNum() {
		Random rand = new Random();
		
		int randInt = rand.nextInt(90_000 - 10_000) + 10_000;
		
		return randInt;
	}
	
	public String toString() {
		String s = "____________________________________\n" + orderDay.toString() + ", " + orderTime + "\n" + customer.toString() + " Order Num: " + orderNum;
		
		for(Beverage b : beverages) {
			s += "\n" + b.toString();
			
		}
		
		s += "\nOrder Total: $" + calcOrderTotal();
		
		return s;
	}
	
	public boolean isWeekend() {
		if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) 
			return true;
		
		else
			return false;
		
	}
	
	public Beverage getBeverage(int itemNum) {
		return beverages.get(itemNum);
	}
	
	public int compareTo1(Order o) {
		if(orderNum == o.getOrderNum())
			return 0;
		
		else if (orderNum > o.getOrderNum())
			return 1;
		
		else 
			return -1;
	}
	
	public  double calcOrderTotal() {
		double orderTotal = 0;
		
		for (Beverage b : beverages) {
			orderTotal += b.calcPrice();
		}
		
		return orderTotal;
	}
	
	public int findNumOfBeveType(Type type) {
		int count = 0;
		
		for (Beverage b : beverages) {
			if(b.getType() == type)
				count++;
		}
		
		return count;
	}
	
	public int getTotalItems() {
		return beverages.size();
	}
	
	
	public void addNewBeverage(String name, Size size, boolean extraShot, boolean extraSyrup) {
		Coffee c = new Coffee(name, size, extraShot, extraSyrup);
		beverages.add(c);
	}
	
	public void addNewBeverage(String name, Size size, int numOfFruits, boolean proteinPowder) {
		Smoothie s = new Smoothie(name, size, numOfFruits, proteinPowder);
		beverages.add(s);
	}
	
	public void addNewBeverage(String name, Size size) {
		boolean isWeekend = false;
		
		if(orderDay == Day.SATURDAY || orderDay == Day.SUNDAY)
			isWeekend = true;
		
		Alcohol a = new Alcohol(name, size, isWeekend);
		beverages.add(a);
	}
	
	public int getOrderNum() {
		return orderNum;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public Day getOrderDay() {
		return orderDay;
	}
	
	public Customer getCustomer() {
		return new Customer(customer);
	}
	
	public ArrayList<Beverage> getBeverages(){
		return beverages;
	}
	
	public void setOrderNum(int on) {
		orderNum = on;
	}
	
	public void setOrderTime(int ot) {
		orderTime = ot;
	}
	
	public void setOrderDay( Day od) {
		orderDay = od;
	}
	
	public void setCustomer(Customer c) {
		customer = c;
	}
	
	public int compareTo2(Order arg0) {
		return 0;
	}

	@Override
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
