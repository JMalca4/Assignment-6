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
public class Smoothie extends Beverage{
	private int numOfFruits;
	private boolean addProtein;
	private final double FRUIT_COST = 0.5;
	private final double PROTEIN_COST = 1.5;
	
	
	public Smoothie(String na, Size si, int fruits, boolean pro) {
		super(na, Type.SMOOTHIE, si);
		numOfFruits = fruits;
		addProtein = pro;
	}
	
	
	public String toString() {
		String s = getBevName() + ", " + getSize() + " " + numOfFruits + " Fruits";
		
		if (addProtein) 
			s += " Protein powder";
		
		s += ", $" + calcPrice();
		
		return s;
		
	}
	
	public boolean equals(Smoothie s) {
		if (super.equals(s) && numOfFruits == s.getNumOfFruits() && addProtein == getAddProtein())
			return true;
		
		else
			return false;
	}
	
	public double calcPrice() {
		double price = super.getBasePrice();
		
		if(super.getSize() == Size.MEDIUM)
			price += super.getSizePrice();
		
		else if (super.getSize() == Size.LARGE)
			price += 2 * super.getSizePrice();
		
		price += numOfFruits * FRUIT_COST;
		
		if(addProtein)
			price += PROTEIN_COST;
		
		return price;
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	
	public boolean getAddProtein() {
		return addProtein;
	}
	
	public double getFruitCost() {
		return FRUIT_COST;
	}
	
	public double getProteinCost() {
		return PROTEIN_COST;
	}
	
	public void setNumOfFruits(int fruits) {
		numOfFruits = fruits;
	}
	
	public void setProteinPowder(boolean pro) {
		addProtein = pro;
	}
}
