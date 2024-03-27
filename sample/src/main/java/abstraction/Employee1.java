package abstraction;

public abstract class Employee1 {
	
	
	public abstract void calculatesalary(int sal,float time);
	
	
	public void Fulltime(int salary) {
		int cloc=8;
		System.out.println(" salary of full time employee");
		
		System.out.println("salary of full time employee is"+salary*cloc);
		
	}

}
