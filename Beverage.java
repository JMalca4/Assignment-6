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
public abstract class Beverage {
	private String name;
	private Type type;
	private Size size;
	private final double BASE_PRICE = 2.0;
	private final double SIZE_PRICE = 1.0;
	
	public Beverage(String na, Type ty, Size si) {
		name = na;
		type = ty;
		size = si;
		
	}
	
	public abstract double calcPrice();
	
	public String toString() {
		return name + ", " + size;
	}
	public boolean equals(Beverage bev) {
		if (name.equals(bev.getBevName()) && type == bev.getType() && size == bev.getSize()) 
			return true;
		else
			return false;
		
	}
	
	public String getBevName() {
		return name;
	}
	
	public Type getType() {
		return type;
	}
	
	public Size getSize() {
		return size;
	}
	
	public double getBasePrice() {
		return BASE_PRICE;
	}
	
	public double getSizePrice() {
		return SIZE_PRICE;
	}
	
	public void setName(String na) {
		name = na;
	}
	
	public void setType(Type ty) {
		type = ty;
	}
	
	public void setSize(Size si) {
		size = si;
	}
}
