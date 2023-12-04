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
public class Coffee extends Beverage{ //extends Beverage{
	private boolean extraShot;
	private boolean extraSyrup;
	private final double SHOT_COST = 0.5;
	private final double SYRUP_COST = 0.5;
	
	public Coffee(String na, Size si, boolean sh, boolean sy) {
		super(na,Type.COFFEE,si);
		extraShot = sh;
		extraSyrup = sy;
	}
	
	public String toString() {
		String s = getBevName() +", " + getSize();
		
		if (extraShot) 
			s += " Extra shot";
		
		if (extraSyrup)
			s += " Extra syrup";
		
		s += ", $" + calcPrice();
		
		return s;
		
	}
	
	public  double calcPrice() {
		double price = super.getBasePrice();
		
		if (super.getSize() == Size.MEDIUM) 
			price += super.getSizePrice();
		
		else if (super.getSize() == Size.LARGE)
			price += 2 * super.getSizePrice();
		
		if (extraShot)
			price += SHOT_COST;
		
		if (extraSyrup)
			price += SYRUP_COST;
		
		return price;
	}
	
	public boolean equals(Coffee c) {
		if (super.equals(c) && extraShot == c.getExtraShot() && extraSyrup == c.getExtraSyrup())
			return true;
		
		else
			return false;
					
	}
	
	public boolean getExtraShot() {
		return extraShot;
	}
	
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	
	public double getShotCost() {
		return SHOT_COST;
	}
	
	public double getSyrupCost() {
		return SYRUP_COST;
	}
	
	public void setExtraShot(boolean sh) {
		extraShot = sh;
	}
	
	public void setExtraSyrup(boolean sy) {
		extraSyrup = sy;
	}

	

}
