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
public class Customer {
	
	private String name;
	private int age;
	
	public Customer(String na, int ag) {
		name = na;
		age = ag;
	}
	
	public Customer(Customer c) {
		name = c.getName();
		age = c.getAge();
	}
	
	public String toString() {
		return name + ", " + age + "y/o";
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String na) {
		name = na;
	}
	
	public void setAge(int ag) {
		age = ag;
	}

}
