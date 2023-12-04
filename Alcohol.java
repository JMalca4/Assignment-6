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
public class Alcohol extends Beverage{
	private boolean isWeekend;
	private final double WEEKEND_FEE = 0.6;
	
	
	public Alcohol(String na, Size si, boolean iweekend) {
		super(na, Type.ALCOHOL, si);
		isWeekend = iweekend;
	}
	
	public String toString() {
		String s = getBevName() + ", " + getSize();
		
		if(isWeekend)
			s += " Weekend";
		
		s += ", $" + calcPrice();
		
		return s;
	}
	
	public boolean equals(Alcohol a) {
		if(super.equals(a) && isWeekend == a.getIsWeekend())
			return true;
		
		else
			return false;
					
	}
	
	public double calcPrice() {
		double price = super.getBasePrice();
		
		if(super.getSize() == Size.MEDIUM)
			price += super.getSizePrice();
		
		else if(super.getSize() == Size.LARGE)
			price += 2 * super.getSizePrice();
		
		if(isWeekend)
			price += WEEKEND_FEE;
		
		return price;
	}
	
	public boolean getIsWeekend() {
		return isWeekend;
	}
	
	public double getWeekendFee() {
		return WEEKEND_FEE;
	}
	
	public void setIsWeekend(boolean isW) {
		isWeekend = isW;
	}

}
